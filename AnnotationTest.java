package com.java.reflection;

import java.lang.annotation.Annotation;

import com.java.reflection.airline.Flight;

public class AnnotationTest {
	public static void main(String[] args) {
		Flight flObj = new Flight(101);
		
		Class reflection = flObj.getClass();
		Annotation annos [] = reflection.getAnnotations();
		
		for(Annotation anno : annos)
		{
			System.out.println("Annotation is : "+anno);
			if(anno instanceof DesignedBy) {
				DesignedBy db = (DesignedBy) anno;
				if(db.developer().equalsIgnoreCase("vishhal")) {
					if(db.version() == 1.0 ) {
						flObj.fly();
					}
					else {
						System.out.println("Invalid flight version..expected 1.0");
					}
				}
				else {
					System.out.println("Invalid developer..expected vishhal..");
				}
			}
		}
		System.out.println("End");
	}
}
















class Test
{
	void fun() {}
}
class Tester extends Test {
	
	/*Override*/
	@Override //extended versions of comments
	void fun() {
		
	}
}
/*

 	Comment			vs		Annotation
 	|						|
 	simple comment			extended version of comments
 	not compiled			compiled
 	not structured			structured
 	not paramterized		parameterized
 
*/ 
 
