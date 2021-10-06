package com.java.laundry;

//Seclore technologies - file security - 13 students - college toppers
//2100 resumes

//Innovate isAhasAusesAProducesA  example now.
//your examples must be the unique one in the whole class

public class LaundryTest {
	public static void main(String[] args) {
		
			WashingMachine washMachine = new WashingMachine(); //isA Machine
			
			WashingPowder washPw = new WashingPowder();
			Electricity elect = new Electricity();
			Water wtr = new Water();
			Cloth whiteShirt = new Cloth();
			
			LaundryBill laundryBill = washMachine.wash(washPw, wtr, elect, whiteShirt);

			System.out.println(laundryBill);
	}
}
class Machine
{
	
}
class WashingMachine extends Machine { //isA
	
	WashingTub washTub = new WashingTub(); //hasA

	LaundryBill wash(WashingPowder washPowder, Water wtr, Electricity elect, Cloth cl) {
		System.out.println("Washing....");
		rinse();
		LaundryBill laundryBill = new LaundryBill();
		return laundryBill;
	}
	private void rinse() {
		System.out.println("Rinsing...");
		spin();
	}
	private void spin() {
		System.out.println("Spinning...");
	}
}
class Tub {
	
}
class WashingTub extends Tub { //isA
	
}
class Powder {
	
}
class WashingPowder extends Powder { //is
	
}

class Water {
	
}
class Electricity {
	
}
class Cloth {
	
}
class Bill {
	
}
class LaundryBill extends Bill {
	//bill of electricity for that wash program of 1 hour 
	//bill of water ...
	//cost of washing powder for that program
	double laundryBillAmount=30; //INR

	@Override
	public String toString() {
		return "LaundryBill [laundryBillAmount=" + laundryBillAmount + "]";
	}
}