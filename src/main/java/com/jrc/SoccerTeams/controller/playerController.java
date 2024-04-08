package com.jrc.SoccerTeams.controller;

import com.jrc.SoccerTeams.model.player;
import com.jrc.SoccerTeams.service.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/jugadores")
public class playerController {
    
   private static final Logger logger = LoggerFactory.getLogger(playerController.class);

    @Autowired
    private playerService jugadorService;

    @GetMapping
    public ResponseEntity<List<player>> getAllJugadores() {
        logger.info("Obteniendo todos los jugadores");
        List<player> jugadores = jugadorService.getAllJugadores();
        return new ResponseEntity<>(jugadores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<player> getJugadorById(@PathVariable Long id) {
        logger.info("Obteniendo jugador con ID: {}", id);
        player jugador = jugadorService.getJugadorById(id);
        return new ResponseEntity<>(jugador, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<player> createJugador(@RequestBody player jugador) {
        logger.info("Creando un nuevo jugador: {}", jugador);
        player createdJugador = jugadorService.createJugador(jugador);
        return new ResponseEntity<>(createdJugador, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<player> updateJugador(@PathVariable Long id, @RequestBody player jugador) {
        logger.info("Actualizando jugador con ID: {}", id);
        player updatedJugador = jugadorService.updateJugador(id, jugador);
        return new ResponseEntity<>(updatedJugador, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJugador(@PathVariable Long id) {
        logger.info("Eliminando jugador con ID: {}", id);
        jugadorService.deleteJugador(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
