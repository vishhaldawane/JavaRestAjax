package com.java.reflection.airline;

import com.java.reflection.DesignedBy;

/*designed by vishhal
 * 
 * 			Cap				Cap
 * 			 				 NY
 * 			@ @				@ @ <-- sunglasses of rayban
 * 			
 * 			Tshirt			TShirt
 * 							Beneton
 * 			belt			belt <-- woodland
 * 			|				|
 * 			jeans			jeans <-- levis
 * 			|				|
 * 			shoes			shoes <-- sketchers
 * 	
 * 	
 * 
 * 
 * 
 * */

@DesignedBy(developer="vishhal",version=1.0)
public class Flight {
	//The annotation @DesignedBy is disallowed for this location
	
	@DesignedBy(developer="Roshan",version=2.0)
	private int flightNumber;
	private String flightName;
	private String sourceCity;
	private String targetCity;
	
	@DesignedBy(developer="Sanket",version=3.0)
	public Flight(int flightNumber, String flightName, String sourceCity, String targetCity) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.sourceCity = sourceCity;
		this.targetCity = targetCity;
	}
	
	public Flight(int flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}

	public Flight(int flightNumber, String sourceCity, String targetCity) {
		super();
		this.flightNumber = flightNumber;
		this.sourceCity = sourceCity;
		this.targetCity = targetCity;
	}

	/*use this constructor*/
	public Flight(int flightNumber, String flightName) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
	}



	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", sourceCity=" + sourceCity
				+ ", targetCity=" + targetCity + "]";
	}
	
	/* must be invoked */
	public void fly() {
		System.out.println("Flying...");
	}
	
	public void landing() {
		System.out.println("Landing...");
	}
}