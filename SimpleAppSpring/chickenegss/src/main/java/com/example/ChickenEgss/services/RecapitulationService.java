package com.example.ChickenEgss.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChickenEgss.dto.RecapitulationResponse;
import com.example.ChickenEgss.models.RecapitulationEggsModel;

import com.example.ChickenEgss.repositories.RecapitulationRepo;

@Service
public class RecapitulationService {
    @Autowired
    private RecapitulationRepo recapitulation;

    public RecapitulationResponse getRecapitulation() {
          List<RecapitulationEggsModel> recapitulations = recapitulation.findAll();
        Integer totalAllPrice = recapitulation.findTotalAllPrice();

        RecapitulationResponse response = new RecapitulationResponse();
        response.setRecapitulations(recapitulations);
        response.setTotalAllPrice(totalAllPrice);

        return response;
    }
}