package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class PhoneContact // not a phone log
{
	String contactName;
	String contactNumber; //in string
	String emailAddress;
	public PhoneContact(String contactName, String contactNumber, String emailAddress) {
		super();
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "PhoneContact [contactName=" + contactName + ", contactNumber=" + contactNumber + ", emailAddress="
				+ emailAddress + "]";
	}

}
public class LinkedListTest {
	public static void main(String[] args) {
		
		//flexibility vs efficiency
		
		//ArrayList<PhoneContact> myPhoneBookList = new ArrayList<PhoneContact>();
		
		LinkedList<PhoneContact> myPhoneBookList = new LinkedList<PhoneContact>();
		System.out.println("Container is ready....");
		
		PhoneContact phCtx1 = new PhoneContact("Vishhal", "9820443464", "vishalviniing@gmail.com");
		PhoneContact phCtx2 = new PhoneContact("Ganesh", "7820443464", "ganesh@gmail.com");
		PhoneContact phCtx3 = new PhoneContact("Advait", "8820443464", "advait@gmail.com");
		PhoneContact phCtx4 = new PhoneContact("Deven", "770443464", "deven@gmail.com");
		PhoneContact phCtx5 = new PhoneContact("Jayesh", "6620443464", "jayesh@gmail.com");
		System.out.println("Phone contacts are ready...");
		
		myPhoneBookList.add(phCtx1); //ptr->next  ptr->prev is managed internally
		myPhoneBookList.add(phCtx2);
		myPhoneBookList.add(phCtx3);
		myPhoneBookList.add(phCtx4);
		myPhoneBookList.add(phCtx5);
		System.out.println("All the contacts are added....");
		
		
		Iterator<PhoneContact> contactIterator = myPhoneBookList.iterator();
		//ctrl+shift+M
		while(contactIterator.hasNext()) {
			PhoneContact theContact = contactIterator.next(); //ptr->next
			System.out.println("Contact is : "+theContact);
		}
		System.out.println("-------");
		PhoneContact ctx = myPhoneBookList.get(3);
		System.out.println("ctx "+ctx);
		if(myPhoneBookList.contains(phCtx2)) {
			System.out.println("Yes it has it");
		}
		else {
			System.out.println("It doesnt have it..");
		}
		
	}
}
/*
 * 
 * not made for efficiency  - it is flexibile
 

		1		    2			3		  4
	+-------+	+-------+	+-------+	+-------+
	|0  	|<--|100	|<--|800	|<--|300	| <-- prev pointer
	|	34	|	|	55	|	|	44	|	|	55	| <--data
	|	 800|-->|	 300|-->|	 600|-->|	   0| <-- next pointer
	+-------+	+-------+	+-------+   +-------+
	100			800			300			600
	
	PhoneContact
	|
	34
	Vishal
	9820443464
	vishalviniing@gmail.com
	
	55
	Ganesh
	737474745
	ganesh@gmail.com
	
	
*/