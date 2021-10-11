package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) {
		
		Flight theFlightObj = new Flight(101,"Lufthansa","Mumbai","Germany");
		
		theFlightObj.fly();
		
		//every instance of an "Object class"
		//got a method called as getClass()
		//that returns an instance of "class Class" [ holds the meta data ]
		//theFlightObj.
		Class theReflection = theFlightObj.getClass();
		Method methods[] = theReflection.getMethods();
		for(Method theMethod : methods) {
			System.out.println("Method is : "+theMethod);
		}
		System.out.println("-------");
		
		Constructor ctors[] = theReflection.getConstructors();
		
		for(Constructor theCtor : ctors ) {
			System.out.println(theCtor.getParameterCount()+" parameterized Constructor : "+theCtor);
			
		}
		//Object browsers / crawlers
	}
}


class Flight {
	
	private int flightNumber;
	private String flightName;
	private String sourceCity;
	private String targetCity;
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
	
	public void fly() {
		System.out.println("Flying...");
	}
	
	public void landing() {
		System.out.println("Landing...");
	}
}