package org.tech.kshitij.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.kshitij.Model.User;
import org.tech.kshitij.Service.Userservice;

@RestController
@RequestMapping("/api/vl")
public class AppController {
	
	@Autowired
	private Userservice userService;

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id){
		
		return new ResponseEntity<>(userService.userGetServ(id),HttpStatus.OK);
	}
	
	
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		
		return new ResponseEntity<>(userService.userAddServ(user),HttpStatus.OK);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> modifyUser(@PathVariable String id,@RequestBody User user){
		
		return new ResponseEntity<>(userService.userUpdateServ(id, user),HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> removeUser(@PathVariable String id){
		
		return new ResponseEntity<>(userService.userRemoveServ(id),HttpStatus.OK);
	}
	
}

