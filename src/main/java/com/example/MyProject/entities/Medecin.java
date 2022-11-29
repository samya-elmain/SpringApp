package com.example.MyProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Collection;
import java.util.Date;
@Entity
public class Medecin {
    @Id
    private int id;
    private String nom;
    private String email;
    private String specialite;
    private Collection<RendezVous> rendezVous;


}
