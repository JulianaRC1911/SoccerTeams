package com.jrc.SoccerTeams.service;

import com.jrc.SoccerTeams.exception.ResourceNotFoundException;
import com.jrc.SoccerTeams.model.position;
import com.jrc.SoccerTeams.repository.positionRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class positionService {
    
    @Autowired
    private positionRepository posicionRepository;

    public List<position> getAllPosiciones() {
        return posicionRepository.findAll();
    }

    public position getPosicionById(Long id) {
        return posicionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontró la posición con ID: " + id));
    }

    public position createPosicion(position posicion) {
        return posicionRepository.save(posicion);
    }

    public position updatePosicion(Long id, position posicion) {
        if (!posicionRepository.existsById(id)) {
            throw new NoSuchElementException("No se encontró la posición con ID: " + id);
        }
        posicion.setIdPosicion(id); 
        return posicionRepository.save(posicion);
    }

    public void deletePosicion(Long id) {
        if (!posicionRepository.existsById(id)) {
            throw new NoSuchElementException("No se encontró la posición con ID: " + id);
        }
        posicionRepository.deleteById(id);
    }
}
