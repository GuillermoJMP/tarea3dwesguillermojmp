package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.servicesImpl;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Credenciales;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.CredencialesRepository;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services.CredencialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CredencialesServiceImpl implements CredencialesService {

    @Autowired
    private CredencialesRepository credencialesRepository;

    public Optional<Credenciales> buscarPorUsuario(String usuario) {
        return credencialesRepository.findAll().stream()
                .filter(c -> c.getUsuario().equals(usuario))
                .findFirst();
    }

    public Credenciales guardarCredenciales(Credenciales credenciales) {
        return credencialesRepository.save(credenciales);
    }
}
