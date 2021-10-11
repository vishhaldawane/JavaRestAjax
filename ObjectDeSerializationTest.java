package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.java.io.bank.SavingsAccount;

public class ObjectDeSerializationTest {
	public static void main(String[] args) {
		
		SavingsAccount saObj = null;
		
		try {
			FileInputStream fin = new FileInputStream("BANK.TXT");
			System.out.println("File is ready...to read...");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object input stream is also ready...to read..");
			
			saObj = (SavingsAccount) ois.readObject();
			System.out.println("Object is de-serialized ..... ");
			
			System.out.println("saObj "+saObj);
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
