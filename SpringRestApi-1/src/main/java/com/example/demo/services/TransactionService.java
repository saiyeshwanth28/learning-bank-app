package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepo;
/** Service class for Transactions */
public class TransactionService {
	@Autowired
	private TransactionRepo repo1;
	/** adding records to Transaction table*/
	public Transaction addTransaction(final Transaction transaction) {
    	return repo1.save(transaction);
    }
	/** fetching the statement of account number*/
	public List<Transaction> getTransactions(final int accountNum){
		return repo1.getTransactions(accountNum);
		
	}

}
