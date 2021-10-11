package com.java.io.bank;

import java.io.Serializable;

public class SavingsAccount implements Serializable {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	private static String accountType="Savings";
	private static String bankName="Central Bank";
	
	private int pinNumber;
	
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance, int pinNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + ", pinNumber=" + pinNumber + "]";
	}
	
	
	
}
