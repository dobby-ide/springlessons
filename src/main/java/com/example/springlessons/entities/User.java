package com.example.springlessons.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//it matches the table inside the database
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

}
