package com.example.reservation.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReservationRequest {
    private String name;

    private String date;
}
