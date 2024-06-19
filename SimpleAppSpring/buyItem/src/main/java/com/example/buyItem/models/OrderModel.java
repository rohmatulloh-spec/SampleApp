package com.example.buyItem.models;


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
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemName;
    
    private Double priceOrder;

    private LocalDateTime orderDate;
}
