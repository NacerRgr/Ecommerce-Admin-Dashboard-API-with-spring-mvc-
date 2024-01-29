package com.bdd.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "promotion_com")
@Entity
public class PromotionCom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotionCom;

    private double pourcentage;
    private Date dateDebut;
    private Date dateFin;
    private int _rank_;

    @ManyToOne
    @JoinColumn(name = "IdConcierge")
    private Concierge concierge;

    @ManyToOne
    @JoinColumn(name = "IdCommande")
    private Commande commande;

    // Constructors, getters, and setters
}
