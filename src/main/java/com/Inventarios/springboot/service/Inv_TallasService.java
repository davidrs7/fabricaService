package com.Inventarios.springboot.service;
 

import java.util.List;

import com.Inventarios.springboot.model.Inv_Tallas;

public interface Inv_TallasService {
	
	Inv_Tallas createTallas(Inv_Tallas talla);
	Inv_Tallas UpdateTallas(Inv_Tallas talla);
	List<Inv_Tallas> getAllTallas();
	Inv_Tallas getTallasbyId (long codigo_talla);
	void deleteTallas(long codigo_talla);
	 
}
