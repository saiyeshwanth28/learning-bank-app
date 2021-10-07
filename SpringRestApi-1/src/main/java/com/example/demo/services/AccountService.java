package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepo;

import java.util.List;

@Service
public class AccountService{
    @Autowired
    private AccountRepo repository;
	/** adding new record to account table */
    public Account addAccount( final Account account){
        return repository.save(account);
    }
	/** fetching all the records of account table*/
    public List<Account> getDetails(){
		return repository.findAll();
		
	}
	/** fetching account by accountnumber */
	public Account getAccountById(final int identifier) {
		return repository.findById(identifier).orElse(null);
		
	}
    

}