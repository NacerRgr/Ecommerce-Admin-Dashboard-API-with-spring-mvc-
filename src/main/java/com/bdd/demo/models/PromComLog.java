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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PromComLog")

public class PromComLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLog;

    private String description;

    @ManyToOne
    @JoinColumn(name = "NoCommande")
    private Commande commande;

    // Constructors, getters, and setters
}

