package edu.saintjoe.cs.wills.GameCollection;


public class GameTestDriver {

	public static void main(String[] args) {
		int gameCount = 0;
		
		Collection wills = new Collection("will's collection", "William Smith");
		
		Game nextGame = new Game ("Call of Duty 3", "First-person shooter");
		wills.setGame(nextGame, (gameCount++));
		nextGame = new Game("Madden 16", "Sports");
		wills.setGame(nextGame, gameCount++);
		System.out.println(wills.toString());
	}

}
