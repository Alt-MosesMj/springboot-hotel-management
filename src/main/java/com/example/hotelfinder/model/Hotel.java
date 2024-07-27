package com.example.hotelfinder.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "hotels")
public class Hotel {
	@Id
	private String id;
	private String name;
	private String city;
	private String address;
}
