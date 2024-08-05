package com.example.firstProjectSB.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Session {

    @Id
    int id;
    LocalDateTime horaire;
    String salle;


    @ManyToMany(mappedBy = "sessions",targetEntity = Etudiant.class)
    List<Etudiant> etudiants;

    @ManyToOne
    Note note;

    @OneToMany(mappedBy = "session",targetEntity = Cours.class)
    List<Cours> cours;
}
