package com.Inventarios.springboot.service;
 

import java.util.List;

import com.Inventarios.springboot.model.Inv_Colores;

public interface Inv_ColoresService {
	
	Inv_Colores createColores(Inv_Colores color);
	Inv_Colores UpdateColores(Inv_Colores color);
	List<Inv_Colores> getAllColores();
	Inv_Colores getColoresbyId (long codigo_color);
	void deleteColores(long codigo_color);
	 
}
