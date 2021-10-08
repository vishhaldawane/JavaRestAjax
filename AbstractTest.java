package com.java.abstracttest;

public class AbstractTest {
	public static void main(String[] args) {
		//Cannot instantiate the type MusicalInstrument
		MusicalInstrument mi = new Guitar();
		mi.play();				//mi.tuneStrings();		//mi.pluck();
		System.out.println("--------");
		StringBasedMusicalInstrument sbmi = new Guitar();
		sbmi.play();				sbmi.tuneStrings();		
		//sbmi.pluck();
		System.out.println("--------");
		Guitar myGuitar = new Guitar();
		myGuitar.play();		myGuitar.tuneStrings();				myGuitar.pluck();
	}
}
//INHERITANCE OF IMPLEMENTATION
abstract class MusicalInstrument /*abstract means incomplete  */{
	//method without the body = incomplete = abstract 
	abstract void play(); //play this musical instrument
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneStrings(); //just the declaration here
}
class Guitar extends StringBasedMusicalInstrument {
	void tuneStrings() { System.out.println("Tuning the Guitar strings...."); }
	void play() {		System.out.println("Playing the Guitar...");          }
	void pluck() { System.out.println("Plucking the Guitar..");  }
}





//we are made up of sound - we cannot realize that 
//at the experitial level

/*
 * 
 * "abstract images" are painted in ArtGallery
 		|
 	------------------------------
 	|		|		|		|	|
 	forest  ghost cloud  face	flower
 	
 	
	can u think of an Instrument	- No - 			pure partial contract
	can u think of a  MusicalInstrument				partial 
	can u think of a  StringBasedMusicalInstrument  partial with specification
	can u think of a  Guitar						concrete
	can u think of an ElectronicGuitar				concrete of concrete
	
	1stGen machine
	2ndGen assembly
	3rdGen C
	4thGen Java
	5thGen Machine learning
	
	Framework = semi developed application

0									Instrument - pure partial contract - interfaces
										| use();
			------------------------------------------------------------------------------------
			|																			|
1	MusicalInstrument																MedicalInstrument
			|play();																			| operate();						
	------------------------------------------------------------						------------------------------------------
	|							|							 |							|							|
2 StringBasedMusicalInstrument	AirbasedMusicalInstrument DrumBasedMusicalInstrument	SurgicalMedicalInstruent	PathalogicalMedicalInstrument
			|tuneStrings();					|blowAir();		 |tapSurface();				| steralizeIt();			| countIt()								
   -------------------------		------------------	--------------				----------------			----------------------
  |			|			|		    |		|			|		|					|			|				|				|
3 Guitar	Sitar		Violin		Flute	Trumpet		Duff	Dholak		SurgicalCutter  SurgicalNeedle		ECGMachine	GlucoMeter
  |pluck()   ting()     bowing()	operate										cut()			poke()			countCG()	  countSugar()		
  |									7 holes
4 ElectronicGuitar
 	preset()







*/


