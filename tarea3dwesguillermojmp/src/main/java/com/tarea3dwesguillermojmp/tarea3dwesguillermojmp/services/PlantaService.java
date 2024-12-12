package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Planta;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PlantaService {

    List<Planta> listarPlantas();
    Optional<Planta> buscarPorId(Long id);
    Planta guardarPlanta(Planta planta);
    void eliminarPlanta(Long id);
}
