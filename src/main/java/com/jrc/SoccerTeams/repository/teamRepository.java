package com.jrc.SoccerTeams.repository;

import com.jrc.SoccerTeams.model.team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface teamRepository extends JpaRepository<team, Long>{
    
}
