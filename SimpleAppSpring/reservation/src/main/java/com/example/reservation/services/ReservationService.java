package com.example.reservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservation.dto.request.ReservationRequest;
import com.example.reservation.models.ReservationModel;
import com.example.reservation.repositories.ReservationRepo;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepo;


    public List<ReservationModel> getAllReservation() {
        return reservationRepo.findAll();
    }

    public ReservationModel addReservation(ReservationRequest request) throws Exception {
        String reservationDate = request.getDate();

       if (reservationDate.equalsIgnoreCase("rabu")) {
            throw new Exception("Libur");
        }
        long reservationCount = reservationRepo.countByDate(reservationDate);
        
        if (reservationCount >= 2) {
            throw new Exception("Reservations are full for this date");
        }
      
        ReservationModel reservationModel = new ReservationModel();
        reservationModel.setName(request.getName());
        reservationModel.setDate(reservationDate);
        
        return reservationRepo.save(reservationModel);
    }
}
