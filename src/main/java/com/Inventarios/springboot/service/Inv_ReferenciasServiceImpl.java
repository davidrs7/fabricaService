package com.Inventarios.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventarios.springboot.Repository.Inv_ReferenciasRepository;
import com.Inventarios.springboot.exception.ResourceNotFoundException;
import com.Inventarios.springboot.model.Inv_Referencias;

@Service
@Transactional
public class Inv_ReferenciasServiceImpl implements Inv_ReferenciasService {

	@Autowired
	private Inv_ReferenciasRepository inv_referenciasRepository ;

	@Override
	public Inv_Referencias createReferencias(Inv_Referencias referencia) {
		// TODO Auto-generated method stub
		return inv_referenciasRepository.save(referencia);
	}

	@Override
	public Inv_Referencias UpdateReferencias(Inv_Referencias referencia) {
		// TODO Auto-generated method stub
		Optional<Inv_Referencias> referenciaDb = this.inv_referenciasRepository.findById(referencia.getRef_codigo());
		
		if (referenciaDb.isPresent()) {
			Inv_Referencias referenciaUpdate =  referenciaDb.get();
			referenciaUpdate.setRef_codigo(referencia.getRef_codigo());
			referenciaUpdate.setRef_descripcion(referencia.getRef_descripcion());
		     inv_referenciasRepository.save(referenciaUpdate);
		     return referenciaUpdate;
		}else {
			throw new ResourceNotFoundException("No se encontro la referencia: " +  referencia.getRef_codigo()); 
		}
		 
	}

	@Override
	public List<Inv_Referencias> getAllReferencias() {
		// TODO Auto-generated method stub
		return this.inv_referenciasRepository.findAll() ;
	}

	@Override
	public Inv_Referencias getReferenciasbyId(long Ref_Codigo) {
  	Optional<Inv_Referencias> referenciaDb = this.inv_referenciasRepository.findById(Ref_Codigo);
		
		if (referenciaDb.isPresent()) {
			return referenciaDb.get();
			
		}else {
			throw new ResourceNotFoundException("No se encontro la referencia: " +  Ref_Codigo); 
		}
		 
	}

	@Override
	public void deleteReferencias(long Ref_Codigo) {
		// TODO Auto-generated method stub
		
	  	Optional<Inv_Referencias> referenciaDb = this.inv_referenciasRepository.findById(Ref_Codigo);
		
			if (referenciaDb.isPresent()) {
				  this.inv_referenciasRepository.delete(referenciaDb.get());
				
			}else {
				throw new ResourceNotFoundException("No se encontro la referencia: " +  Ref_Codigo); 
			}
			  
	}
 
}
