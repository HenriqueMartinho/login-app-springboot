package com.portifolio.logindemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portifolio.logindemo.entities.User;
import com.portifolio.logindemo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Optional <User> findByEmailAndPassword (User user){
		return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}
	
	public void saveUser (User user){
		userRepository.save(user);
	}
	
	public Optional <User> findById(Long id) {
		return userRepository.findById(id);
	}
}
