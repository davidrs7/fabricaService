package com.Inventarios.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventarios.springboot.Repository.Inv_TallasRepository;
import com.Inventarios.springboot.exception.ResourceNotFoundException;
import com.Inventarios.springboot.model.Inv_Tallas;

@Service
@Transactional
public class Inv_TallasServiceImpl implements Inv_TallasService {

	@Autowired
	private Inv_TallasRepository inv_TallasRepository ;

	@Override
	public Inv_Tallas createTallas(Inv_Tallas talla) {
		// TODO Auto-generated method stub
		return inv_TallasRepository.save(talla);
	}

	@Override
	public Inv_Tallas UpdateTallas(Inv_Tallas talla) {
		// TODO Auto-generated method stub
		Optional<Inv_Tallas> tallaDb = this.inv_TallasRepository.findById(talla.getTalla_Codigo());
		
		if (tallaDb.isPresent()) {
			Inv_Tallas tallaUpdate =  tallaDb.get();
			tallaUpdate.setTalla_Codigo(talla.getTalla_Codigo());
			tallaUpdate.setTalla_descripcion(talla.getTalla_descripcion());
		     inv_TallasRepository.save(tallaUpdate);
		     return tallaUpdate;
		}else {
			throw new ResourceNotFoundException("No se encontro el talla: " +  talla.getTalla_Codigo()); 
		}
		 
	}

	@Override
	public List<Inv_Tallas> getAllTallas() {
		// TODO Auto-generated method stub
		return this.inv_TallasRepository.findAll() ;
	}

	@Override
	public Inv_Tallas getTallasbyId(long talla_codigo) {
  	Optional<Inv_Tallas> tallaDb = this.inv_TallasRepository.findById(talla_codigo);
		
		if (tallaDb.isPresent()) {
			return tallaDb.get();
			
		}else {
			throw new ResourceNotFoundException("No se encontro la talla: " +  talla_codigo); 
		}
		 
	}

	@Override
	public void deleteTallas(long talla_codigo) {
		// TODO Auto-generated method stub
		
	  	Optional<Inv_Tallas> tallaDb = this.inv_TallasRepository.findById(talla_codigo);
		
			if (tallaDb.isPresent()) {
				  this.inv_TallasRepository.delete(tallaDb.get());
				
			}else {
				throw new ResourceNotFoundException("No se encontro la talla: " +  talla_codigo); 
			}
			  
	}
 
}
