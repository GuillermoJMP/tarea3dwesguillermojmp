package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
