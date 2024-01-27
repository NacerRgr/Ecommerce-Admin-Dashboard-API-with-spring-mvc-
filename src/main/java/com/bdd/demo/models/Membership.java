package com.bdd.demo.models;

import java.util.List;

import com.bdd.demo.Enums.RankEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Membership")
public class Membership {

    @Id
    private Long idMembership;

    @Enumerated(EnumType.STRING)
    private RankEnum rank;

    @ManyToOne
    @JoinColumn(name = "CodeClient")
    private Client client;

    @OneToMany(mappedBy = "membership")
    private List<ContenirMePo> contenirMePos;

    // Constructors, getters, and setters
}
