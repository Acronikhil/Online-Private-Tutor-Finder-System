package com.optfs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.optfs.entities.Users;
import com.optfs.services.UserService;

@RestController
public class UserContoller {
	
	@Autowired
	UserService userService;

	@CrossOrigin("http://localhost:4200")
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome User";
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/allUsers")
	public ResponseEntity<List<Users>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUser());
	}
	
	@CrossOrigin("http://localhost:4200")
	@PutMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody Users u ){
		return new ResponseEntity<String>(userService.addUser(u), HttpStatus.CREATED);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/allParents")
	public ResponseEntity<ArrayList<Users>> getAllParents(){
		return ResponseEntity.ok(userService.getAllParents());
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/allAdmin")
	public ResponseEntity<ArrayList<Users>> getAllAdmin(){
		return ResponseEntity.ok(userService.getAllAdmins());
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/allTutors")
	public ResponseEntity<ArrayList<Users>> getAllTutors(){
		return ResponseEntity.ok(userService.getAllTutors());
	}
	
	@CrossOrigin("http://localhost:4200")
	@DeleteMapping("/deleteUser/{delUserId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer delUserId){
		return new ResponseEntity<String>(userService.deleteUser(delUserId), HttpStatus.OK);
	}
}
