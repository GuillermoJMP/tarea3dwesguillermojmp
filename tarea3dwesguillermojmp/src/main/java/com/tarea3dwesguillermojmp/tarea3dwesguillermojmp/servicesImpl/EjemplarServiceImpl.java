package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.servicesImpl;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Ejemplar;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.EjemplarRepository;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.EjemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EjemplarServiceImpl implements EjemplarService {

    @Autowired
    private EjemplarRepository ejemplarRepository;

    public List<Ejemplar> listarEjemplares() {
        return ejemplarRepository.findAll();
    }

    public Optional<Ejemplar> buscarPorId(Long id) {
        return ejemplarRepository.findById(id);
    }

    public Ejemplar guardarEjemplar(Ejemplar ejemplar) {
        return ejemplarRepository.save(ejemplar);
    }

    public void eliminarEjemplar(Long id) {
        ejemplarRepository.deleteById(id);
    }
}
