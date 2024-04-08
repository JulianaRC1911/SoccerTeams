package com.jrc.SoccerTeams.dto;


public class teamsDTO {
    
    private Long idEquipo;
    private String nombreEquipo;
    private String pais;
    private int anioFundacion;

    public teamsDTO(Long idEquipo, String nombreEquipo, String pais, int anioFundacion) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
    }
    
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
