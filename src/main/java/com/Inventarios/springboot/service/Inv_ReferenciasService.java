package com.Inventarios.springboot.service;
 

import java.util.List;

import com.Inventarios.springboot.model.Inv_Referencias;

public interface Inv_ReferenciasService {
	
	Inv_Referencias createReferencias(Inv_Referencias referencia);
	Inv_Referencias UpdateReferencias(Inv_Referencias referencia);
	List<Inv_Referencias> getAllReferencias();
	Inv_Referencias getReferenciasbyId (long Ref_Codigo);
	void deleteReferencias(long Ref_Codigo);
	 
}
