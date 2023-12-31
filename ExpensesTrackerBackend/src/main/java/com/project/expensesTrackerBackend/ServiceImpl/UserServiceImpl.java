package com.project.expensesTrackerBackend.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.expensesTrackerBackend.Entity.UserEntity;
import com.project.expensesTrackerBackend.Exception.USER_NOT_FOUND_EXCEPTION;
import com.project.expensesTrackerBackend.Model.UserModel;
import com.project.expensesTrackerBackend.Repository.UserRepository;
import com.project.expensesTrackerBackend.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	public String saveUser(UserEntity userEntity) {
		userRepo.save(userEntity);
		return "User Saved Successfully.";
	}

	public ResponseEntity<UserModel> retrieveUserById(Long userId) {
		UserEntity userEntity = userRepo.findById(userId).orElseThrow(() -> new USER_NOT_FOUND_EXCEPTION());
		if (userEntity == null)
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(UserModel.convertEntityToModel(userEntity), HttpStatus.OK);

	}

}
