package com.example.ChickenEgss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChickenEgss.dto.ChickenRequest;
import com.example.ChickenEgss.models.ChickenModel;
import com.example.ChickenEgss.services.ChickenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/chicken")
public class ChickenController {
    
    @Autowired
    private ChickenService chickenService;

    @GetMapping("/eggs")
    public List<ChickenModel> getAllChickenEggs() {
        return chickenService.getAllChickens();
    }

    @PostMapping("/egg")
    public ResponseEntity<ChickenModel> createTicket(@RequestBody ChickenRequest request) {
        ChickenModel chickenModel = chickenService.setChickenRepository(request);
        return new ResponseEntity<>(chickenModel, HttpStatus.CREATED);
    }

  
}
