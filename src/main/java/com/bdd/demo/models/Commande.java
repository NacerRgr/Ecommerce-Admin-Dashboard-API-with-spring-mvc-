package com.bdd.demo.models;

import java.util.Date;

import com.bdd.demo.Enums.OrderStatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.bdd.demo.models.Client;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noCommande;

    @Enumerated(EnumType.STRING)
    private OrderStatusEnum orderStatus;

    private double total;
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "IdConcierge")
    private Concierge concierge;

    @ManyToOne
    @JoinColumn(name = "CodeClient")
    private Client client;

    // Constructors, getters, and setters
}
