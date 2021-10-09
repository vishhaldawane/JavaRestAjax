package com.java.collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		//u cannot add primitive values in the Collection
		TreeSet numSet = new TreeSet();
		System.out.println("Container is ready...");

		//sequential IN order
		numSet.add(10); //what is this then? is it int??NO, it is wrapper, Integer
		numSet.add(5);
		numSet.add(15); //internally it is boxed into Integer - autoboxing
		numSet.add(7);
		numSet.add(3);
		numSet.add(3);
		numSet.add(11);
		numSet.add(18);
		numSet.add(3);
		numSet.add(18);
		
		System.out.println("Data is added");
		
		Iterator iter = numSet.iterator();
		while(iter.hasNext()) {
			Integer value = (Integer) iter.next(); //OUT order is not same as IN
			System.out.println("value : "+value);
		}
		
	}
}
/*

10 5 15 7 3 12 18 - non linear

				root
				| 10
		-----------------
		|			|
		L			R
		|5			| 15
	---------	---------
	|		|	|		|
	3		7   11		18

*/