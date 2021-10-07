package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/** Entity for transaction which created table in db with fields given */
public class Transaction {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private int accountNum;
	private int amount;
	private String transactionType;
	private String status;
	private Date createdDt;
	private Date updatedDt;
	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(final int accountNum) {
		this.accountNum = accountNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(final int amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(final String transactionType) {
		this.transactionType = transactionType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(final String status) {
		this.status = status;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(final Date createdDt) {
		this.createdDt = createdDt;
	}
	public Date getUpdatedDt() {
		return updatedDt;
	}
	public void setUpdatedDt(final Date updatedDt) {
		this.updatedDt = updatedDt;
	}
	

}

