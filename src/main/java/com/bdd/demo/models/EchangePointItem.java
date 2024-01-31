package com.bdd.demo.models;

import org.hibernate.annotations.ManyToAny;

import com.bdd.demo.Enums.EchStatus;
import com.bdd.demo.dto.admin.ClientDto;

import java.util.List;
import groovy.transform.builder.Builder;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EchangePointItem {
    
    private int idEchg;


    @Enumerated
    private EchStatus echStatus;
}
