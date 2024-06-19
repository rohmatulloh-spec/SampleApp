package com.example.ChickenEgss.dto;

import java.util.List;

import com.example.ChickenEgss.models.RecapitulationEggsModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
public class RecapitulationResponse {
     private List<RecapitulationEggsModel> recapitulations;
    private Integer totalAllPrice;
}
