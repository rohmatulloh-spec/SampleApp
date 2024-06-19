package com.example.ChickenEgss.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChickenModel {
    
    @Id
    @GeneratedValue  (strategy = GenerationType.AUTO)
    private Long id;

    private Integer eggs;
    private LocalDateTime dateLayEggs;

   
}
