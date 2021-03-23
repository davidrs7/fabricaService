package com.Inventarios.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.Inventarios.springboot.Repository.Inv_VendedoresRepository;
import com.Inventarios.springboot.exception.ResourceNotFoundException;
import com.Inventarios.springboot.model.Inv_Vendedores;

@Service
@Transactional
public class Inv_VendedorServiceImpl implements Inv_VendedoresService {

	@Autowired
	private Inv_VendedoresRepository inv_VendedorRepository ;

	@Override
	public Inv_Vendedores createVendedor(Inv_Vendedores Vendedor) {
		// TODO Auto-generated method stub
		return inv_VendedorRepository.save(Vendedor);
	}

	@Override
	public Inv_Vendedores UpdateVendedor(Inv_Vendedores Vendedor) {
		// TODO Auto-generated method stub
		Optional<Inv_Vendedores> vendedorDb = this.inv_VendedorRepository.findById(Vendedor.getVENDEDOR_CODIGO());
		
		if (vendedorDb.isPresent()) {
			Inv_Vendedores vendedorUpdate =  vendedorDb.get();
			vendedorUpdate.setVENDEDOR_CODIGO(Vendedor.getVENDEDOR_CODIGO());
			vendedorUpdate.setVENDEDOR_NOMBRES(Vendedor.getVENDEDOR_NOMBRES());
			vendedorUpdate.setVENDEDOR_APELLIDOS(Vendedor.getVENDEDOR_APELLIDOS());
			vendedorUpdate.setVENDEDOR_TELEFONO(Vendedor.getVENDEDOR_TELEFONO());
			vendedorUpdate.setVENDEDOR_TIPIDEN(Vendedor.getVENDEDOR_TIPIDEN());
			vendedorUpdate.setVENDEDOR_IDENTIFICACION(Vendedor.getVENDEDOR_IDENTIFICACION());
			vendedorUpdate.setVENDEDOR_DIRECCION(Vendedor.getVENDEDOR_DIRECCION());
			vendedorUpdate.setVENDEDOR_ACTIVO(Vendedor.getVENDEDOR_ACTIVO());			
			inv_VendedorRepository.save(vendedorUpdate);
		     return vendedorUpdate;
		}else {
			throw new ResourceNotFoundException("No se encontro el Vendedor: " +  Vendedor.getVENDEDOR_CODIGO()); 
		}
		 
	}

	@Override
	public List<Inv_Vendedores> getAllVendedores() {
		// TODO Auto-generated method stub
		return this.inv_VendedorRepository.findAll() ;
	}

	@Override
	public Inv_Vendedores getVendedorbyId(long VENDEDOR_CODIGO) {
  	Optional<Inv_Vendedores> VendedorDb = this.inv_VendedorRepository.findById(VENDEDOR_CODIGO);
		
		if (VendedorDb.isPresent()) {
			return VendedorDb.get();
			
		}else {
			throw new ResourceNotFoundException("No se encontro el vendedor con código: " +  VENDEDOR_CODIGO); 
		}
		 
	}

	@Override
	public void deleteVendedor(long VENDEDOR_CODIGO) {
		// TODO Auto-generated method stub
		
	  	Optional<Inv_Vendedores> VendedorDb = this.inv_VendedorRepository.findById(VENDEDOR_CODIGO);
		
			if (VendedorDb.isPresent()) {
				  this.inv_VendedorRepository.delete(VendedorDb.get());
				
			}else {
				throw new ResourceNotFoundException("No se encontro la Vendedor: " +  VENDEDOR_CODIGO); 
			}
			  
	}
 
}
