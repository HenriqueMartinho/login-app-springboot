package com.portifolio.logindemo.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portifolio.logindemo.entities.User;
import com.portifolio.logindemo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		return ResponseEntity.ok().body(userService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<User>> findById(@PathVariable Long id) {
		Optional<User> user = userService.findById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert (@RequestBody User newUser){
		userService.insert(newUser);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
		return ResponseEntity.ok().body(userService.update(id, user));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
