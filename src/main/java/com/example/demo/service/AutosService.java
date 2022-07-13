package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Autos;


public interface AutosService {
	
	void guardarAutos (Autos autos);
	void actualizarautos (Autos autos);
	void eliminarAutos(Integer id);
	List<Autos> listarAutos();
	Autos obtenerAutosId(Integer id);
	

}
