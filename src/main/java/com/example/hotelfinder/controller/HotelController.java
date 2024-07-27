package com.example.hotelfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hotelfinder.model.Hotel;
import com.example.hotelfinder.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping
	public ResponseEntity<List<Hotel>> getHotelsByCity(@RequestParam String city) {
		List<Hotel> hotels = hotelService.getHotelsByCity(city);
		return ResponseEntity.ok(hotels);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> hotels = hotelService.getAllHotels();
		return ResponseEntity.ok(hotels);
	}

	@PostMapping
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
		Hotel createdHotel = hotelService.addHotel(hotel);
		return ResponseEntity.ok(createdHotel);
	}

	@PostMapping("/bulk")
	public ResponseEntity<List<Hotel>> addHotels(@RequestBody List<Hotel> hotels) {
		List<Hotel> createdHotels = hotelService.addHotels(hotels);
		return ResponseEntity.ok(createdHotels);
	}

	@PutMapping
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) {
		Hotel updatedHotel = hotelService.updateHotel(hotel);
		return ResponseEntity.ok(updatedHotel);
	}
}
