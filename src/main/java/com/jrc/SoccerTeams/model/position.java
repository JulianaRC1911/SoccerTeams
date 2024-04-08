package com.jrc.SoccerTeams.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosicion;

    @NotBlank
    @Size(max = 30)
    private String nombrePosicion;

    public position() {
    }

    public position(String nombrePosicion) {
        this.nombrePosicion = nombrePosicion;
    }
    
    public Long getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(Long idPosicion) {
        this.idPosicion = idPosicion;
    }

    public String getNombrePosicion() {
        return nombrePosicion;
    }

    public void setNombrePosicion(String nombrePosicion) {
        this.nombrePosicion = nombrePosicion;
    }

    // toString() para fines de depuración
    @Override
    public String toString() {
        return "Posicion{" +
                "idPosicion=" + idPosicion +
                ", nombrePosicion='" + nombrePosicion + '\'' +
                '}';
    }
}
