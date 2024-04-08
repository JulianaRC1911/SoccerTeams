package com.jrc.SoccerTeams.dto;


public class positionDTO {
    
    private Long idPosicion;
    private String nombrePosicion;

    public positionDTO(Long idPosicion, String nombrePosicion) {
        this.idPosicion = idPosicion;
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
    
    
    
}
