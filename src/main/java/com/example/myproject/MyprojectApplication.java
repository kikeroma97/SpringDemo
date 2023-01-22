package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyprojectApplication {

	@RequestMapping("/")
	String home() {

		Calculador cal1 = new Calculador(3,5);

		return "Hello World!"+ "the sum is "+cal1.sum();
	}

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
