package com.jrc.SoccerTeams.dto;


public class playerDTO {
    
    private Long idJugador;
    private String nombre;
    private String posicion;
    private Long idEquipo;

    public playerDTO(Long idJugador, String nombre, String posicion, Long idEquipo) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.posicion = posicion;
        this.idEquipo = idEquipo;
    }

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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }
    
    
}
