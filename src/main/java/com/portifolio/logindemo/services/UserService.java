package com.portifolio.logindemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portifolio.logindemo.entities.User;
import com.portifolio.logindemo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser (User user){
		userRepository.save(user);
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}
	
	public Optional<User> findByEmailAndPassword (User user){
		return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}
	
	public void insert(User user) {
		userRepository.save(user);
	}
	
	public User update(Long id, User newData) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
		user.setName(newData.getName());
		user.setEmail(newData.getEmail());
		user.setPassword(newData.getPassword());
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
