package com.redelectrica.EmeSoftApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "index1.1.html";
	}
	@GetMapping("/login")
	public String login() 
	{
		return "user-login/login.html";
	}	
}
