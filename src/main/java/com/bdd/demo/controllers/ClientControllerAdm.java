package com.bdd.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.bdd.demo.dto.admin.ClientDto;
import com.bdd.demo.services.client_service;


@Controller
public class ClientControllerAdm {
    private client_service clientService;

    @Autowired  
    public ClientControllerAdm(client_service clientService) {
        this.clientService = clientService;
    }




    @GetMapping("/clients")
    public String listClients(Model model) {
        List<ClientDto> clients = clientService.listClients();
        System.out.println("clients: " + clients.size());
        model.addAttribute("clients_data", clients.size());
        return "listClients";
    
}
}