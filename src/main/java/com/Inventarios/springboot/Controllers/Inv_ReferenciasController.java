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

import com.Inventarios.springboot.model.Inv_Referencias;
import com.Inventarios.springboot.service.Inv_ReferenciasService;

@RestController
public class Inv_ReferenciasController {

	 
	@Autowired
	private Inv_ReferenciasService ReferenciaService;
	@CrossOrigin(origins = "*")
	@GetMapping("/api/referencias")
	public ResponseEntity<List<Inv_Referencias>> getAllReferencias(){
		return   ResponseEntity.ok().body(ReferenciaService.getAllReferencias());
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/api/referencias/{ref_cod}")
	public ResponseEntity<Inv_Referencias> getReferenciabyId(@PathVariable long ref_cod){
		return   ResponseEntity.ok().body(ReferenciaService.getReferenciasbyId(ref_cod));
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/api/referencias")
	public ResponseEntity<Inv_Referencias> createReferencias(@RequestBody Inv_Referencias Referencia ){
	 return	ResponseEntity.ok().body(ReferenciaService.createReferencias(Referencia));
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/api/referencias/{ref_cod}")
	public ResponseEntity<Inv_Referencias> updateReferencias(@PathVariable long ref_cod, @RequestBody Inv_Referencias Referencia ){
		 
		Referencia.setRef_codigo(ref_cod);
		return	ResponseEntity.ok().body(ReferenciaService.UpdateReferencias(Referencia));
		}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/api/referencias/{ref_cod}")
	public HttpStatus deleteReferencia(@PathVariable long ref_cod ) {
		this.ReferenciaService.deleteReferencias(ref_cod);
		return  HttpStatus.OK;
	}
	
}
