package com.example.ChickenEgss.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChickenEgss.dto.RecapitulationResponse;
import com.example.ChickenEgss.services.RecapitulationService;

@RestController
@RequestMapping("/recap")
public class RecapitulationController {
    
    @Autowired
    private RecapitulationService recapitulation;

    @GetMapping("/all")
    public RecapitulationResponse getALlRecapitulation() {
       
        return recapitulation.getRecapitulation();

    }
}
