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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PromotionItem")
public class PromotionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromotion;

    private double montant;
    private Date dateDebut;
    private Date dateFin;
    private int rank;

    @ManyToOne
    @JoinColumn(name = "IdConcierge")
    private Concierge concierge;

    @ManyToOne
    @JoinColumn(name = "IdLog")
    private PromComLog log;

    // Constructors, getters, and setters
}

