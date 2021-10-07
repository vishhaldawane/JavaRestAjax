public class HelloWorld{

     public static void main(String []args){
     
		System.out.println("Begin of main");
		MyCalculator myCalci = new MyCalculator();
		myCalci.divide(100, 5);		
		myCalci.divide(45, 5);
		myCalci.divide(55, 0);		
		myCalci.divide(78, 3);
		myCalci.divide(33, 11);
		System.out.println("End of main");
	}
	
     
}

class MyCalculator {
	void divide(int num, int den) {
		System.out.println("\tBegin divide()");
		System.out.println("\tnum : "+num);
		System.out.println("\tden : "+den);
		System.out.println("\tDividing "+num+" by "+den);
		
		if(den!=0) {
			int division = num / den;
			System.out.println("\tdiv : "+division);
		}
		else {
			System.out.println("\tCannot divide "+num+ " by "+den);
		}
		
		System.out.println("\tEnd divide()");
		System.out.println("\t----------------");
	}
}