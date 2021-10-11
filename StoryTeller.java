package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class StoryTeller
{
	String filename;
	FileInputStream theFile;
	
	StoryTeller(String filename) {
		this.filename = filename;
		
	}
	void openFile() {
		try {
			theFile = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void readFile() {
		try {
			byte b = (byte) theFile.read(); //read the first letter
			
			while(b!=-1) { //check if that is the END of FILE or not
				
				System.out.print((char)b); //convert each byte into a char
				b = (byte) theFile.read();//read successive letters till EOF
			}
			System.out.println("\n----------------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void closeFile() {
		try {
			theFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}