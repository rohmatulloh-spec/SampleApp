package com.example.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.reservation.models.ReservationModel;

@Repository
public interface ReservationRepo extends JpaRepository<ReservationModel, Long>{
   @Query("SELECT COUNT(r) FROM ReservationModel r WHERE r.date = :date")
    long countByDate(@Param("date") String date);
}
