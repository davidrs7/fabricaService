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
 
import com.Inventarios.springboot.model.Inv_Vendedores;
import com.Inventarios.springboot.service.Inv_VendedoresService; 

@RestController
public class Inv_VendedoresController {

	
	@Autowired
	private Inv_VendedoresService vendedoresService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/vendedores")
	public ResponseEntity<List<Inv_Vendedores>> getAllVendedores(){
		return   ResponseEntity.ok().body(vendedoresService.getAllVendedores());
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/vendedores/{vendedor_codigo}")
	public ResponseEntity<Inv_Vendedores> getVendedoresbyId(@PathVariable long vendedor_codigo){
		return   ResponseEntity.ok().body(vendedoresService.getVendedorbyId(vendedor_codigo));
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/vendedores")
	public ResponseEntity<Inv_Vendedores> createVendedor(@RequestBody Inv_Vendedores vendedor_codigo){
	 return	ResponseEntity.ok().body(vendedoresService.createVendedor(vendedor_codigo));
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/api/vendedores/{vendedor_codigo}")
	public ResponseEntity<Inv_Vendedores> updateVendedor(@PathVariable long vendedor_codigo, @RequestBody Inv_Vendedores vendedor ){
		 
		vendedor.setVENDEDOR_CODIGO(vendedor_codigo);
		return	ResponseEntity.ok().body(vendedoresService.UpdateVendedor(vendedor));
		}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/api/vendedores/{vendedor_codigo}")
	public HttpStatus deleteVendedor(@PathVariable long Tipiden_codigo ) {
		this.vendedoresService.deleteVendedor(Tipiden_codigo);
		return  HttpStatus.OK;
	}
	
}
