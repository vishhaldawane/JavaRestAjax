package com.java.exceptions;

public class CarTest {
	public static void main(String[] args) {

		CarKey myKey = new CarKey("HondaKey");
		Car myCar = new Car("HondaCity");
		
		myCar.openTheCar(myKey);
		myCar.shortDrive();
		myCar.lockTheCar(myKey);
	}
}
class Key {
	
}
class CarKey extends Key {
	String keyName;
	public CarKey(String string) {
		keyName=string;
	} //isA
}

class Lock {
	
}

class CarLock extends Lock {
	
	String carLockName;
		
	public CarLock(String carLockName) {
		super();
		this.carLockName = carLockName;
	}
	
	void lockIt(CarKey theCarKey) { //usesA  - use the key
		System.out.println("getting key credentials mapped with lock.."+theCarKey.keyName);
		System.out.println("Locking the Car...");
	}
	void unlockIt(CarKey theCarKey) { // usesA - use the key
		System.out.println("getting the key credentials mapped with lock..");
		System.out.println("Unlocking the Car...");
	}
}
class Car
{
	private CarLock carLock = new CarLock("Lock"); //hasA
	private String carName;
	
	public Car(String string) {
		this.carName = string;
	}
	
	void openTheCar(CarKey carKey) {
		System.out.println("Opening..."+carName);
		carLock.unlockIt(carKey); //u press a unlock button on the key
	}
	void lockTheCar(CarKey carKey) {
		System.out.println("Closing.."+carName);
		carLock.lockIt(carKey); //u press the lock button on the key 
	}
	
	void shortDrive() {
		System.out.println("start the car....");
		for(int i=1;i<=5;i++) {
			System.out.println("Short drive over..."+i+" kms");
		}
	}
}
