package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "planta", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Ejemplar> ejemplares = new ArrayList<>();


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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

}