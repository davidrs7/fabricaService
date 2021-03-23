package com.Inventarios.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventarios.springboot.Repository.Inv_InventarioRepository;
import com.Inventarios.springboot.exception.ResourceNotFoundException;
import com.Inventarios.springboot.model.Inv_Inventario;

@Service
@Transactional
public class Inv_InventarioServiceImpl implements Inv_InventarioService {

	@Autowired
	private Inv_InventarioRepository inv_InventarioRepository ;

	@Override
	public Inv_Inventario createInventario(Inv_Inventario Inventario) {
		// TODO Auto-generated method stub
		return inv_InventarioRepository.save(Inventario);
	}

	@Override
	public Inv_Inventario UpdateInventario(Inv_Inventario Inventario) {
		// TODO Auto-generated method stub
		Optional<Inv_Inventario> InventarioDb = this.inv_InventarioRepository.findById(Inventario.getInventario_codigo());
		
		if (InventarioDb.isPresent()) {
			Inv_Inventario InventarioUpdate =  InventarioDb.get();
			InventarioUpdate.setInventario_codigo(Inventario.getInventario_codigo());
			InventarioUpdate.setCantidad(Inventario.getCantidad());
			InventarioUpdate.setColor_codigo(Inventario.getColor_codigo());
			InventarioUpdate.setTalla_codigo(Inventario.getTalla_codigo());
			InventarioUpdate.setRef_codigo(Inventario.getRef_codigo());
		     inv_InventarioRepository.save(InventarioUpdate);
		     return InventarioUpdate;
		}else {
			throw new ResourceNotFoundException("No se encontro el Inventario: " +  Inventario.getInventario_codigo()); 
		}
		 
	}

	@Override
	public List<Inv_Inventario> getAllInventario() {
		// TODO Auto-generated method stub
		return this.inv_InventarioRepository.findAll() ;
	}

	@Override
	public Inv_Inventario getInventariobyId(long Inventario_codigo) {
  	Optional<Inv_Inventario> InventarioDb = this.inv_InventarioRepository.findById(Inventario_codigo);
		
		if (InventarioDb.isPresent()) {
			return InventarioDb.get();
			
		}else {
			throw new ResourceNotFoundException("No se encontro la Inventario: " +  Inventario_codigo); 
		}
		 
	}

	@Override
	public void deleteInventario(long Inventario_codigo) {
		// TODO Auto-generated method stub
		
	  	Optional<Inv_Inventario> InventarioDb = this.inv_InventarioRepository.findById(Inventario_codigo);
		
			if (InventarioDb.isPresent()) {
				  this.inv_InventarioRepository.delete(InventarioDb.get());
				
			}else {
				throw new ResourceNotFoundException("No se encontro la Inventario: " +  Inventario_codigo); 
			}
			  
	}
 
}
