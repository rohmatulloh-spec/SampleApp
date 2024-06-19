package com.example.swimticket.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swimticket.dto.TicketRequest;
import com.example.swimticket.models.TicketModel;
import com.example.swimticket.services.TicketService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class TicketController {
    

    @Autowired
    private TicketService ticketService;


    @GetMapping("/tickets")
    public List< TicketModel> getAllTickets() {
        return ticketService.getAllTickets();
    }
    
    @PostMapping("/ticket")
    public ResponseEntity <?> addOrderTicket(@RequestBody TicketRequest ticketRequest) {
        return ResponseEntity.created(null).body(ticketService.addOrderTicket(ticketRequest));
        
    }
    
}
