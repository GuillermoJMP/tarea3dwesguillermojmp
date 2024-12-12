package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Persona;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

	List<Persona> listarPersonas();
	Optional<Persona> buscarPorId(Long id);
	Persona guardarPersona(Persona persona);
	void eliminarPersona(Long id);
}
