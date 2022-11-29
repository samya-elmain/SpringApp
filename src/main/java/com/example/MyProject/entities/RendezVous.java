package com.example.MyProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class RendezVous {
    @Id
    private int id;
    private Date date;
    private StatusRDV status;
    private Patient patient;
    private Medecin medecin;
}
