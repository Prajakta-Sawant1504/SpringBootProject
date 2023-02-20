package com.consultadd.maven.ConsultAddAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootApp.class, args);

	}
	
	@GetMapping("/user")
	public String getUser(){
		return "{\"userName\":\"John\", \"age\":30, \"car\":\"Ford\"}";
	}
	
	
	@PostMapping("/greetings")
	public String readInputData(@RequestBody String name){
		return String.format("Hello %s!",name);
	}

}
