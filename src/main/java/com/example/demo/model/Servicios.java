package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "servicio")
public class Servicios {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idServicios;
	private String servicios;
	
	@ManyToOne
	@JoinColumn(
			name = "id_auto",
			nullable = false,
			unique = true,
			foreignKey = 
			@ForeignKey(foreignKeyDefinition = "foreign key(id_auto) references auto(id_auto)")
			)
	private Autos auto;
	
	public Integer getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(Integer idServicios) {
		this.idServicios = idServicios;
	}
	public String getServicios() {
		return servicios;
	}
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
	
	

}
