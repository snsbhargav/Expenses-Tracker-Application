package com.project.expensesTrackerBacked.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
//	@Autowired
//	UserService userService;
//
//	@PostMapping("/saveUser")
//	public ResponseEntity<String> addNewUser(UserModel user){
//		return new ResponseEntity<String>(userService.saveUser(user), HttpStatus.CREATED);
//	}
	
	@GetMapping("/tester1")
	public String test() {
		return "test successful";
	}
}
