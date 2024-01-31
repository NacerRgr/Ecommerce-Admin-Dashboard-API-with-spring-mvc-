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


    @Override
    public void deleteClientById(int id) {
        clientRepository.deleteById(id);
    }


    @Override
    public ClientDto getClientById(int id) {
       Client client = clientRepository.findById(id).get();
       ClientDto clientDto =  ClientDto.builder().id(client.getCodeClient()).nom(client.getNomClient()).email(client.getEmail()).phone(client.getPhone()).facebook(client.getFacebook()).build();
         return clientDto;
    }


    @Override
    public void saveClient(ClientDto client) {
        // TODO Auto-generated method stub
        Client client_ = clientRepository.findByCodeClient(client.getId()).get();
        client_.setEmail(client.getEmail());
        client_.setFacebook(client.getFacebook());
        client_.setNomClient(client.getNom());
        client_.setPhone(client.getPhone());
        clientRepository.save(client_);

    }


  

   
    
}
