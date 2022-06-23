package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FeignProducerApplication {
	
	

	
	public static void main(String[] args) {
		SpringApplication.run(FeignProducerApplication.class, args);
	}
	
	@GetMapping("/home")
	public ResponseEntity<String> home() {
		return ResponseEntity.notFound().build();
	}
	
	

}
