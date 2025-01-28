package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Credenciales;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.CredencialesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CredencialesService {

    Optional<Credenciales> buscarPorUsuario(String usuario);
    Credenciales guardarCredenciales(Credenciales credenciales);
}
