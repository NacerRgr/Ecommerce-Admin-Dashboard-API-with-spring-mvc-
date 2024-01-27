package com.bdd.demo.models;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livraison")
public class Livraison {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLivraison; 
    private Date dispatchedDate;
    private Date arrivalDate;
    private boolean freeDelivery;    

}
