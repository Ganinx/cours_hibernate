package com.example.firstProjectSB.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Enseignant extends Utilisateur{


    String departement;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(),
            inverseJoinColumns = @JoinColumn()
    )
    List<Cours> cours;


}
