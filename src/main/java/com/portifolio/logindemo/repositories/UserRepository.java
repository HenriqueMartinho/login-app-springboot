package com.portifolio.logindemo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portifolio.logindemo.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
	
	public Optional<User> findByEmailAndPassword(String email, String password);
	
}
