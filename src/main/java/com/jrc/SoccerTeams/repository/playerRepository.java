package com.jrc.SoccerTeams.repository;

import com.jrc.SoccerTeams.model.player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface playerRepository extends JpaRepository<player, Long>{
    
}
