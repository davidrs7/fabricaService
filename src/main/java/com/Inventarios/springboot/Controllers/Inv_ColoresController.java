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

import com.Inventarios.springboot.model.Inv_Colores;
import com.Inventarios.springboot.service.Inv_ColoresService;

@RestController
public class Inv_ColoresController {

	
	@Autowired
	private Inv_ColoresService Coloreservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Colores")
	public ResponseEntity<List<Inv_Colores>> getAllColores(){
		return   ResponseEntity.ok().body(Coloreservice.getAllColores());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Colores/{color_codigo}")
	public ResponseEntity<Inv_Colores> getcolorbyId(@PathVariable long color_codigo){
		return   ResponseEntity.ok().body(Coloreservice.getColoresbyId(color_codigo));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/Colores")
	public ResponseEntity<Inv_Colores> createColores(@RequestBody Inv_Colores color ){
	 return	ResponseEntity.ok().body(Coloreservice.createColores(color));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/Colores/{color_codigo}")
	public ResponseEntity<Inv_Colores> updateColores(@PathVariable long color_codigo, @RequestBody Inv_Colores color ){
		 
		color.setColor_Codigo(color_codigo);
		return	ResponseEntity.ok().body(Coloreservice.UpdateColores(color));
		}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/Colores/{color_codigo}")
	public HttpStatus deletecolor(@PathVariable long color_codigo ) {
		this.Coloreservice.deleteColores(color_codigo);
		return  HttpStatus.OK;
	}
	
}
