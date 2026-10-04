package com;

public class BankAccount {
	
	private long accountNum;
	private String userName;
	private String ifsCode;
	private String branch;
	private double balance;
	
	public long getAccountNum() {
		return this.accountNum;
	}
	public double getbalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance = balance;
		}
		else {
			System.out.println("invalid balance....balance cannot be negative");
		}

	}
	
	public BankAccount() {
		
		
	}

	public BankAccount(long accountNum, String userName, String ifsCode, String branch, double balance) {
		super();
		this.accountNum = accountNum;
		this.userName = userName;
		this.ifsCode = ifsCode;
		this.branch = branch;
		this.balance = balance;
	}

	
	}
	

