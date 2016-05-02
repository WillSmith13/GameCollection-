package edu.saintjoe.cs.wills.GameCollection;

public class Collection{
	
	public static final int MAXSGAMES = 25;



	private static final int MAXGAMES = 0;

	
	
	private String title;
	private String owner;
	private Game[] games;


	public void Game(String newTitle, String newOwner) {
		title = newTitle;
		owner = newOwner;
		games = new Game[MAXGAMES];
		}
public String toString() {
		
		String output = "";
		output = "Game information for " + title + " collected by: " + owner + "\n";
		
		for (Game oneGame: games) {
			if (oneGame == null)
				break;
			output += oneGame.getName() + oneGame.getGenre() + "" + "\n";
			}
		return output;
	}
	
	
	
	
}


