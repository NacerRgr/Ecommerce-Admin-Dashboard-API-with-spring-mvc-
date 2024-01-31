package com.bdd.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        model.addAttribute("clients_data", clients);
        return "listClients";
    }

    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable (value="id") int id  ) {

        clientService.deleteClientById(id);
        return "redirect:/clients";
    }

    @GetMapping("/update/{id}")
    public String updateClient(@PathVariable (value="id") int id  , Model model ) {
        ClientDto client = clientService.getClientById(id);
        model.addAttribute("client", client);
        return "update_client";
    }



    @PostMapping("/save")
    public String saveClient(@ModelAttribute("client") ClientDto client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }
}
