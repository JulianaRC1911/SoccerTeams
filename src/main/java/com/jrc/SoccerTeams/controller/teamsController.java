package com.jrc.SoccerTeams.controller;

import com.jrc.SoccerTeams.model.team;
import com.jrc.SoccerTeams.service.teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/equipos")
public class teamsController {
    
    private static final Logger logger = LoggerFactory.getLogger(teamsController.class);

    @Autowired
    private teamService equipoService;

    @GetMapping
    public ResponseEntity<List<team>> getAllEquipos() {
        logger.info("Método getAllEquipos() invocado");
        List<team> equipos = equipoService.getAllEquipos();
        return new ResponseEntity<>(equipos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<team> getEquipoById(@PathVariable Long id) {
        logger.info("Método getEquipoById() invocado con id: {}", id);
        team equipo = equipoService.getEquipoById(id);
        return new ResponseEntity<>(equipo, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<team> createEquipo(@RequestBody team equipo) {
        logger.info("Método createEquipo() invocado con equipo: {}", equipo);
        team createdEquipo = equipoService.createEquipo(equipo);
        return new ResponseEntity<>(createdEquipo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<team> updateEquipo(@PathVariable Long id, @RequestBody team equipo) {
        logger.info("Método updateEquipo() invocado con id: {} y equipo: {}", id, equipo);
        team updatedEquipo = equipoService.updateEquipo(id, equipo);
        return new ResponseEntity<>(updatedEquipo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEquipo(@PathVariable Long id) {
        logger.info("Método deleteEquipo() invocado con id: {}", id);
        equipoService.deleteEquipo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
