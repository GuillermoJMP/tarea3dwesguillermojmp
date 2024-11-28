package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plantas")
public class Planta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String codigo;

	@Column()
	private String nombreComun;

	@Column()
	private String nombreCientifico;

	public Planta() {

	}

	public Planta(Long id, String codigo, String nombreComun, String nombreCientifico) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
	}

	@Override
	public String toString() {
		return "Planta [id=" + id + ", codigo=" + codigo + ", nombreComun=" + nombreComun + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
	

}