package com.example.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.dto.request.ReservationRequest;
import com.example.reservation.models.ReservationModel;
import com.example.reservation.services.ReservationService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("")
public class ReservationController {
    

    @Autowired
    private ReservationService reservationService;


    @GetMapping("/reservations")
    public List<ReservationModel> getAllreservation() {
        return reservationService.getAllReservation();
    }
    

    @PostMapping("/reservation")
    public ResponseEntity<?> createReservation(@RequestBody ReservationRequest request) {
        try {
            ReservationModel reservation = reservationService.addReservation(request);
            return ResponseEntity.ok(reservation);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
    
    
}
