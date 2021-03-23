package com.Inventarios.springboot.service;
 

import java.util.List;

import com.Inventarios.springboot.model.Inv_TipIden;

public interface Inv_TipidenService {
	
	Inv_TipIden createTipiden(Inv_TipIden TipIden);
	Inv_TipIden UpdateTipiden(Inv_TipIden TipIden);
	List<Inv_TipIden> getAllTipiden();
	Inv_TipIden getTipidenbyId (long codigo_tipiden);
	void deleteTipiden(long codigo_tipiden);
	 
}
