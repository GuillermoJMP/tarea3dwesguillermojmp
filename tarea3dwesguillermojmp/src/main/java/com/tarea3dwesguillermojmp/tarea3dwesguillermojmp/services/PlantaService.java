package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Planta;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantaService {

    @Autowired
    private PlantaRepository plantaRepository;

    public List<Planta> listarPlantas() {
        return plantaRepository.findAll();
    }

    public Optional<Planta> buscarPorId(Long id) {
        return plantaRepository.findById(id);
    }

    public Planta guardarPlanta(Planta planta) {
        return plantaRepository.save(planta);
    }

    public void eliminarPlanta(Long id) {
        plantaRepository.deleteById(id);
    }
}
