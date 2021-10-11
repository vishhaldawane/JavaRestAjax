package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FielWriteTest {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Trying to open a file for writing...");
			FileOutputStream fout = new FileOutputStream("myfiles/princess.txt");
			System.out.println("File is ready to write the data... ");
			
			Scanner scan= new Scanner(System.in);
			
			String str = scan.nextLine(); //first line
			//str = str + "\n";
			byte array[] = str.getBytes(); // convert string into byte array
			
			while( ! str.equalsIgnoreCase("EOF")) {
				fout.write(array);
				fout.write('\n');
				//for(int i=0;i<array.length;i++) {
				//	System.out.println((char)(array[i])+" "+array[i]);
				//}
				//System.out.println(Arrays.toString(array)+"[ ]"+str);
				str = scan.nextLine(); //continue reading second line onwards
				//str = str + "\n";
				array = str.getBytes(); // convert string into byte array
				
			}
			fout.close();
			System.out.println("File is written.....");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
