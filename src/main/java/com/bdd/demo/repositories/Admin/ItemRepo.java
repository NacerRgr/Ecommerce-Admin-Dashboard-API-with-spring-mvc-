package com.bdd.demo.repositories.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demo.models.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{
    

    Item findByCodeItem(Long codeItem);
}
