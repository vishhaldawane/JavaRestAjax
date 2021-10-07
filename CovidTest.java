package com.java.covid;

public class CovidTest {

    public static void main(String []args){
       System.out.println("Hello World");
       
       CoronaVirus coronaVirus = new CoronaVirus();
       Human theHuman = new Human();
       
       
       Covid covid = theHuman.infected(coronaVirus);
       System.out.println("covid "+covid);
       
    }
}

class Virus {
   
}
class CoronaVirus extends Virus { //isA
   
}
class Mammal {
   
}

class Heart {
	
}

class Human extends Mammal { //isA
   
   Heart theHeart = new Heart(); //hasA
   
   Covid  infected(CoronaVirus cv) {
       Covid cov = new Covid();
       return cov;
   }
}

class Disease { //   dis Ease 
   
}
class Covid extends Disease { //isA 
   
}