package com.Inventarios.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventarios.springboot.Repository.Inv_TipidenRepository;
import com.Inventarios.springboot.exception.ResourceNotFoundException;
import com.Inventarios.springboot.model.Inv_TipIden;

@Service
@Transactional
public class Inv_TipidenServiceImpl implements Inv_TipidenService {

	@Autowired
	private Inv_TipidenRepository inv_TipidenRepository ;

	@Override
	public Inv_TipIden createTipiden(Inv_TipIden Tipiden) {
		// TODO Auto-generated method stub
		return inv_TipidenRepository.save(Tipiden);
	}

	@Override
	public Inv_TipIden UpdateTipiden(Inv_TipIden Tipiden) {
		// TODO Auto-generated method stub
		Optional<Inv_TipIden> TipidenDb = this.inv_TipidenRepository.findById(Tipiden.getTIPIDEN_CODIGO());
		
		if (TipidenDb.isPresent()) {
			Inv_TipIden TipidenUpdate =  TipidenDb.get();
			TipidenUpdate.setTIPIDEN_CODIGO(Tipiden.getTIPIDEN_CODIGO());
			TipidenUpdate.setTIPIDEN_DESCTIPCION(Tipiden.getTIPIDEN_DESCTIPCION());
		     inv_TipidenRepository.save(TipidenUpdate);
		     return TipidenUpdate;
		}else {
			throw new ResourceNotFoundException("No se encontro el Tipiden: " +  Tipiden.getTIPIDEN_CODIGO()); 
		}
		 
	}

	@Override
	public List<Inv_TipIden> getAllTipiden() {
		// TODO Auto-generated method stub
		return this.inv_TipidenRepository.findAll() ;
	}

	@Override
	public Inv_TipIden getTipidenbyId(long TIPIDEN_CODIGO) {
  	Optional<Inv_TipIden> TipidenDb = this.inv_TipidenRepository.findById(TIPIDEN_CODIGO);
		
		if (TipidenDb.isPresent()) {
			return TipidenDb.get();
			
		}else {
			throw new ResourceNotFoundException("No se encontro la Tipiden: " +  TIPIDEN_CODIGO); 
		}
		 
	}

	@Override
	public void deleteTipiden(long TIPIDEN_CODIGO) {
		// TODO Auto-generated method stub
		
	  	Optional<Inv_TipIden> tipidenDb = this.inv_TipidenRepository.findById(TIPIDEN_CODIGO);
		
			if (tipidenDb.isPresent()) {
				  this.inv_TipidenRepository.delete(tipidenDb.get());
				
			}else {
				throw new ResourceNotFoundException("No se encontro la Tipiden: " +  TIPIDEN_CODIGO); 
			}
			  
	}
 
}
