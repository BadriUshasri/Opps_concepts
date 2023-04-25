package com.Inter;

public class Gametest {
	public static void main(String[] args) {
		Games g1 = new Cricket();
		g1.Gamename();
		g1.teammembers();
		g1.Score();
		g1.time();
		
		
		Games g2 = new football();
		g2.Gamename();
		g2.teammembers();
		g2.Score();
		g2.time();
		
		
		Kabbadi g3 = new Kabbadi();
		g3.Gamename();
		g3.teammembers();
		g3.Score();
		g3.time();
		
		
		Basketball g4 = new Basketball();
		g4.Gamename();
		g4.teammembers();
		g4.Score();
		g4.time();
	}

}
