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

import com.Inventarios.springboot.model.Inv_Tallas;
import com.Inventarios.springboot.service.Inv_TallasService;

@RestController
public class Inv_TallasController { 

	
	@Autowired
	private Inv_TallasService Tallaservice;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/Tallas")
	public ResponseEntity<List<Inv_Tallas>> getAllTallas(){
		return   ResponseEntity.ok().body(Tallaservice.getAllTallas());
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/Tallas/{Talla_codigo}")
	public ResponseEntity<Inv_Tallas> getTallabyId(@PathVariable long Talla_codigo){
		return   ResponseEntity.ok().body(Tallaservice.getTallasbyId(Talla_codigo));
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/Tallas")
	public ResponseEntity<Inv_Tallas> createTallas(@RequestBody Inv_Tallas Talla ){
	 return	ResponseEntity.ok().body(Tallaservice.createTallas(Talla));
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/api/Tallas/{Talla_codigo}")
	public ResponseEntity<Inv_Tallas> updateTallas(@PathVariable long Talla_codigo, @RequestBody Inv_Tallas Talla ){
		 
		Talla.setTalla_Codigo(Talla_codigo);
		return	ResponseEntity.ok().body(Tallaservice.UpdateTallas(Talla));
		}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/api/Tallas/{Talla_codigo}")
	public HttpStatus deleteTalla(@PathVariable long Talla_codigo ) {
		this.Tallaservice.deleteTallas(Talla_codigo);
		return  HttpStatus.OK;
	}
	
}
