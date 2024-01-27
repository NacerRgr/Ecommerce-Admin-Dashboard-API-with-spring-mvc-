package com.bdd.demo.models;

import java.util.Date;

import com.bdd.demo.Enums.ItemStatus;

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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ContenirItCoLi")

public class ContenirItCoLi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContenir;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

    private String livraisonStatus;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "IdLivraison")
    private Livraison livraison;

    @ManyToOne
    @JoinColumn(name = "CodeItem")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "NoCommande")
    private Commande commande;


}
