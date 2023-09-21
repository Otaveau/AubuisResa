package com.aubuisapi.AubuisResa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Reservation {

    @Id
    @GeneratedValue (strategy = IDENTITY)
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int nbPers;

    public Reservation() {}

    public Reservation(LocalDate dateDebut, LocalDate dateFin, int nbPers) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbPers = nbPers;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbPers() {
        return nbPers;
    }

    public void setNbPers(int nbPers) {
        this.nbPers = nbPers;
    }
}
