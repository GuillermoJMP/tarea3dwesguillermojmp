package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Ejemplar;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.EjemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EjemplarService {

    List<Ejemplar> listarEjemplares();
    Optional<Ejemplar> buscarPorId(Long id);
    Ejemplar guardarEjemplar(Ejemplar ejemplar);
    void eliminarEjemplar(Long id);
}
