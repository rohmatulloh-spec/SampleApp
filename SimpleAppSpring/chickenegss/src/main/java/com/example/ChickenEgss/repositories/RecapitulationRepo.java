package com.example.ChickenEgss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ChickenEgss.models.RecapitulationEggsModel;

public interface RecapitulationRepo extends JpaRepository<RecapitulationEggsModel, Long>{
    public RecapitulationEggsModel findByTotalPrice(Integer totalPrice);

    @Query("SELECT SUM(r.totalPrice) FROM RecapitulationEggsModel r")
    public Integer findTotalAllPrice();
}
