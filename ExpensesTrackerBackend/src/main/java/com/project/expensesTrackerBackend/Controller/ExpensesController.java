package com.project.expensesTrackerBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.expensesTrackerBackend.Entity.ExpensesEntity;
import com.project.expensesTrackerBackend.Exception.NO_USER_EXPENSES_FOUND_EXCEPTION;
import com.project.expensesTrackerBackend.Service.ExpenseService;

@RestController
public class ExpensesController {

	@Autowired
	private ExpenseService expenseService;

	@PostMapping("/saveExpense")
	public ResponseEntity<String> saveExpense(@RequestBody ExpensesEntity expensesEntity) {
		return expenseService.saveExpenseToDatabase(expensesEntity);
	}

	@GetMapping("/expense/expenseId/{expenseId}")
	public ResponseEntity<ExpensesEntity> getExpenseByExpenseId(@PathVariable("expenseId") Long expenseId) {
		return expenseService.retreiveExpenseByExpenseId(expenseId);
	}

	@GetMapping("/expense/userId/{userId}")
	public ResponseEntity<List<ExpensesEntity>> getExpenseByUserId(@PathVariable("userId") Long userId)
			throws NO_USER_EXPENSES_FOUND_EXCEPTION {
		return expenseService.retreiveExpenseByUserId(userId);
	}

	@PutMapping("/updateExpense")
	public ResponseEntity<String> updateExpense(@RequestBody ExpensesEntity expensesEntity){
		return expenseService.updateExpense(expensesEntity);
	}
	
	@DeleteMapping("/deleteExpense/{expenseId}")
	public ResponseEntity<String> deleteExpense(@PathVariable("expenseId") Long expenseId){
		return expenseService.deleteExpense(expenseId);
	}
}
