package board;

import java.util.List;

import player.Token;

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
}
