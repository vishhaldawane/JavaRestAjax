package com.java.collections;

import java.util.ArrayList;

public class JuiceTest {

	public static void main(String[] args) {
		JuiceShop js = new JuiceShop();
		js.prepare();
	}
}

class JuiceShop {
	
	ArrayList<Juice> juiceList = new ArrayList<Juice>();
	
		void prepare() {
			Mango m = new Mango("Alphanso");
			Apple a = new Apple("Kashmiri Apple");
			
			Juice jc1 = new Juice(m);
			Juice jc2 = new Juice(a);

			System.out.println("jc1 "+jc1.f.fruitName);
			System.out.println("jc2 "+jc2.f.fruitName);
			
			
			juiceList.add(jc1);
			juiceList.add(jc2);
			
		}
	
}
class Fruit { 
	String fruitName;
}
class Mango extends Fruit { 
	Mango(String s) {
		super.fruitName=s;
	}
}
class Apple extends Fruit { 
	Apple(String s) {
		super.fruitName=s;
	}
	
}

class Juice  { 
	Fruit f;
	Juice(Fruit r) {
		f = r;
	}
	void juiceDetail() {
		System.out.println("its a juice of "+f);
	}
}