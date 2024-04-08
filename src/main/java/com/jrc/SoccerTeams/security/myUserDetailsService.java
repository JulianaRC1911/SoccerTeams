package com.jrc.SoccerTeams.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.jrc.SoccerTeams.model.user; 
import com.jrc.SoccerTeams.repository.userRepository;
import org.springframework.security.core.userdetails.User;

@Service
public class myUserDetailsService implements UserDetailsService {

    @Autowired
    private userRepository userRepository; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Usuario no encontrado con nombre de usuario: " + username);
        }
        
        return User.builder()
                   .username(user.getUsername())
                   .password(user.getPassword())
                   .roles("ROLE_USER") 
                   .build();
    }
}

