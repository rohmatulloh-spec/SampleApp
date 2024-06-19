package com.example.buyItem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ItemModel {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private Long id;

    private String name;

    private double price;
}
