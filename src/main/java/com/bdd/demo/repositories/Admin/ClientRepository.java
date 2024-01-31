package com.bdd.demo.repositories.Admin;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demo.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
        
        Optional<Client> findByEmail(String email);
        Optional<Client> findByPhone(String phone);
        Optional<Client> findByFacebook(String facebook);
        Optional<Client> findByInstagram(String instagram);
        Optional<Client> findByPassword(String password);
        Optional<Client> findByNomClient(String nomClient);
        Optional<Client> findByCodeClient(Long codeClient);
        Optional<Client> findByEmailAndPassword(String email, String password);
        Optional<Client> findByPhoneAndPassword(String phone, String password);
        Optional<Client> findByFacebookAndPassword(String facebook, String password);
        Optional<Client> findByInstagramAndPassword(String instagram, String password);
        Optional<Client> findByNomClientAndPassword(String nomClient, String password);

    }
