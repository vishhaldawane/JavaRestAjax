package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.java.io.bank.SavingsAccount;

public class MultiObjectSerializationTest {
	public static void main(String[] args) {
		
		SavingsAccount saObj1 = new SavingsAccount(101,"Julie",50000.0,1234);
		SavingsAccount saObj2 = new SavingsAccount(102,"Jane",60000.0,2234);
		SavingsAccount saObj3 = new SavingsAccount(103,"Julia",70000.0,4234);
		SavingsAccount saObj4 = new SavingsAccount(104,"John",80000.0,5234);
		SavingsAccount saObj5 = new SavingsAccount(105,"Jack",90000.0,6234);

		ArrayList<SavingsAccount> allAccounts = new ArrayList<SavingsAccount>();
		
		//try serializing 5 (multiple) objects of SavingsAccount
		
		try {
			FileOutputStream fout = new FileOutputStream("BANK.TXT");
			System.out.println("File is ready...");
			allAccounts.add(saObj1);
			allAccounts.add(saObj2);
			allAccounts.add(saObj3);
			allAccounts.add(saObj4);
			allAccounts.add(saObj5);
			
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object output stream is also ready...");
			
			oos.writeObject(allAccounts); //can we serialize it?? 
			System.out.println("ArrayList Object is serialized ..... ");
			
			oos.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
}
