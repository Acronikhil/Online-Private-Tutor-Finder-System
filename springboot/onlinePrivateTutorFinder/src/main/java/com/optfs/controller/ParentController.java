package com.optfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optfs.entities.Parent;
import com.optfs.exceptions.NullUserFound;
import com.optfs.services.ParentService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/parent")
public class ParentController {

	@Autowired
	ParentService parentService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Parent controller";
	}
	
	@PostMapping("/registerParent")
	public Parent registerParent(@RequestBody Parent parent) throws NullUserFound {
		return parentService.registerParent(parent);
	}
	
	@GetMapping("/allParents")
	public List<Parent> getAllParents(){
		return parentService.getAllParents();
	}
	
}
