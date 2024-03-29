package com.bdd.demo.models;

import java.util.List;

import groovy.transform.builder.Builder;
import jakarta.persistence.Column;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodeClient")
    private Long codeClient;

    @Column(name = "NomClient")
    private String nomClient;

    private String facebook;
    private String instagram;
    private String phone;
    private String email;
    private String password;

    @OneToMany(mappedBy = "client")
    private List<Payment> payments;

    @OneToMany(mappedBy = "client")
    private List<Membership> memberships;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    public static Object builder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'builder'");
    }

    // Constructors, getters, and setters
}
