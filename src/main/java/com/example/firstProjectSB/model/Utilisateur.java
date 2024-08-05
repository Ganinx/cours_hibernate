package com.example.firstProjectSB.model;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Utilisateur {

    @Id
    int id;
    String nom;

}
