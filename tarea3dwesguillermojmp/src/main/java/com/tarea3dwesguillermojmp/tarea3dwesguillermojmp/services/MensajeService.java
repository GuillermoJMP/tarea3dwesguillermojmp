package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.services;

import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.models.Mensaje;
import com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.repositories.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    public List<Mensaje> listarMensajes() {
        return mensajeRepository.findAll();
    }

    public Optional<Mensaje> buscarPorId(Long id) {
        return mensajeRepository.findById(id);
    }

    public Mensaje guardarMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public void eliminarMensaje(Long id) {
        mensajeRepository.deleteById(id);
    }
}
