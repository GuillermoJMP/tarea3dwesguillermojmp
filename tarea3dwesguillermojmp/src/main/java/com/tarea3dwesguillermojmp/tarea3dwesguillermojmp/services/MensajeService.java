package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Mensaje;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MensajeService {

    List<Mensaje> listarMensajes();
    Optional<Mensaje> buscarPorId(Long id);
    Mensaje guardarMensaje(Mensaje mensaje);
    void eliminarMensaje(Long id);
}
