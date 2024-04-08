package com.jrc.SoccerTeams.repository;

import com.jrc.SoccerTeams.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {
    public user findByUsername(String username);
}
