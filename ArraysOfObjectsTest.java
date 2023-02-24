import java.util.Arrays;
import java.util.Iterator;

import com.dassault.CricketPlayer;

public class ArraysOfObjectsTest {

	public static void main(String[] args) {
		
		//content
		CricketPlayer player1 = new CricketPlayer(3, "Sachin Tendulkar", "India", 12000, 300, 200, 89, 25, 78.3f);
		CricketPlayer player2 = new CricketPlayer(5, "Virat Kohli", "India",      11000, 200, 100, 59, 23, 79.2f);
		CricketPlayer player3 = new CricketPlayer(1, "Virendra Sehvag", "India",   9000, 100, 140, 79, 22, 56.4f);
		CricketPlayer player4 = new CricketPlayer(8, "MS Dhoni", "India",         12000, 750, 140, 84, 29, 89.3f);
		CricketPlayer player5 = new CricketPlayer(4, "Yuvraj Singhr", "India",     7000, 130, 200, 34, 27, 38.7f);
		
		//container
		CricketPlayer  teamIndia[]= new CricketPlayer[11];
		
		//adding the content in the container
		teamIndia[0] = player1;
		teamIndia[1] = player2;
		teamIndia[2] = player3;
		teamIndia[3] = player4;
		teamIndia[4] = player5;
		
	//	System.out.println("team india : "+Arrays.toString(teamIndia));
		
		try {	
			for (int i = 0; i < teamIndia.length; i++) { //its 11 - 5 are assigned
				//CricketPlayer x = teamIndia[i];
				//x.printCricketPlayer();
				System.out.println("team india : "+teamIndia[i]);
				teamIndia[i].printCricketPlayer();
			}
			
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
