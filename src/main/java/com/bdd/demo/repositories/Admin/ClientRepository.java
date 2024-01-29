package com.bdd.demo.repositories.Admin;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demo.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
