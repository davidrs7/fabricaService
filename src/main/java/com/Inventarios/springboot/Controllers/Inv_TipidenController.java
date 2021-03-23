package com.Inventarios.springboot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.Inventarios.springboot.model.Inv_TipIden;
import com.Inventarios.springboot.service.Inv_TipidenService;

@RestController
public class Inv_TipidenController {

	
	@Autowired
	private Inv_TipidenService TipidenService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Tipiden")
	public ResponseEntity<List<Inv_TipIden>> getAllTallas(){
		return   ResponseEntity.ok().body(TipidenService.getAllTipiden());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Tipiden/{Tipiden_codigo}")
	public ResponseEntity<Inv_TipIden> getTallabyId(@PathVariable long Tipiden_codigo){
		return   ResponseEntity.ok().body(TipidenService.getTipidenbyId(Tipiden_codigo));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Tipiden")
	public ResponseEntity<Inv_TipIden> createTallas(@RequestBody Inv_TipIden tipiden){
	 return	ResponseEntity.ok().body(TipidenService.createTipiden(tipiden));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/Tipiden/{Tipiden_codigo}")
	public ResponseEntity<Inv_TipIden> updateTallas(@PathVariable long Tipiden_codigo, @RequestBody Inv_TipIden tipiden ){
		 
		tipiden.setTIPIDEN_CODIGO(Tipiden_codigo);
		return	ResponseEntity.ok().body(TipidenService.UpdateTipiden(tipiden));
		}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/Tipiden/{Tipiden_codigo}")
	public HttpStatus deleteTalla(@PathVariable long Tipiden_codigo ) {
		this.TipidenService.deleteTipiden(Tipiden_codigo);
		return  HttpStatus.OK;
	}
	
}
