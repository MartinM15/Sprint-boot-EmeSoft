package com.redelectrica.EmeSoftApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.redelectrica.EmeSoftApp.entity.User;
import com.redelectrica.EmeSoftApp.repository.UserRepository;
import com.redelectrica.EmeSoftApp.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository UserRepository;

	
	
	@GetMapping("/index")
	public String index(Model model) {
		//return "index1.1.html";
		//model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("formIng", "active");
		
		return "index1.1.html";
	}
	
	@GetMapping("/User")
	public String UserForm(Model model) {
		
		model.addAttribute("userform", new User()); //el user form esta en html furmulario ing
		model.addAttribute("userList", userService.getAllUsers());
		return "UsuariosGrid.html";
	}
	@GetMapping("/")
	public String showUser(Model model) 
	{
		
		model.addAttribute("userSelect", UserRepository.findAll());
		return "OrdMaintenanceGrid.html";
	}	
	
	@GetMapping("/login")
	public String login(Model model) 
	{
		model.addAttribute("userList",userService.getAllUsers());
		model.addAttribute("formIng", "active");
		
		return "user-login/login.html";
	}	
}
