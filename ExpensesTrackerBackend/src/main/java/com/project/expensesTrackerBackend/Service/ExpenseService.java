package com.project.expensesTrackerBackend.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.expensesTrackerBackend.Entity.ExpensesEntity;
import com.project.expensesTrackerBackend.Exception.NO_USER_EXPENSES_FOUND_EXCEPTION;

@Service
public interface ExpenseService {

	public ResponseEntity<String> saveExpenseToDatabase(ExpensesEntity expensesEntity);

	public ResponseEntity<ExpensesEntity> retreiveExpenseByExpenseId(Long expenseId);

	public ResponseEntity<List<ExpensesEntity>> retreiveExpenseByUserId(Long userId) throws NO_USER_EXPENSES_FOUND_EXCEPTION;

	public ResponseEntity<String> updateExpense(ExpensesEntity expensesEntity);

	public ResponseEntity<String> deleteExpense(Long expenseId);
}
