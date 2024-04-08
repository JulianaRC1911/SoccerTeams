package com.jrc.SoccerTeams.service;

import com.jrc.SoccerTeams.exception.ResourceNotFoundException;
import com.jrc.SoccerTeams.model.team;
import com.jrc.SoccerTeams.repository.teamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class teamService {
    
    @Autowired
    private teamRepository equipoRepository;

    public List<team> getAllEquipos() {
        return equipoRepository.findAll();
    }

    public team getEquipoById(Long id) {
        Optional<team> equipoOptional = equipoRepository.findById(id);
        if (equipoOptional.isPresent()) {
            return equipoOptional.get();
        } else {
            throw new ResourceNotFoundException("No se encontró el equipo con el ID proporcionado.");
        }
    }

    public team createEquipo(team equipo) {
        return equipoRepository.save(equipo);
    }

    public team updateEquipo(Long id, team equipo) {
        Optional<team> equipoOptional = equipoRepository.findById(id);
        if (equipoOptional.isPresent()) {
            team equipoExistente = equipoOptional.get();
            equipoExistente.setNombreEquipo(equipo.getNombreEquipo());
            equipoExistente.setPais(equipo.getPais());
            equipoExistente.setAnioFundacion(equipo.getAnioFundacion());
            return equipoRepository.save(equipoExistente);
        } else {
            throw new NoSuchElementException("No se encontró el equipo con el ID proporcionado.");
        }
    }

    public void deleteEquipo(Long id) {
        Optional<team> equipoOptional = equipoRepository.findById(id);
        if (equipoOptional.isPresent()) {
            equipoRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("No se encontró el equipo con el ID proporcionado.");
        }
    }
}

