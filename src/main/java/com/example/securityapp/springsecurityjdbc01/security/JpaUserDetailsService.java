package com.example.securityapp.springsecurityjdbc01.security;

import com.example.securityapp.springsecurityjdbc01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username);
    }
}
