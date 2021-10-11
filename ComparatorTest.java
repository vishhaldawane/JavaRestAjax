package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorTest {
	public static void main(String[] args) {

		ArrayList<Song> jukeBox = new ArrayList<Song>();

		String choice="n";
		
		do
		{
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter song title  : ");
			String title = scan1.nextLine(); // i want it that way <-|
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter song artist : ");
			String artist = scan2.nextLine();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter song album : ");
			String album = scan3.nextLine();
	
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Enter song year  : ");
			int year = scan4.nextInt();
			
			Song temp = new Song(title,artist,album,year);
			
			jukeBox.add(temp);

			Scanner scan5 = new Scanner(System.in);
			System.out.println("Do you wish to add more songs ? (y/n) ");
			choice = scan5.nextLine();
			
			System.out.println("--------------------");
			
		} while(choice.equalsIgnoreCase("y"));
		
		
		Song s1 = new Song("I Want It That Way","Backstreet Boys","Millenium",1998);
		Song s2 = new Song("My Heart Will Go On","Celine D","Titanic",1995);
		Song s3 = new Song("Zhingat","Ajay Atul","Sairat",2015);
		Song s4 = new Song("Kolavari","Dhanush","Kolawari",2010);
		Song s5 = new Song("Dil Se Re","A.R. Rehman","Dil Se",2005);
		
		
		jukeBox.add(s1);	jukeBox.add(s2);		jukeBox.add(s3);
		jukeBox.add(s4);	jukeBox.add(s5);		
		
		//the for each loop
		//for(Song theSong : jukeBox) { // no iterator required
		//	System.out.println("Song : "+theSong);
		//}
		
		//Sorts the specified list into ascending order, 
		//according to the natural ordering of its elements. 
		//All elements in the list must implement the Comparable interface.
		//System.out.println("Sorting...");
		//Collections.sort(jukeBox); // wlll go for Comparable
		//System.out.println("Sorted...");
		
		//for(Song theSong : jukeBox) { // no iterator required
		//	System.out.println("Song : "+theSong);
		//}
		
		System.out.println("--now lets sort it based on other columns too--");
		
		int sortChoice=0;
		
		Comparator<Song> cmp = null;

		do {
			System.out.println("Sort by ");
			System.out.println("-----------");
			System.out.println("1. Title");
			System.out.println("2. Album");
			System.out.println("3. Artist");
			System.out.println("4. Year");
			System.out.println("5. Exit");
			System.out.println("-----------");
			System.out.println("Sort Choice :  ");
			Scanner scan6 = new Scanner(System.in);
			sortChoice = scan6.nextInt();
			switch(sortChoice) {
				case 1: cmp = new TitleComparator(); break;
				case 2: cmp = new AlbumComparator(); break;
				case 3: cmp = new ArtistComparator(); break;
				case 4: cmp = new YearComparator(); break;
				case 5: System.out.println("Exiting...");
			
			}
			Collections.sort(jukeBox, cmp ); //going with Comparator 
			for(Song theSong : jukeBox) { // no iterator required
				System.out.println("Song : "+theSong);
			}
			System.out.println("====================");
		} while(sortChoice!=5);
		
	}
}

class YearComparator implements Comparator<Song> {
	public int compare(Song x, Song y) {
		System.out.println("YearComparator : comparing "+x.getYear()+" with "+y.getYear());
		return Integer.compare(x.getYear(), y.getYear());
	}
}

class ArtistComparator implements Comparator<Song> {
	public int compare(Song x, Song y) {
		System.out.println("AristComparator : comparing "+x.getArtist()+" with "+y.getArtist());
		return x.getArtist()    .compareTo(    y.getArtist()     );

	}
}
class AlbumComparator implements Comparator<Song> {
	public int compare(Song x, Song y) {
		System.out.println("AlbumComparator : comparing "+x.getAlbum()+" with "+y.getAlbum());
		return x.getAlbum()    .compareTo(    y.getAlbum()     );

	}
}
class TitleComparator implements Comparator<Song> {
	public int compare(Song x, Song y) {
		System.out.println("TitleComparator : comparing "+x.getTitle()+" with "+y.getTitle());
		return x.getTitle()    .compareTo(    y.getTitle()     );

	}
}

/*
 *   reality shows
 *   			Comparable
 *   			|				|			|
 *   			dancer1 ,		dancer2,   dancer3 .....
 * 
 * 
 * 
 * 			Energy	Steps	Theme <-- comparators 
 * 			Judge1  Judge2	Judge3
 * 
 * 		Mirror <--> She (rita) | earRings, necklace, makeup .....
 * 
 * 		Party <-- (rita) | julie | reema | sita | 
 * 
 * 	   Theme  dress		energy
 * 		man1  woman2  oldman3 <-- comparators
 * 		
 */

//annotation  - 2 days for REST API

//The type Song must implement the inherited abstract method
//Comparable<Song>.compareTo(Song)
class Song  implements Comparable<Song> 
{
	private String title;
	private String artist;
	private String album;
	private int year;
	
	public int compareTo(Song o) { //s1.compareTo(s2);
		System.out.println("Comparable : comparing "+o.year+" with "+year);
		return Integer.compare(o.year, year);
	}
	
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	

	
}