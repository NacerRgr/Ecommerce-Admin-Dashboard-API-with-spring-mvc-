package com.bdd.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bdd.demo.dto.admin.ClientDto;


public interface client_service {
    
    List<ClientDto> listClients();  
}
