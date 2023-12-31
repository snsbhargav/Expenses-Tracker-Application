package com.project.expensesTrackerBackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.expensesTrackerBackend.Entity.LimitsEntity;
import com.project.expensesTrackerBackend.Service.LimitsService;

@RestController
public class LimitsController {

	@Autowired
	private LimitsService limitsService;
	
	@PostMapping("/saveLimit")
	public ResponseEntity<String> saveLimits(@RequestBody LimitsEntity limitsEntity){
		return limitsService.saveLimit(limitsEntity);
	}
	
	@PutMapping("/updateLimit")
	public ResponseEntity<String> updateLimit(@RequestBody LimitsEntity limitsEntity){
		return limitsService.updateLimit(limitsEntity);
	}
}
