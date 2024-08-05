package com.example.firstProjectSB.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cours {

    @Id
    int id;
    String nom;
    int code;


    @ManyToMany(mappedBy = "cours",targetEntity = Enseignant.class)
    List<Enseignant> enseignants;

    @ManyToOne
    Session session;

}
