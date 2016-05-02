package edu.saintjoe.cs.wills.GameCollection;

public class Collection{
	
	public static final int MAXSGAMES = 25;	
	
	
	private String title;
	private String owner;
	private Game[] games;



	public Collection(String newTitle, String newOwner) {
		title = newTitle;
		owner = newOwner;
		games = new Game[MAXSGAMES];
		}
	
	public void setGame(Game nextGame, int whereAt) {
		
			
			games[whereAt] = nextGame;
		
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


