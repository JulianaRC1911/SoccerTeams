package com.jrc.SoccerTeams.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class player {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJugador;
    
    @NotBlank
    @Size(max = 50)
    private String nombre;

    @ManyToOne
    private position posicion;

    @ManyToOne
    private team equipo;

    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public position getPosicion() {
        return posicion;
    }

    public void setPosicion(position posicion) {
        this.posicion = posicion;
    }

    public team getEquipo() {
        return equipo;
    }

    public void setEquipo(team equipo) {
        this.equipo = equipo;
    }
    
}
