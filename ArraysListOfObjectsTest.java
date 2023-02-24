import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.dassault.CricketPlayer;

public class ArraysListOfObjectsTest {

	public static void main(String[] args) {
		
		//content
		CricketPlayer player1 = new CricketPlayer(3, "Sachin Tendulkar", "India", 12000, 300, 200, 89, 25, 78.3f);
		CricketPlayer player2 = new CricketPlayer(5, "Virat Kohli", "India",      11000, 200, 100, 59, 23, 79.2f);
		CricketPlayer player3 = new CricketPlayer(1, "Virendra Sehvag", "India",   9000, 100, 140, 79, 22, 56.4f);
		CricketPlayer player4 = new CricketPlayer(8, "MS Dhoni", "India",         12000, 750, 140, 84, 29, 89.3f);
		CricketPlayer player5 = new CricketPlayer(4, "Yuvraj Singh", "India",     7000, 130, 200, 34, 27, 38.7f);
		
		//container
		ArrayList        teamIndiaList = new ArrayList(); //10
		
		//adding the content in the container
		teamIndiaList.add(player1); //added as an Object
		teamIndiaList.add(player2);
		teamIndiaList.add(player3);
		teamIndiaList.add(player4);
		teamIndiaList.add(player5);
		
		for (int i = 0; i < teamIndiaList.size(); i++) { //its 11 - 5 are assigned
			CricketPlayer x = (CricketPlayer) teamIndiaList.get(i);
			x.printCricketPlayer();	
		}
	}

}
