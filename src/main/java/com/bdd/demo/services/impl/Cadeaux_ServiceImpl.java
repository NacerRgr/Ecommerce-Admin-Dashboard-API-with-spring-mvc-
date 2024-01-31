package com.bdd.demo.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.demo.dto.admin.CadeauxDto;
import com.bdd.demo.models.Item;
import com.bdd.demo.repositories.Admin.ItemRepo;
import com.bdd.demo.services.item_service;


@Service
public class Cadeaux_ServiceImpl implements item_service{


    private ItemRepo itemRepository;


    @Autowired
    public Cadeaux_ServiceImpl(ItemRepo itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public List<CadeauxDto> lister_items() {

        List<Item> items = itemRepository.findAll();
        return items.stream().map((cadeau) -> mapToCadeauxDto(cadeau)).collect(Collectors.toList());


    }


    private CadeauxDto mapToCadeauxDto(Item item) {

        CadeauxDto cadeauxDto = CadeauxDto.builder().categorie(item.getCategorie()).nomItem(item.getNomItem()).prix(item.getPrix()).quantiteEnStock(item.getQuantiteEnStock()).imageUrl(item.getImageUrl()).cadeau(item.isCadeau()).marque(item.getMarque()).codeItem(item.getCodeItem()).build();

        return cadeauxDto;


    }


    @Override
    public void gift(Long codeItem) {

        Item item = itemRepository.findByCodeItem(codeItem);
        item.setCadeau(true);
        itemRepository.save(item);

    }


    @Override
    public void ungift(Long codeItem) {

        Item item = itemRepository.findByCodeItem(codeItem);
        item.setCadeau(false);
        itemRepository.save(item);
    }
    
}
