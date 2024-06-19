package com.example.reservation.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ReservationModel {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String date;

}
