package com.example.firstProjectSB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Note {

    @Id
    int id;
    int valeur;

    @OneToMany(mappedBy = "note",targetEntity = Etudiant.class)
    List<Etudiant> etudiants;

    @OneToMany(mappedBy = "note",targetEntity = Session.class)
    List<Session> sessions;

}
