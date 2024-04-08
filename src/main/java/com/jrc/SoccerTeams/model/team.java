package com.jrc.SoccerTeams.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;
   
    @NotBlank
    @Size(max = 50)
    private String nombreEquipo;
    
    @NotBlank
    @Size(max = 20)
    private String pais;
    
    @NotNull
    @PastOrPresent
    private int anioFundacion;

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }
    
}
