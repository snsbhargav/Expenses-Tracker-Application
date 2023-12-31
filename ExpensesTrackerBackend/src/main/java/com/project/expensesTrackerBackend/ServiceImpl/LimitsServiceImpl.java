package com.project.expensesTrackerBackend.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.expensesTrackerBackend.Entity.LimitsEntity;
import com.project.expensesTrackerBackend.Repository.LimitsRepository;
import com.project.expensesTrackerBackend.Service.LimitsService;

@Service
public class LimitsServiceImpl implements LimitsService{
	
	@Autowired
	private LimitsRepository limitsRepository;

	public ResponseEntity<String> saveLimit(LimitsEntity limitsEntity){
		limitsRepository.save(limitsEntity);
		return new ResponseEntity<String>("Limit set successfully.", HttpStatus.OK);
	}

	public ResponseEntity<String> updateLimit(LimitsEntity limitsEntity) {
		limitsRepository.save(limitsEntity);
		return new ResponseEntity<String>("Limit updated successfully.", HttpStatus.OK);
	}
}
