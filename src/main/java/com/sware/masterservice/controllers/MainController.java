package com.sware.masterservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin//This annotation allows client browser to get data successfully by  hitting endpoints from other port than server's port. 
@RequestMapping("/")
public class MainController {
	
	@GetMapping("/home")
	public String homePing(){
		return "Hello from Master Service";
	}

}
