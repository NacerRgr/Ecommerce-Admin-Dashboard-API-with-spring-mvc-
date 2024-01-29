package com.bdd.demo.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ClientDto {
    private Long id;
    private String nom;    
    private String email;
    private String phone;
    private String facebook;
}
