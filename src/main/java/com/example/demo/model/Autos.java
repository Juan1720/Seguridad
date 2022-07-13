package com.example.demo.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="auto")
@Entity

public class Autos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAuto;
	private String marca;
	private String placa;
	
	@OneToMany(mappedBy = "auto")
	private List<Servicios> servicios = new ArrayList<>();
	
	public Integer getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(Integer idAuto) {
		this.idAuto = idAuto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	

}
