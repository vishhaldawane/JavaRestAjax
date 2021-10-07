package com.java.exceptions;

public class CarTest {
	public static void main(String[] args) 
	{

		CarKey myKey = new CarKey("HC1234");
		Car myCar = new Car("HondaCity","HC1234");
		
		try
		{
			myCar.openTheCar(myKey);//Car hasA Lock, but using the CarKey here
			myCar.shortDrive();
			myCar.lockTheCar(myKey);
		}
		catch(CarLockException e) {
			System.out.println("some problem while locking   : "+e.getMessage());
		}
		catch(CarUnLockException e) {
			System.out.println("some problem while unlocking : "+e.getMessage());
		}
	}
} 
class Key {
	
}
class CarKey extends Key {
	private String keyName;
	public CarKey(String string) {
		keyName=string;
	} //isA
	public String getKeyName() {
		return keyName;
	}
}

class Lock {
	
}

class CarLock extends Lock {
	
	private String carLockName;
		
	public void setCarLockName(String name) {
		carLockName = name;
	}
	
	void lockIt(CarKey theCarKey) throws CarLockException
	{ //usesA  - use the key
		System.out.println(carLockName+" getting key credentials mapped with lock.."+theCarKey.getKeyName());
		if(theCarKey.getKeyName().equals(carLockName)) {
			System.out.println("Locking the Car...");
		}
		else {
			//System.out.println("Pairing failed..unable to lockIt..");
			CarLockException rte = new CarLockException("Unable to lock the Car");
			throw rte;
		}
	}
	void unlockIt(CarKey theCarKey) throws CarUnLockException //its an indication 
	{ // usesA - use the key
		System.out.println(carLockName+" getting the key credentials mapped with lock.."+theCarKey.getKeyName());
		
		if(theCarKey.getKeyName().equals(carLockName)) {
			System.out.println("UnLocking the Car...");
		}
		else {
			//System.out.println("Pairing failed..unable to unLockIt..");
			CarUnLockException rte = new CarUnLockException("Unable to unlock the Car");
			throw rte; //literally throwing it 
		}
	}
}
class Car
{
	private CarLock carLock = new CarLock(); //hasA
	private String carName;
	
	public Car(String string, String lockPattern) {
		this.carName = string;
		carLock.setCarLockName(lockPattern);
	}
	
	void openTheCar(CarKey carKey) throws CarUnLockException //propagating it 
	{
		System.out.println("Opening..."+carName);
		carLock.unlockIt(carKey); //u press a unlock button on the key
	}
	void lockTheCar(CarKey carKey) throws CarLockException
	{
		System.out.println("Closing.."+carName);
		carLock.lockIt(carKey); //u press the lock button on the key 
	}
	
	void shortDrive() {
		System.out.println("start the car....");
		for(int i=1;i<=5;i++) {
			System.out.println("Short drive over..."+i+" kms");
			if(i==3) {
				carLock.setCarLockName("HONDA1111");
			}
		}
	}
}
/*

Key						  Lock		
|							|			
CarKey					CarLock
 |							|
 ---------				---------------------------------------------
 |		  |				|			|			|			    |
 keyName getKeyname()	lockName  setLockName() lockIt(CarKey)  unLockIt(CarKey)
 		 
 			
					Car
					|
	----------------------------------------------------------------------
		|					|								|	    |
		String  carName		Car("HondaCity","Honda1234") openCar() closeCar()
		CarLock carLock 
				
					
	Automatic door locking system - lock is already engraved inside the door


	manually locking system - Godrej lock and key [ should be together ]












*/