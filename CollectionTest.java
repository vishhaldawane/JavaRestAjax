package com.java.collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * in our smart phone a phone log is generated, vodafone
 * 2005 2021
 * 
 * logs, playlist,
 * 
 * vlc media player - playlist - add song the song in it, twice 
 * 
 * 		---------			   name   logType    atwhatTime duration
 * 	0	|  100	---------> 100 "Julie","missed"
 * 		---------					 name   logType    atwhatTime duration
 * 	1	|  200	--------------->200	"Julia","recieved"
 * 		---------
 * 	2	|  300	---------> 300 flno	flightname	source destn
 * 		---------
 * 	3	|  250  =============>  name   logType    atwhatTime duration
 * 		---------			 250	"John","recieved"
 * 	4	|  60	-------->"sachin tendulakar"
 * 		---------			60
 * 		|		|
 *           ^
  		    / \	
  			 |
  			 |
  			
 */

class PhoneLog {
	
	String name;
	String logType;
	LocalDateTime atWhatTime;
	float duration;
	public PhoneLog(String name, String logType, LocalDateTime atWhatTime, float duration) {
		super();
		this.name = name;
		this.logType = logType;
		this.atWhatTime = atWhatTime;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "PhoneLog [name=" + name + ", logType=" + logType + ", atWhatTime=" + atWhatTime + ", duration="
				+ duration + "]";
	}
	
}
class Flight { }
public class CollectionTest {
	public static void main(String[] args) {
		
		ArrayList<PhoneLog> myList = new ArrayList<PhoneLog>(); //container = Glass
		System.out.println("=>Container is ready...");
		
		PhoneLog log1 = new PhoneLog("Julie","missed",LocalDateTime.of(2021, 10, 9, 10, 30, 33),0);
		PhoneLog log2 = new PhoneLog("Julia","recieved",LocalDateTime.of(2021, 10, 9, 11, 40, 33),12);
		PhoneLog log3 = new PhoneLog("John","recieved",LocalDateTime.of(2021, 10, 9, 12, 20, 13),5);
		PhoneLog log4 = new PhoneLog("Jane","dailled",LocalDateTime.of(2021, 10, 9, 13, 40, 23),15);
		PhoneLog log5 = new PhoneLog("Smith","missed",LocalDateTime.of(2021, 10, 9, 14, 35, 53),0);
		//Type safety: The method add(Object) belongs to the raw type ArrayList.
		//References to generic type ArrayList<E> should be parameterized
		myList.add(log1); //content is added - ButterMilk
		myList.add(log2);
		myList.add(log5);
	//	myList.add(new Flight());
		myList.add(log3);
		//myList.add("sachin tendulakar");
		myList.add(log4);
	//	myList.add(100);
		myList.add(log5);
		myList.add(log3);
	//	myList.add("Lata mangeshkar");
		
		System.out.println("=>Added contents in the container...");
		
		Iterator<PhoneLog> myIter = myList.iterator(); // iterator - Straw
		System.out.println("=>Got the iterator...");
		
		//a sag is given - thorns  petal chocolates pen earasers sharpner
		while(myIter.hasNext()) {
			
			PhoneLog value =  myIter.next();
			System.out.println("value : "+value);
			
			/*Object obj = myIter.next(); //let the obj hold the item 
			
			
			if(obj instanceof Integer) {
				Integer i = (Integer) obj;
				System.out.println("number  : "+i);
			}
			else if(obj instanceof PhoneLog) {
				PhoneLog value = (PhoneLog) obj;
				System.out.println("value : "+value);
			}
			else if(obj instanceof String) {
				String str = (String) obj;
				System.out.println("String is : "+str);
			}*/
		}
		
	}
}



/* 
  
  WE R IN A FORM!!!!
  60 TRILLION CELLS - VISIBLE
  
    				who
    				|?
    			----------
    			|		|
    			where	when
    			|space	 |time
    		------------------------
    		|		|			|
    		why		what		how
    		reason  inFORMation implementation
    		
    what type of data stored?
  storage   - efficiency - flexibility - iteration - algorithm

			Iterable (i)
				|
			Collection (i)						Map (i)
				|								|key,value
		----------------------				--------------
		|					|				|			|
		List(i)				Set (i)			TreeMap	HashMap
		|duplicates			|unique
	-------------		--------------
	|			|		|			|
ArrayList	LinkedList	TreeSet		HashSet 10 20 30
growable	train			binary       book shelf
array		compartments		Root		|-----------|
	10 20 30   10 20 30 	10 20 30		|data		|	comics	|
						--------------		|-----------|
						  |	data	|data   |books|mags |
						  L			R		-------------
						  |			|		|sci|fiction|
						------		------	-------------
						|	 |		|   |
						L    R      L   R
				
				olx - selling your used items
				
					person - sag	
						
				Collections<--utilities [ algoritms ]
		
		Comparator				Comparable


			components orthogonal space
			
	
			
						x -- data type
						|		ButterMilk@
						|		CoconutWater#
						+		FriedRice*
                       / \		Pickle!
					  /   \ 	PaneerChilly&
					 /     \	Noodles~
					/       \   Papad ^
			   	   y----i----z
				   |	|	 | 	
		   Container    |    Algorithm
				|	Iterator	|
		@	Glass	  Straw	    drink()
		#	Coconut	  Straw     drink()
		*	Plate	  Spoon      eat()  
		!	Plate	  Finger	lick()	
		&	Plate	  Fork		 eat()
		~	Bowl	  ChopSticks eat()	
			Bottle    Straw		drink()
			Bottle    Stirrer    stir()

				indian thali
		bowl1  bowl2  bowl2		bowl3
		|		|		|		|
		dal	  curry gulabjamun raita
		
		single plate
		|
		rice dal - 
	
		Cup+Saucer 		Mug

		\  /@
	   =======


*/


interface Graphics
{
	void flip();
}
interface GraphicalCard extends Graphics
{
	void show();
}
class TvTunerCard implements GraphicalCard {

	@Override
	public void flip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
