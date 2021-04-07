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

import com.Inventarios.springboot.model.Inv_Inventario;
import com.Inventarios.springboot.service.Inv_InventarioService;

@RestController
public class Inv_InventarioController {

	
	@Autowired
	private Inv_InventarioService Inventarioervice;
	
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/Inventario")
	public ResponseEntity<List<Inv_Inventario>> getAllInventario(){
		return   ResponseEntity.ok().body(Inventarioervice.getAllInventario());
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/Inventario/{Inventario_codigo}")
	public ResponseEntity<Inv_Inventario> getInventariobyId(@PathVariable long Inventario_codigo){
		return   ResponseEntity.ok().body(Inventarioervice.getInventariobyId(Inventario_codigo));
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/Inventario")
	public ResponseEntity<Inv_Inventario> createInventario(@RequestBody Inv_Inventario Inventario ){
	 return	ResponseEntity.ok().body(Inventarioervice.createInventario(Inventario));
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/api/Inventario/{Inventario_codigo}")
	public ResponseEntity<Inv_Inventario> updateInventario(@PathVariable long Inventario_codigo, @RequestBody Inv_Inventario Inventario ){
		 
		Inventario.setInventario_codigo(Inventario_codigo);
		return	ResponseEntity.ok().body(Inventarioervice.UpdateInventario(Inventario));
		}
		
	@CrossOrigin(origins = "*")
	@DeleteMapping("/api/Inventario/{Inventario_codigo}")
	public HttpStatus deleteInventario(@PathVariable long Inventario_codigo ) {
		this.Inventarioervice.deleteInventario(Inventario_codigo);
		return  HttpStatus.OK;
	}
	
}
