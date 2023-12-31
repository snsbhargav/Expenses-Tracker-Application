package com.project.expensesTrackerBackend.Entity;



import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;

import com.project.expensesTrackerBackend.Enum.ExpenseType;
import com.project.expensesTrackerBackend.Enum.TransactionType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ExpensesEntity {

	//Expense name, Expensetype(food, entertainment etc), picture, location, amount, credit/debit, datetime, reciepts
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long expenseId;
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private UserEntity fk;
	private String expenseName;
	private String expense;
	//Add receipt
	@Enumerated(EnumType.STRING)
	private ExpenseType expenseType;
	private String location;
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime = new Date();
	
	//Add receipts
}
