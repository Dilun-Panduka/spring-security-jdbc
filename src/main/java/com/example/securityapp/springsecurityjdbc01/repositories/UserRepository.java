package com.example.securityapp.springsecurityjdbc01.repositories;

import com.example.securityapp.springsecurityjdbc01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findUserByUsername(String username);
}
