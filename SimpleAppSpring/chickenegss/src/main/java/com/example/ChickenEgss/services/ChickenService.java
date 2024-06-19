package com.example.ChickenEgss.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChickenEgss.dto.ChickenRequest;
import com.example.ChickenEgss.models.ChickenModel;
import com.example.ChickenEgss.models.RecapitulationEggsModel;
import com.example.ChickenEgss.repositories.ChickenRepository;
import com.example.ChickenEgss.repositories.RecapitulationRepo;

@Service
public class ChickenService {
    @Autowired
    private ChickenRepository chickenRepository;

    @Autowired
    private RecapitulationRepo recapitulationRepo;
    public List<ChickenModel> getAllChickens() {
        return chickenRepository.findAll();
    }

    public ChickenModel setChickenRepository(ChickenRequest request) {
        ChickenModel chicken = new ChickenModel();
        RecapitulationEggsModel recapitulation = new RecapitulationEggsModel();
        int price = request.getPrice().intValue();
    
        recapitulation.setTotalPrice(price * request.getEggs());
    
        // First, save the chicken
        chicken.setEggs(request.getEggs());
        chicken.setDateLayEggs(LocalDateTime.now());
        ChickenModel savedChicken = chickenRepository.save(chicken);
      
        // Then set the saved chicken to the recapitulation
        recapitulation.setChicken(savedChicken);
        recapitulationRepo.save(recapitulation);
    
        return savedChicken;
    }

    
    

  
}
