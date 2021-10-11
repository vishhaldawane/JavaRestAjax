package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("prince.txt");
			System.out.println("File is ready...");
		
			byte b = (byte) fin.read();
			
			while(b!=-1) {
				System.out.print((char)b);
				b = (byte) fin.read();
			}
			fin.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

/*

java.io

	File input and output stream
	
	
				Your Java Code
					data <-- memory - primary memory
					|
			------------------
			|		|		|
			file	memory	socket
			|
	------------------
	|			|
	output		input
	(writing)	(reading)

				DriverManager   		 ClassName
				FixedDepositAccount
				
				openConnection()	 methodName, 
				setLookAndFeel()	 
			
				rollNumber			 variableName
				accOpeningDate		 
				
				PI, MAX, MIN		CONSTANTS
				
				pack1.pack2.		packages
				
=================================================================================							
									Java io
=================================================================================							
		byte based						||	character based
		stream							||	stream
		|								||	|
		1 byte - min unit				||	2 bytes - min unit
		ASCII - 1 byte - 256 			||	char - 2 bytes - 65535
=================================================================================							
InputStream		|		OutputStream	||	Reader			|	writer
	read()		|			write()		||		read()		|	  write()
=================================================================================							
FileInputStream	|	FileOutputStream	||  FileReader		| FileWriter
				|						||					|
				|		PrintStream		||					| PrintWriter
				|						||					|
				|						||					|
				|						||					|
				|						||					|
				









*/
