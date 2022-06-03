package com.example.docker.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello/")

public class Hello {
	
	@GetMapping String hello () {
		
		return "hello word ";
	}
}