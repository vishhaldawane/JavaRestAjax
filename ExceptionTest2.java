package com.java.exceptions;

public class ExceptionTest2 {
	public static void main(String[] args) {
		DrunkenMaster master = new DrunkenMaster();
		master.drinkAndFight();
		System.out.println("-----------");
		DrunkenDisciple disciple = new DrunkenDisciple();
		disciple.drinkAndFight();
	}
}

class KnockDownException extends Exception {
	KnockDownException(String str){
		super(str);
	}
}
class DrunkenMaster //1920 2000
{
	void drinkAndFight()  {
		System.out.println("Master is drinking and fighting...");
		System.out.println("Some unique skills of the master....");
	}
}
class DrunkenDisciple extends DrunkenMaster //1999 - 2021
{
	//Exception KnockDownException is not compatible with throws clause in 
	//DrunkenMaster.drinkAndFight()
	void drinkAndFight() throws KnockDownException  
	{
		System.out.println("Drunken Disciple is drinking and fighting...");
		super.drinkAndFight();
		System.out.println("Some unique / explored skills of the self...");
		double value = Math.random()%10;
		if(value > 0.95) {
			KnockDownException kde = new KnockDownException("Oh no!!subtle mistake....");
			throw kde;
		}
	}
}
