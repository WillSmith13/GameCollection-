package edu.saintjoe.cs.wills.GameCollection;

public class Game {
	private String name;
	private String genre;


public Game(String newName, String newGenre) {
	name = newName;
	genre = newGenre;
	
}
	public void setName(String newName) {
	name = newName;
}
	public String getName() {
	return name;
}
	public void setGenre(String newGenre) {
		genre = newGenre;
	}
	public String getGenre() {
		return genre;
	}
	public String toString() {
		return ("Game: " + name + " Genre: " + genre) ;
	}
	public void setGame(Game nextGame, int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}



