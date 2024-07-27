package com.example.hotelfinder.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelfinder.model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
    List<Hotel> findByCity(String city);
}
