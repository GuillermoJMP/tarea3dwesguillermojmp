package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Persona;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	public List<Persona> listarPersonas() {
		return personaRepository.findAll();
	}

	public Optional<Persona> buscarPorId(Long id) {
		return personaRepository.findById(id);
	}

	public Persona guardarPersona(Persona persona) {
		return personaRepository.save(persona);
	}

	public void eliminarPersona(Long id) {
		personaRepository.deleteById(id);
	}
}
