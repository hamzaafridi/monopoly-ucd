package utils;

import java.util.List;

import player.Player;
import player.Token;
/**
 * Class to display messages on the screen
 * @author Hamza Afridi
 * @version 0.1
 * @since 06-11-2019
 */
public class Screen {
	
	/**
	 * Constructor for Screen class .
	 * It has no parameters and diplays the welcome message. 
	 */
	public Screen()
	{
		this.welcomeScreen();
	}
	
	/**
	 * displays welcome message
	 */
	public void welcomeScreen()
	{
		System.out.printf("Welcome to MONOPOLY by Hamza and BaoAnh\n");
	}
	
	/**
	 * displays enter number of player message
	 */
	public void numberOfPlayersMsg()
	{
		System.out.printf("\nEnter number of players:");
	}
	
	/**
	 * displays enter name message
	 * @param n, to format the player number
	 */
	public void nameMessage(int n)
	{
		System.out.printf("\nEnter player %d name:",n+1);
	}
	
	/**
	 * information regarding the player
	 * @param player, player information
	 */
	public void playerStatus(Player player)
	{
		System.out.println("***************************");
		System.out.printf("%s! it's your turn\n",player.getName());
		System.out.printf("token: %s\n", player.getToken());
		System.out.printf("current position: %d\n",player.getBoardPosition());
		System.out.printf("amount: %d\n",player.getAmount());
		System.out.printf("inJail: %b\n",player.getInJail());
	}
	
	/**
	 * roll dice
	 */
	public void rollDice()
	{
		System.out.println("Press any key to roll dice...");
	}
	
	/**
	 * press any key to continue message
	 */
	public void enterToContinue()
	{
		System.out.println("Press anykey to continue....");
	}
	
	public void selectToken(List<Token> tokens)
	{
		System.out.println("Available tokens:");
		int i = 0;
		for (Token token: tokens)
		{
			System.out.printf("%d %s \t",i,token);
			i++;
		}
		System.out.printf("\nEnter token number:");
	}

}