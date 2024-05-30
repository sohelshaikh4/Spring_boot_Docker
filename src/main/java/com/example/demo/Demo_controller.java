package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_controller 
{
	@GetMapping
	public String getMessage()
	{
		return "Welcome to my new Application ";
	}
}
