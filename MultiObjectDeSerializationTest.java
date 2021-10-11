package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.java.io.bank.SavingsAccount;

public class MultiObjectDeSerializationTest {
	public static void main(String[] args) {
	
		ArrayList<SavingsAccount> allAccounts = new ArrayList<SavingsAccount>();
		
		try {
			FileInputStream fin = new FileInputStream("BANK.TXT");
			
			System.out.println("File is ready...to read");
		
			
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object input stream is also ready...");
			
			allAccounts = (ArrayList<SavingsAccount>) ois.readObject(); //can we serialize it?? 
			System.out.println("ArrayList Object is de-serialized ..... ");
			
			for(SavingsAccount theSavObj : allAccounts) {
				System.out.println("acc :"+theSavObj);
			}
			ois.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
}
