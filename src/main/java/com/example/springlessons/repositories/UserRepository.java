package com.example.springlessons.repositories;

import com.example.springlessons.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
//the UserRepository runs sql
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("""
    SELECT u FROM User u where u.username = :username
            """)
    Optional<User> findUserByUsername(String username);
}
