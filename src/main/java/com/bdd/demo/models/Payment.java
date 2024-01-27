package com.bdd.demo.models;

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

import java.util.Date;

import com.bdd.demo.Enums.EnumPayment;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPayment;

    private double montant;

    @Enumerated(EnumType.STRING)
    private EnumPayment method;

    private double totalDeposit;
    private Date paymentDate;

    @ManyToOne
    @JoinColumn(name = "CodeClient")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "NoFacture")
    private Facture facture;

    // Constructors, getters, and setters
}
