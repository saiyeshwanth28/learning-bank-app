package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
/** Account entity with required fields and primary ID */
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNum;
	private String customerName;
	private long aadharno;
	private String accType;
	private int transactionFee;
	private int balance;
	private Date createdDT;
	private Date updatedDT;
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(final int accountNum) {
		this.accountNum = accountNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(final String customerName) {
		this.customerName = customerName;
	}
	
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(final long aadharno) {
		this.aadharno = aadharno;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(final String accType) {
		this.accType = accType;
	}
	public int getTransactionFee() {
		return transactionFee;
	}
	public void setTransactionFee(final int transactionFee) {
		this.transactionFee = transactionFee;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(final int balance) {
		this.balance = balance;
	}
	public Date getCreatedDT() {
		return createdDT;
	}
	public void setCreatedDT(final Date createdDT) {
		this.createdDT = createdDT;
	}
	public Date getUpdatedDT() {
		return updatedDT;
	}
	public void setUpdatedDT(final Date updatedDT) {
		this.updatedDT = updatedDT;
	}

	
	
    
}
