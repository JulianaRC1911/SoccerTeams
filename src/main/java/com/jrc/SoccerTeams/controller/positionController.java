package com.jrc.SoccerTeams.controller;

import com.jrc.SoccerTeams.model.position;
import com.jrc.SoccerTeams.service.positionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/posiciones")
public class positionController {
    
    private static final Logger logger = LoggerFactory.getLogger(positionController.class);
    
    @Autowired
    private positionService posicionService;

    @GetMapping
    public ResponseEntity<List<position>> getAllPosiciones() {
        logger.info("Método getAllPosiciones() invocado");
        List<position> posiciones = posicionService.getAllPosiciones();
        return new ResponseEntity<>(posiciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<position> getPosicionById(@PathVariable Long id) {
        logger.info("Método getPosicionById() invocado con id: {}", id);
        position posicion = posicionService.getPosicionById(id);
        return new ResponseEntity<>(posicion, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<position> createPosicion(@RequestBody position posicion) {
        logger.info("Método createdPosicion() invocado con posicion: {}", posicion);
        position createdPosicion = posicionService.createPosicion(posicion);
        return new ResponseEntity<>(createdPosicion, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<position> updatePosicion(@PathVariable Long id, @RequestBody position posicion) {
        logger.info("Método updatePosicion() invocado con id: {} y posicion: {}", id, posicion);
        position updatedPosicion = posicionService.updatePosicion(id, posicion);
        return new ResponseEntity<>(updatedPosicion, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePosicion(@PathVariable Long id) {
        logger.info("Método deletePosicion() invocado con id: {}", id);
        posicionService.deletePosicion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
