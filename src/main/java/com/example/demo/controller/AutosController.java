package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Autos;
import com.example.demo.service.AutosService;

@Controller
@RequestMapping("/auto/v1")
public class AutosController {
	
	@Autowired
	private AutosService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Autos>> listar(){
		return new ResponseEntity<List<Autos>>(service.listarAutos(), HttpStatus.OK) ;
		
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Autos autos) {
		service.guardarAutos(autos);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Autos autos = service.obtenerAutosId(id);
		if(autos != null) {
			service.eliminarAutos(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody Autos autos){
		
		Autos a = service.obtenerAutosId(autos.getIdAuto());
		if(a != null) {
			service.actualizarautos(autos);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Autos> obtenerId(@PathVariable Integer id){
		
		Autos a = service.obtenerAutosId(id);
		if(a != null) {
			return new ResponseEntity<Autos>(service.obtenerAutosId(id),HttpStatus.OK);
		}
		
		return new ResponseEntity<Autos>(HttpStatus.NOT_FOUND);
	}

	
	
	

}
