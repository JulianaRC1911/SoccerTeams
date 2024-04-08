package com.jrc.SoccerTeams.service;

import com.jrc.SoccerTeams.exception.ResourceNotFoundException;
import com.jrc.SoccerTeams.model.player;
import com.jrc.SoccerTeams.repository.playerRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class playerService {
    
    @Autowired
    private playerRepository jugadorRepository;

    public List<player> getAllJugadores() {
        return jugadorRepository.findAll();
    }

    public player getJugadorById(Long id) {
        return jugadorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Jugador no encontrado con id: " + id));
    }

    public player createJugador(player jugador) {
        return jugadorRepository.save(jugador);
    }

    public player updateJugador(Long id, player jugador) {
        if (!jugadorRepository.existsById(id)) {
            throw new NoSuchElementException("Jugador no encontrado con id: " + id);
        }
        jugador.setIdJugador(id);
        return jugadorRepository.save(jugador);
    }

    public void deleteJugador(Long id) {
        if (!jugadorRepository.existsById(id)) {
            throw new NoSuchElementException("Jugador no encontrado con id: " + id);
        }
        jugadorRepository.deleteById(id);
    }
    
}
