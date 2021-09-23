package com.cogni.uday.hellospring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	
	/*@GetMapping
	public List<String> retriveMessage() {
		return Arrays.asList("Message","Hello");
	} */

	/*
	 * @GetMapping public String HelloMessage() { return "Hello"; }
	 */
}