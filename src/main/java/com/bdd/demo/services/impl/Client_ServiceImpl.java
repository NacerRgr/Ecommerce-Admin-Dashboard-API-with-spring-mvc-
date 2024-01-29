package com.bdd.demo.services.impl;

import java.util.stream.Collectors;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.demo.dto.admin.ClientDto;
import com.bdd.demo.models.Client;
import com.bdd.demo.repositories.Admin.ClientRepository;
import com.bdd.demo.services.client_service;

@Service
public class Client_ServiceImpl implements client_service{


    private ClientRepository clientRepository;

    @Autowired
    public Client_ServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<ClientDto> listClients() {

        List<Client> clients = clientRepository.findAll();
        


        return clients.stream().map((club) -> mapToClientDto(club)).collect(Collectors.toList());

    }


    private ClientDto mapToClientDto(Client client) {
        
        ClientDto clientDto =  ClientDto.builder().id(client.getCodeClient()).nom(client.getNomClient()).email(client.getEmail()).phone(client.getPhone()).facebook(client.getFacebook()).build();

        return clientDto;

    }


   
    
}
