package com.example.swimticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swimticket.models.TicketModel;

@Repository
public interface TicketRepository extends JpaRepository<TicketModel, Long>{
    
}
