package com.bdd.demo.repositories.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demo.models.Admin;

public interface AdminRepo  extends JpaRepository<Admin, Integer>{
    
}
