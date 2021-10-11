package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileTest2 {
	public static void main(String[] args) { //king.txt and queen.txt 
		StoryTeller story1 = new StoryTeller("myfiles/prince.txt");
		story1.openFile();
		story1.readFile();
		story1.closeFile();
		
		StoryTeller story2 = new StoryTeller("myfiles/king.txt");
		story2.openFile();
		story2.readFile();
		story2.closeFile();
		
		StoryTeller story3 = new StoryTeller("myfiles/queen.txt");
		story3.openFile();
		story3.readFile();
		story3.closeFile();
		
		
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
