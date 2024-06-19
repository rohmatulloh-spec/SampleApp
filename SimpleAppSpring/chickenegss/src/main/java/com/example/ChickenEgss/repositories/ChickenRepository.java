package com.example.ChickenEgss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ChickenEgss.models.ChickenModel;

public interface ChickenRepository  extends JpaRepository<ChickenModel, Long>{
    
}
