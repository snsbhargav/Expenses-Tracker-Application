package com.project.expensesTrackerBackend.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.expensesTrackerBackend.Entity.UserEntity;
import com.project.expensesTrackerBackend.Model.UserModel;

@Service
public interface UserService {

	public String saveUser(UserEntity userEntity);

	public ResponseEntity<UserModel> retrieveUserById(Long userId);
}
