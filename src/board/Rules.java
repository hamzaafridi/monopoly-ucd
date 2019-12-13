package board;

import java.util.List;

import player.Player;
import player.Token;
import utils.Utils;

/**
 * all board rules are defined here
 * @author Hamza Afridi
 * @version 0.1
 * @since 05-12-2019
 */
public class Rules {
	
	/**
	 * to check if the input of the number of players is correct
	 * @return returns true only when the number of players are within range min max 
	 */
	static public boolean checkNumberofUsers(int number)
	{
		int minP = 2;
		int maxP = 6;
		
		if ((number>=minP & number<=maxP))
		{
			return true;
		}
		else
		{
			System.out.println("\nIncorrect input: Please enter number between 2-6!");
			return false;
		}
		
	}
	
	/**
	 * to check if the token number entered by the user is correct
	 * @return true if the token number is correct else false
	 */
	static public boolean checkTokenInput(int number, List<Token> tokens)
	{
		if(tokens.size()<number & number>=0)
			return true;
		else
			return false;
		
	}
	
	/**
	 * dice roll check to see if 12 is repeated 3 times
	 * @param number, is the input from the dice
	 * @iter is the iteration number
	 * @return if iteration =3 which means it's a third roll and it is 12 aswell then return true else false
	 */
	static public boolean diceRule(int number, int iter)
	{
		if(number == 12 & iter < 3)
			return true;
		else
			return false;
	}
	
	/**
	 * dice roll check to see if 12 is repeated 3 times
	 * @param number, is the input from the dice
	 * @iter is the iteration number
	 * @return if iteration =3 which means it's a third roll and it is 12 aswell then return true else false
	 */
	static public boolean diceRuleJail(int number, int iter)
	{
		if(number == 12 & iter == 3)
			return true;
		else
			return false;
	}
	
	/**
	 * winner rule, returns winner as the one with the most number of cash in bank.
	 * @param player list of all players
	 * @return player winner
	 */
	public static Player winner(List<Player> player) {
		Player winner = player.get(0);
		for (int i=0;i<player.size();i++)
		{
			if(winner.getAmount()<player.get(i).getAmount())
				winner = player.get(i);
		}
		return winner;
	}
	/**
	 * auction method for testing out everything
	 * @param player list of all the players playing
	 * @param currentTile is the tile that is being auctioned
	 * @return
	 */
	public static List<Player> auction(List<Player> player, Property currentTile,Utils input) {
		
		boolean[] auction = new boolean[player.size()];
		int currentBid = 0;
		int inputBid = 0;
		int highestBidder = 0;
		System.out.println("ooooooooooooooooooooooooooooooo");
		System.out.printf("\nBidding for %s begins at 0\n", currentTile.name());
		while(Utils.or(auction))
		{
			for (int i=0;i<player.size();i++)
			{
				if(auction[i])
				{
					System.out.printf("\nCurrent Bid is &%d\n", currentBid);			
					System.out.printf("%s do you wanted you want to place bid?",player.get(i).getName());
					if(input.ynInput())
					{
						do {
						System.out.println("enter your bid amount:");
						inputBid = input.inInteger();
						}while(inputBid<currentBid);
						highestBidder = i;
						currentBid = inputBid;
						
					}
					else {
						auction[i] = false;
					}
				}
			}
		}
		player.get(highestBidder).deductAmount(currentBid);
		currentTile.isPurchased(player.get(highestBidder));
		System.out.printf("%s purchased %s for $%d through auction.",player.get(highestBidder).getName(),currentTile.name(),currentBid);
		return player;
	}
}
