package com.example.firstProjectSB.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Etudiant extends Utilisateur{


    LocalDate dateNaissance;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(),
            inverseJoinColumns = @JoinColumn()
    )
    List<Session> sessions;

    @ManyToOne
    Note note;
}
