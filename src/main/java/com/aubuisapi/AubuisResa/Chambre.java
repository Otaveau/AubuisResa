package com.aubuisapi.AubuisResa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Chambre {
    @Id
        @GeneratedValue(strategy = IDENTITY)
        private Long idChambre;
        private String nomChambre;
        private int capaciteChambre;

    public Chambre() {}

    public Chambre(Long idChambre, String nomChambre, int capaciteChambre) {
        this.idChambre = idChambre;
        this.nomChambre = nomChambre;
        this.capaciteChambre = capaciteChambre;
    }

    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public String getNomChambre() {
        return nomChambre;
    }

    public void setNomChambre(String nomChambre) {
        this.nomChambre = nomChambre;
    }

    public int getCapaciteChambre() {
        return capaciteChambre;
    }

    public void setCapaciteChambre(int capaciteChambre) {
        this.capaciteChambre = capaciteChambre;
    }

}
