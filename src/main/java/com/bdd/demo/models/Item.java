package com.bdd.demo.models;

import groovy.transform.builder.Builder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private String imageUrl;

    // Constructors, getters, and setters
}
