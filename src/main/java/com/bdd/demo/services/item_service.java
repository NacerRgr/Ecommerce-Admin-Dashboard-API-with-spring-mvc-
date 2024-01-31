package com.bdd.demo.services;

import java.util.List;

import com.bdd.demo.dto.admin.CadeauxDto;

public interface item_service {
    List<CadeauxDto> lister_items();
    void gift(Long codeItem);
    void ungift(Long codeItem);
}
