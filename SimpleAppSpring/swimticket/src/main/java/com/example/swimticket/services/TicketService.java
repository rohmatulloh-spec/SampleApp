package com.example.swimticket.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swimticket.dto.TicketRequest;
import com.example.swimticket.models.TicketModel;
import com.example.swimticket.repositories.TicketRepository;

@Service
public class TicketService {
    
    @Autowired
    private TicketRepository ticketRepository;

    public List <TicketModel> getAllTickets() {
        return ticketRepository.findAll();
    }

    public List<TicketModel> addOrderTicket (TicketRequest ticketRequest) {
        TicketModel ticketModel = new TicketModel();
        ticketModel.setName(ticketRequest.getName());
        ticketModel.setQuantity(ticketRequest.getQuantity());
        ticketModel.setPurchaseDate(java.time.LocalDateTime.now());
        ticketRepository.save(ticketModel);
        return ticketRepository.findAll();
    }

}
