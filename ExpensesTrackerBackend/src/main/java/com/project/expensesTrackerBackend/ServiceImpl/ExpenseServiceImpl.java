package com.project.expensesTrackerBackend.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.expensesTrackerBackend.Entity.ExpensesEntity;
import com.project.expensesTrackerBackend.Exception.EXPENSE_ID_NOT_FOUND;
import com.project.expensesTrackerBackend.Exception.NO_USER_EXPENSES_FOUND_EXCEPTION;
import com.project.expensesTrackerBackend.Repository.ExpensesRepository;
import com.project.expensesTrackerBackend.Service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService{

	@Autowired
	private ExpensesRepository expensesRepository;

	public ResponseEntity<String> saveExpenseToDatabase(ExpensesEntity expensesEntity) {
		expensesRepository.save(expensesEntity);
		return new ResponseEntity<String>("Expense Saved successfully.", HttpStatus.CREATED);
	}

	public ResponseEntity<ExpensesEntity> retreiveExpenseByExpenseId(Long expenseId) {
		ExpensesEntity expenseEntity = expensesRepository.findById(expenseId).orElseThrow(()-> new EXPENSE_ID_NOT_FOUND());	
		if(expenseEntity == null)	return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<ExpensesEntity>(expenseEntity, HttpStatus.FOUND);
	}

	public ResponseEntity<List<ExpensesEntity>> retreiveExpenseByUserId(Long userId) throws NO_USER_EXPENSES_FOUND_EXCEPTION {
		List<ExpensesEntity> expenseEntities = expensesRepository.findByUserId(userId);
		if(expenseEntities.size() == 0)	throw new NO_USER_EXPENSES_FOUND_EXCEPTION();
		
		return new ResponseEntity<List<ExpensesEntity>>(expenseEntities, HttpStatus.FOUND);	}

	public ResponseEntity<String> updateExpense(ExpensesEntity expensesEntity) {
		// TODO Auto-generated method stub
		expensesRepository.save(expensesEntity);
		return new ResponseEntity<String>("Update successful", HttpStatus.OK);
	}

	public ResponseEntity<String> deleteExpense(Long expenseId) {
		// TODO Auto-generated method stub
		expensesRepository.deleteById(expenseId);
		return new ResponseEntity<String>("Expense deleted successfully", HttpStatus.OK);
	}
	
	
}
