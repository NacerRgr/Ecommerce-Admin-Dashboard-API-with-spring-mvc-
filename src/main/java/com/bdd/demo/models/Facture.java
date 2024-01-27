package com.bdd.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Facture")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noFacture;

    private Date lastUpdate;
    private double fraisDeService;
    private double fraisDeLivraison;
    private double depot;
    private double remise;
    private Date dateFacture;

    @OneToOne(mappedBy = "facture")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "NoCommande")
    private Commande commande;

    // Constructors, getters, and setters
}
