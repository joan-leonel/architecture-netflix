package com.example.webservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Webservice1Application {

	@GetMapping("/")
	public String sayHello(){
		return "Hello !";
	}

	public static void main(String[] args) {
		SpringApplication.run(Webservice1Application.class, args);
	}

}
