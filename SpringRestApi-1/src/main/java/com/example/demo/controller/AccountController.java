package com.example.demo.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.services.AccountService;

@RestController
/** Acccount controller*/
public class AccountController {
	    @Autowired
		/** service for accounts */
	    AccountService service;
	    @PostMapping("/addaccount")
		/** Adding customer details to account table */
	    public Account addAccount(@RequestBody final Account acc) {
	    	acc.setCustomerName(acc.getCustomerName());
	    	acc.setAadharno(acc.getAadharno());
	    	acc.setAccType(acc.getAccType());
	    	acc.setTransactionFee(0);
	    	if(Objects.equals(acc.getAccType(), "Current")) {
	    		acc.setTransactionFee(5);
	    	}
	        acc.setBalance(acc.getBalance());
	     	final java.util.Date date=new java.util.Date();
	        acc.setCreatedDT(date);
	        acc.setUpdatedDT(date);
	        return service.addAccount(acc);
}
	    @GetMapping("/accounts")
		/** Fetching all the accounts in account table*/
		public List<Account> findAllAccounts(){
			return service.getDetails();
		}
		@GetMapping("/account/{identifier}")
		/** Finding the acount by particular account number from account table*/
		public Account findAccountById(@PathVariable final int identifier) {
			return service.getAccountById(identifier);
		}

}

