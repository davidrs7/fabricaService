package com.Inventarios.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventarios.springboot.Repository.Inv_ColoresRepository;
import com.Inventarios.springboot.exception.ResourceNotFoundException;
import com.Inventarios.springboot.model.Inv_Colores;

@Service
@Transactional
public class Inv_ColoresServiceImpl implements Inv_ColoresService {

	@Autowired
	private Inv_ColoresRepository inv_ColoresRepository ;

	@Override
	public Inv_Colores createColores(Inv_Colores color) {
		// TODO Auto-generated method stub
		return inv_ColoresRepository.save(color);
	}

	@Override
	public Inv_Colores UpdateColores(Inv_Colores color) {
		// TODO Auto-generated method stub
		Optional<Inv_Colores> colorDb = this.inv_ColoresRepository.findById(color.getColor_Codigo());
		
		if (colorDb.isPresent()) {
			Inv_Colores colorUpdate =  colorDb.get();
			colorUpdate.setColor_Codigo(color.getColor_Codigo());
			colorUpdate.setColor_Descripcion(color.getColor_Descripcion());
		     inv_ColoresRepository.save(colorUpdate);
		     return colorUpdate;
		}else {
			throw new ResourceNotFoundException("No se encontro el color: " +  color.getColor_Codigo()); 
		}
		 
	}

	@Override
	public List<Inv_Colores> getAllColores() {
		// TODO Auto-generated method stub
		return this.inv_ColoresRepository.findAll() ;
	}

	@Override
	public Inv_Colores getColoresbyId(long color_codigo) {
  	Optional<Inv_Colores> colorDb = this.inv_ColoresRepository.findById(color_codigo);
		
		if (colorDb.isPresent()) {
			return colorDb.get();
			
		}else {
			throw new ResourceNotFoundException("No se encontro la color: " +  color_codigo); 
		}
		 
	}

	@Override
	public void deleteColores(long color_codigo) {
		// TODO Auto-generated method stub
		
	  	Optional<Inv_Colores> colorDb = this.inv_ColoresRepository.findById(color_codigo);
		
			if (colorDb.isPresent()) {
				  this.inv_ColoresRepository.delete(colorDb.get());
				
			}else {
				throw new ResourceNotFoundException("No se encontro la color: " +  color_codigo); 
			}
			  
	}
 
}
