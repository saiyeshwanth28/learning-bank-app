package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Transaction;
/** Transaction repossitory interface */
public interface TransactionRepo extends JpaRepository<Transaction,Integer>{
	@Query(value = "Select * from transaction where account_num=?1", nativeQuery = true)
    /** returns the list of transactions of the accountnumber */
    List<Transaction> getTransactions(int accountNum);

}
