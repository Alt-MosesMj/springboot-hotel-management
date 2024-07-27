package com.example.hotelfinder.service;

import java.util.List;

import com.example.hotelfinder.model.Hotel;

public interface HotelService {
	List<Hotel> getHotelsByCity(String city);
	
	List<Hotel> getAllHotels();

	Hotel addHotel(Hotel hotel);

	List<Hotel> addHotels(List<Hotel> hotels);

	Hotel updateHotel(Hotel hotel);
}
