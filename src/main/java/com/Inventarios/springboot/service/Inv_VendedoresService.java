package com.Inventarios.springboot.service;
 

import java.util.List;

import com.Inventarios.springboot.model.Inv_Vendedores;

public interface Inv_VendedoresService {
	
	Inv_Vendedores createVendedor(Inv_Vendedores TipIden);
	Inv_Vendedores UpdateVendedor(Inv_Vendedores TipIden);
	List<Inv_Vendedores> getAllVendedores();
	Inv_Vendedores getVendedorbyId (long codigo_tipiden);
	void deleteVendedor(long codigo_tipiden);
	 
}
