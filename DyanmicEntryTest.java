package com.dassault;

import java.util.ArrayList;
import java.util.Scanner;

public class DyanmicEntryTest {

	public static void main(String[] args) {
		
		ArrayList playerList = new ArrayList();
		
		int choice=0;
		int rank=0;
		
		//rank,name,hits,hitf, sr, totrun, currRun 
		do
		{
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter player name : ");
			String playerName = scan1.nextLine();
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter total score till now : ");
			int totalScore = scan2.nextInt();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter current run : ");
			int currentRun = scan3.nextInt();
			
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Enter total sixers : ");
			int totSix = scan4.nextInt();
			
			Scanner scan5 = new Scanner(System.in);
			System.out.println("Enter total fours : ");
			int totFor = scan5.nextInt();
			
			Scanner scan6 = new Scanner(System.in);
			System.out.println("Enter age  : ");
			int age = scan6.nextInt();
			
			
			Scanner scan7 = new Scanner(System.in);
			System.out.println("Enter strike rate : ");
			float  strikeRt = scan5.nextFloat();
			
			CricketPlayer cricketer = new CricketPlayer(++rank, playerName, "India", totalScore, currentRun, totSix, totFor,age,strikeRt);
			
			playerList.add(cricketer); //add this newly created object in the list , each time the loop iterates...
			
			Scanner scan8 = new Scanner(System.in);
			System.out.println("PRESS 0 TO CONTINUE ADDING OR 1 TO QUIT)  : ");
			choice  = scan8.nextInt();
		
			
		} while(choice!=1);
		
		for (int i = 0; i < playerList.size(); i++) { //its 11 - 5 are assigned
			CricketPlayer x = (CricketPlayer) playerList.get(i);
			x.printCricketPlayer();	
		}
	}

}
