package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Autos;
import com.example.demo.repository.AutoRepository;
@Service
public class AutosServiceImpl implements AutosService {
	
	@Autowired
	private AutoRepository repo;

	@Override
	public void guardarAutos(Autos autos) {
		
		repo.save(autos);

	}

	@Override
	public void actualizarautos(Autos autos) {
		repo.saveAndFlush(autos);

	}

	@Override
	public void eliminarAutos(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public List<Autos> listarAutos() {
		
		return repo.findAll();
	}

	@Override
	public Autos obtenerAutosId(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

}
