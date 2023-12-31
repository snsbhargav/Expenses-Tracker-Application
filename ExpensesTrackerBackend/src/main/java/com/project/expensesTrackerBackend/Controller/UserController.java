package com.project.expensesTrackerBackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.expensesTrackerBackend.Entity.UserEntity;
import com.project.expensesTrackerBackend.Model.UserModel;
import com.project.expensesTrackerBackend.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public ResponseEntity<String> addNewUser(@RequestBody UserEntity user){
		return new ResponseEntity<String>(userService.saveUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/userId/{id}")
	public ResponseEntity<UserModel> retrieveUser(@PathVariable("id") Long userId){
		return userService.retrieveUserById(userId);
	}
	
	@GetMapping("/tester1")
	public String test() {
		return "test successful";
	}
}
