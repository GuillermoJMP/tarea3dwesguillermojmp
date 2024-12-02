package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "credenciales")
public class Credenciales {

	@Column
	public long id;
	
	@Column
	private String usuario;
	
	@Column
	private String password;
	
	@OneToOne
	@JoinColumn(name = "persona_id", referencedColumnName = "id")
	private Persona persona;
	
	
	public Credenciales(){
		
	}


	public Credenciales(long id, String usuario, String password, Persona persona) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.persona = persona;
	}
	
	
}
