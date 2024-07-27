package com.example.hotelfinder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelfinder.model.Hotel;
import com.example.hotelfinder.repository.HotelRepository;
import com.example.hotelfinder.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		return hotelRepository.findByCity(city);
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> addHotels(List<Hotel> hotels) {
		return hotelRepository.saveAll(hotels);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}
}
