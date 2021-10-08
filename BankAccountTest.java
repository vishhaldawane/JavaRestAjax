package com.java.exceptions.accounts;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		
		ApplicationForm theForm1 = new ApplicationForm();
		theForm1.fillUpTheForm();
		
		ApplicationForm theForm2 = new ApplicationForm();
		theForm2.fillUpTheForm();
		
		ApplicationForm theForm3 = new ApplicationForm();
		theForm3.fillUpTheForm();
		
	
		
		BankService bankService = new BankService();
		
		BankAccount baObj1 = bankService.openBankAccount(theForm1);
		System.out.println("baObj : "+baObj1);
		
		BankAccount baObj2 = bankService.openBankAccount(theForm2);
		System.out.println("baObj : "+baObj2);
		
		BankAccount baObj3 = bankService.openBankAccount(theForm3);
		System.out.println("baObj : "+baObj3);
		
		
		//MyCalci c = new MyCalci();
		//int sum = c.add(10,20);//passing primitive
	}
}
class MyCalci
{
	int add(int i, int j) {
		 int ans =  i+j; return ans;
	}
}
class BankService
{
	static int generatedAccountNumber=100;
	
	BankAccount openBankAccount(ApplicationForm theForm) {
		BankAccount temp;
		try {
			temp = new BankAccount(++generatedAccountNumber,theForm.getYourName(),theForm.getOpeningBalance());
			return temp;
		} catch (InvalidOpeningBalanceException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		};
		return null;
	}
}

//REST API - create, update, delete , view , view all

class ApplicationForm
{
	private String yourName;
	private double openingBalance;
	
	void fillUpTheForm() { //kind of a setter method 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name : ");
		yourName = scan.next();
		System.out.println("Enter opening balance : ");
		openingBalance  = scan.nextDouble();
	}

	public String getYourName() {		return yourName;	}

	public double getOpeningBalance() {		return openingBalance;	}
	
}
class BankAccount //extends Object <-- super class for all
{
	private int accNumber;
	private String accName;
	private double accBalance;
	
	public BankAccount(int accNumber, String accName, double accBalance) throws InvalidOpeningBalanceException 
	{
		super(); //invokes the constructor of Object class
		
		this.accNumber = accNumber;
		
		
		this.accName = accName;
		
		if(accBalance < 5000) {
			InvalidOpeningBalanceException iobe = new InvalidOpeningBalanceException("Opening balance must be 5000 or more...");
			throw iobe; // constructor gets over here only..
		}
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
}

/*
 
 
 		You	Home				Bank Building
 								BankService {
 		as Human				   BankAccount openBankAccount( ApplicationFrom theForm ) {
 											theForm.getYourName();
 											theForm.getOpeningBalance();
 											
 								   }
 								}
 										
 	ApplicationForm					BankAccount
 
 
 
 
 
 
 
 
 
 
 */
