package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.AccountRepo;
import com.example.demo.repository.TransactionRepo;
@RestController
/** controller for transactions */
public class TransactionController {
	@Autowired
	/** repository of Transactions */
	private TransactionRepo repo1;
	@Autowired
	/** repository of Accounts */
	private AccountRepo repo;
	@PostMapping("/addtransaction")
	/** Adding transactions to the transaction table  */
	public Transaction addTransaction(@RequestBody final Transaction transaction) {
		transaction.setAccountNum(transaction.getAccountNum());
		transaction.setAmount(transaction.getAmount());
		transaction.setTransactionType(transaction.getTransactionType());
		final Account account1 = repo.getDataof(transaction.getAccountNum());
		if(Objects.equals(transaction.getTransactionType(),"deposit")) {
			account1.setBalance(account1.getBalance()+transaction.getAmount());
			transaction.setStatus("Success");
		}
		else if(Objects.equals(transaction.getTransactionType(),"withdraw")){
			if(account1.getBalance()>transaction.getAmount()) {
				account1.setBalance(account1.getBalance()-transaction.getAmount());
				transaction.setStatus("Success");
			}
			else {
				transaction.setStatus("failure");
			}
		}
		else {
			transaction.setStatus("Inavlid operation");
		}
		
		final java.util.Date date=new java.util.Date();
        transaction.setCreatedDt(date);
        transaction.setUpdatedDt(date);
		return repo1.save(transaction);
	}
	@GetMapping("/statement/{accountNum}")
	/** providing the transaction Statement for a particular account  */
	public List<Object> transactions(@PathVariable final int accountNum) {
		final List<Object> res = new ArrayList<>();
		res.add(repo1.getTransactions(accountNum));
		return res;
		
	}

}
