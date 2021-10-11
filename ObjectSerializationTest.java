package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.java.io.bank.SavingsAccount;

public class ObjectSerializationTest {
	public static void main(String[] args) {
		
		SavingsAccount saObj = new SavingsAccount(101,"Julie",50000.0,1234);
		
		try {
			FileOutputStream fout = new FileOutputStream("BANK.TXT");
			System.out.println("File is ready...");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object output stream is also ready...");
			
			oos.writeObject(saObj);
			System.out.println("Object is serialized ..... ");
			
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
