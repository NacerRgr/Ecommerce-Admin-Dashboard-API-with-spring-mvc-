package com.bdd.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.bdd.demo.dto.admin.CadeauxDto;
import com.bdd.demo.services.item_service;

import org.springframework.ui.Model;

@Controller
public class CadeauxController {
    private item_service itemService;


    @Autowired
    public CadeauxController(item_service itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public String lister_items(Model model) {
        List<CadeauxDto> cadeauxDto = itemService.lister_items();
        model.addAttribute("items_data", cadeauxDto);


        return "lister_items";
    }



    @GetMapping("/gift/{codeItem}")
    public String gift(@PathVariable (value="codeItem") Long codeItem  ) {

        itemService.gift(codeItem);


        return "redirect:/items";
    }


    @GetMapping("/ungift/{codeItem}")
    public String ungift(@PathVariable (value="codeItem") Long codeItem  ) {

        itemService.ungift(codeItem);
        return "redirect:/items";
    }
}
