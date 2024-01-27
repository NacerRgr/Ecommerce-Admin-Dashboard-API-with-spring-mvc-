package com.bdd.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ContenirMePo")
public class ContenirMePo {

    @Id
    @ManyToOne
    private Points points;

    @ManyToOne
    private Membership membership;

    // Constructors, getters, and setters
}
