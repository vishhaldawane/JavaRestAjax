package com.dassault;


public class CricketPlayer extends Player  //isA
{
	int rank;
	String name;
	String country;
	int totalRunsMadeTillNow;
	int totalSixersHit;
	int totalFourRunsHit;
	int currentRun;
	int age;
	float strikeRate;
	
	public CricketPlayer(int rank, String name, String country, int totalRunsMadeTillNow, int totalSixersHit,
			int totalFourRunsHit, int currentRun, int age, float strikeRate) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.totalRunsMadeTillNow = totalRunsMadeTillNow;
		this.totalSixersHit = totalSixersHit;
		this.totalFourRunsHit = totalFourRunsHit;
		this.currentRun = currentRun;
		this.age = age;
		this.strikeRate = strikeRate;
	}

	@Override
	public String toString() {
		return "CricketPlayer [rank=" + rank + ", name=" + name + ", country=" + country + ", totalRunsMadeTillNow="
				+ totalRunsMadeTillNow + ", totalSixersHit=" + totalSixersHit + ", totalFourRunsHit=" + totalFourRunsHit
				+ ", currentRun=" + currentRun + ", age=" + age + ", strikeRate=" + strikeRate + "]";
	}
	
	public void printCricketPlayer() {
		System.out.println("Rank       : "+rank);
		System.out.println("Name       : "+name);
		System.out.println("Country    : "+country);
		System.out.println("Total Runs : "+totalFourRunsHit);
		System.out.println("Sixers     : "+totalSixersHit);
		System.out.println("Four Runs  : "+totalFourRunsHit);
		System.out.println("Age        : "+age);
		System.out.println("StrikeRate : "+strikeRate);
		System.out.println("--------------------------------");
		
	}
	
	
}
