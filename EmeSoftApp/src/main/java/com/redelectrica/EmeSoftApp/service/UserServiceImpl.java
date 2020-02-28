package com.redelectrica.EmeSoftApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redelectrica.EmeSoftApp.entity.User;
import com.redelectrica.EmeSoftApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		
		return repository.findAll();
	}
	
	

	
}
