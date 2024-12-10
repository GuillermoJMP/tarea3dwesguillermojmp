package com.tarea3dwesguillermojmp.tarea3dwesguillermojmp.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajes")
public class Mensaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechahora;

    @Column(nullable = false, length = 500)
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "ejemplar_id", referencedColumnName = "id", nullable = false)
    private Ejemplar ejemplar;

    public Mensaje() {}

    public Mensaje(Long id, LocalDateTime fechahora, String mensaje, Persona persona, Ejemplar ejemplar) {
        this.id = id;
        this.fechahora = fechahora;
        this.mensaje = mensaje;
        this.persona = persona;
        this.ejemplar = ejemplar;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechahora() {
        return fechahora;
    }

    public void setFechahora(LocalDateTime fechahora) {
        this.fechahora = fechahora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
}
