package com.example.Spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
      

public class ControladorRest {

	@GetMapping("/")
	public String inicio() {
		
		return "Hola desde Spring Boot";

	}

}
