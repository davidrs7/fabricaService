package com.Inventarios.springboot.service;
 

import java.util.List;

import com.Inventarios.springboot.model.Inv_Inventario;

public interface Inv_InventarioService {
	
	Inv_Inventario createInventario(Inv_Inventario Inventario);
	Inv_Inventario UpdateInventario(Inv_Inventario Inventario);
	List<Inv_Inventario> getAllInventario();
	Inv_Inventario getInventariobyId (long codigo_Inventario);
	void deleteInventario(long codigo_Inventario);
	 
}
