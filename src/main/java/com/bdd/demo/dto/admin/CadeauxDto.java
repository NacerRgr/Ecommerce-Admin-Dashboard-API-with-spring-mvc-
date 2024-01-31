package com.bdd.demo.dto.admin;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CadeauxDto {
    private String categorie;
    private String nomItem;
    private String marque;
    private double prix;
    private int quantiteEnStock;
    private boolean cadeau;
    private String imageUrl;
    private Long codeItem;
}
