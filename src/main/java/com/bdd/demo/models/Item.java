package com.bdd.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeItem;

    private String nomItem;
    private String marque;
    private String categorie;
    private double prix;
    private int quantiteEnStock;
    private boolean cadeau;

    // Constructors, getters, and setters
}
