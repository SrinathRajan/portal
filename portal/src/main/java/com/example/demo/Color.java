package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String yourFavColour="Green";
	@GetMapping("/")
	public String getMyFav() {
		return "My favourite colour is  " + yourFavColour;
	}
}