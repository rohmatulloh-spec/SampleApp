package com.example.ChickenEgss.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChickenRequest {
    private Integer eggs;
    private Double price;
}
