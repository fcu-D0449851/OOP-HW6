package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM {
	public static void fight(Player... players){
		Random random = new Random();
		Player winPlayer;
		int i,wincount0=0,wincount1=0;
		
		for(i=0;i<3;i++)
		{
		if(players[0].getPokemons()[i].getType()==PokemonType.FIRE
		&&players[1].getPokemons()[i].getType()==PokemonType.GRASS)
		{	
		players[0].setLevel(players[0].getLevel()+1);	
		wincount0++;
		}

		if(players[0].getPokemons()[i].getType()==PokemonType.GRASS
		&&players[1].getPokemons()[i].getType()==PokemonType.WATER)
		{	
		players[0].setLevel(players[0].getLevel()+1);	
		wincount0++;
		}
		
		if(players[0].getPokemons()[i].getType()==PokemonType.WATER
		&&players[1].getPokemons()[i].getType()==PokemonType.FIRE)
		{	
		players[0].setLevel(players[0].getLevel()+1);	
		wincount0++;
		}
		
		if(players[1].getPokemons()[i].getType()==PokemonType.FIRE
		&&players[0].getPokemons()[i].getType()==PokemonType.GRASS)
		{
		players[1].setLevel(players[1].getLevel()+1);	
		wincount1++;
		}
		
		if(players[1].getPokemons()[i].getType()==PokemonType.GRASS
		&&players[0].getPokemons()[i].getType()==PokemonType.WATER)
		{
		players[1].setLevel(players[1].getLevel()+1);	
		wincount1++;
		}
				
		if(players[1].getPokemons()[i].getType()==PokemonType.WATER
		&&players[0].getPokemons()[i].getType()==PokemonType.FIRE)
		{
		players[1].setLevel(players[1].getLevel()+1);	
		wincount1++;
		}
		
		if(players[0].getPokemons()[i].getType()==players[1].getPokemons()[i].getType())
		{
			if(players[0].getPokemons()[i].getCp()>players[1].getPokemons()[i].getCp())
			{	
			players[0].setLevel(players[0].getLevel()+1);	
			wincount0++;
			}
			else if(players[0].getPokemons()[i].getCp()<players[1].getPokemons()[i].getCp())
			{
			players[1].setLevel(players[1].getLevel()+1);	
			wincount1++;		
			}
			else if(players[0].getPokemons()[i].getCp()==players[1].getPokemons()[i].getCp())
			{
				if(random.nextInt(2)==0){
					players[0].setLevel(players[0].getLevel()+1);	
					wincount0++;
				}
				else{
					players[1].setLevel(players[1].getLevel()+1);	
					wincount1++;
				}
			}
		}
		
		}
		
		if(wincount0>wincount1){
			System.out.println("\"Winner is ["+players[0].getPlayerName()+"], and his/her level becomes ["+players[0].getLevel()+"].\"");
			 winPlayer=players[0];
		}
		else if(wincount1>wincount0){
			System.out.println("\"Winner is ["+players[1].getPlayerName()+"], and his/her level becomes ["+players[1].getLevel()+"].\"");
			winPlayer=players[1];
		}
		//	return winPlayer;
		
	}
}
	


