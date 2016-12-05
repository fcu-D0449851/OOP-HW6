package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private Pokemon[] pokemons;
	private int level=1;

	public Player(String playerName){
		this.playerName=playerName;
	}
	
	public String getPlayerName(){
		return playerName;
	}
	
	public Pokemon[] getPokemons(){
		return pokemons;
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setPlayerName(String playerName){
		this.playerName=playerName;
	}
	
	public void setPokemons(Pokemon[] pokemons){
		this.pokemons=pokemons;
	}
	
	public void setLevel(int level){
		this.level=level;
	}
}
