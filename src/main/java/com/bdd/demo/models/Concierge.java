package com.bdd.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Concierge")
public class Concierge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcierge;

    private String nom;
    private String numTel;

    @OneToMany(mappedBy = "concierge")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "concierge")
    private List<PromotionCom> promotionComs;

    @OneToMany(mappedBy = "concierge")
    private List<PromotionItem> promotionItems;
}