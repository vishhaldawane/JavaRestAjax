package com.java.collections;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
//element1.compareTo(element2);  kite1.kiteFight(kite2)
class ChemicalElement implements Comparable<ChemicalElement> //isA 
{
	int atomicNumber;		//1
	String elementName;		//Hydrogen
	String atomicFormula;	//H
	double atomicWeight;   //1.008
	
	/*
	 * @Override public int compareTo(ChemicalElement o) { //the value 0 if x == y;
	 * //a value less than 0 if x < y; //and a value greater than 0 if x > y
	 * System.out.println("compareTo is invoked...comparing "+atomicNumber+" with "
	 * +o.atomicNumber); return Integer.compare(atomicNumber, o.atomicNumber); }
	 */
	
	@Override
	public int compareTo(ChemicalElement o) {
		//the value 0 if x == y; 
		//a value less than 0 if x < y; 
		//and a value greater than 0 if x > y
		System.out.println("compareTo is invoked...comparing "+elementName+" with "+o.elementName);
		return elementName.compareTo(o.elementName);
	}
	public ChemicalElement(int atomicNumber, String elementName, String atomicFormula, double atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.elementName = elementName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", elementName=" + elementName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
}
public class TreeSetTest2 {
	public static void main(String[] args) {
		//u cannot add primitive values in the Collection
		
		//ArrayList numSet = new ArrayList();
		//LinkedList numSet = new LinkedList();
		//HashSet numSet = new HashSet();
		
		TreeSet<ChemicalElement> periodicTableSet = new TreeSet<ChemicalElement>();
	
		System.out.println("Container is ready...");;;

		ChemicalElement element1 = new ChemicalElement(1,"Hydrogen","H",1.0008);
		ChemicalElement element2 = new ChemicalElement(5,"Boron","B",10.81);
		ChemicalElement element3 = new ChemicalElement(14,"Silicon","Si",28.085);
		ChemicalElement element4 = new ChemicalElement(3,"Lithium","Li",6.94);
		ChemicalElement element5 = new ChemicalElement(2,"Helium","He",4.0026);
		ChemicalElement element6 = new ChemicalElement(6,"Carbon","C",12.011);
		
		/*
		 * 				6	
		 * 				|
		 * 			----------
		 * 			|5		  |14
		 * 		-------		-------
		 * 		|	   |	|	 |
		 * 		3				 	
		 * 		|
		 * 	---------
		 * 			|
		 * 			2				 
		 */
		//sequential IN order
		System.out.println("Adding the 1st element");
		periodicTableSet.add(element1); //what is this then? is it int??NO, it is wrapper, Integer
		System.out.println("----------");
		
		periodicTableSet.add(element2); //what is this then? is it int??NO, it is wrapper, Integer
		System.out.println("----------");
		
		periodicTableSet.add(element3); //what is this then? is it int??NO, it is wrapper, Integer
		System.out.println("----------");
		
		periodicTableSet.add(element4); //what is this then? is it int??NO, it is wrapper, Integer
		System.out.println("----------");
		
		periodicTableSet.add(element5); //what is this then? is it int??NO, it is wrapper, Integer
		System.out.println("----------");
		
		
		Iterator<ChemicalElement> iterator = periodicTableSet.iterator();
		while(iterator.hasNext()) {
			ChemicalElement element = iterator.next();
			System.out.println("Element : "+element);
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