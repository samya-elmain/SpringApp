package com.example.MyProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Consultation {
    @Id
    private int id;
    private Date dateConsultation;
    private String rapport;
    private RendezVous rendezVous;
}
