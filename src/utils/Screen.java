package utils;

import java.util.List;

import board.Property;
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
		System.out.println("\n***************************");
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
	
	/**
	 * Select token message
	 * @param tokens list to display available tokens
	 */
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
	
	/**
	 * three doubles penalty message
	 */
	public void diceRuleGotoJail() {
		System.out.println("you got doubles three times! You are now in jail!");
	}
	
	/**
	 * sent to jail message
	 */
	public void sentToJailMessage() {
		System.out.println("you have been sent to jail!");
	}

	/**
	 * Want to buy property message
	 * @param cost: cost of the property
	 * @param name: name of the property
	 */
	public void purchaseQuestion(int cost, String name) {
		System.out.printf("Do you want to buy \"%s\" for $%d? (y/n) :",name,cost);
	}
	/**
	 * message to draw chance card
	 */
	public void drawChanceMessage() {
		System.out.println("Press any key to draw chance card");
	}

	/**
	 * message to draw community card
	 */
	public void drawCommunityMessage() {
		System.out.println("Press any key to draw community card");
	}
	
	/**
	 * message for winner
	 * @param winnerPlayer object for name
	 */
	public void winner(Player winnerPlayer) {
		System.out.printf("\n\nCongratulaitons \"%s\" won the game!\n\n",winnerPlayer.getName());
	}

	/**
	 * message for bankCrupt
	 */
	public void playerBanckrupt(Player player) {
		System.out.printf("\nSorry \"%s\" is backrupt and has retired from game!\n\n",player.getName());
	}
	
	
	/**
	 * rent paid message
	 * @param player who is paying the rent
	 * @param owner who will receive the rent
	 * @param amount that has to be paid
	 */
	public void payRent(Player player, Player owner, int rent) {
		System.out.printf("\n\"%s\" paid rent of $%d to \"%s\"\n",player.getName(),rent,owner.getName());
	}
	
	/**
	 * property purchase message
	 * @param player making the purchase 
	 * @param currentTile the tile that is being purchased
	 */
	public void purchased(Player player, Property currentTile) {
		System.out.printf("\n\"%s\" purchased \"%s\" for  $%d\n",player.getName(),currentTile.name(),currentTile.cost());
	}

	public void playerStatus2(Player player) {
		System.out.println("\n***************************");
		System.out.printf("%s status after turn!\n",player.getName());
		System.out.printf("token: %s\n", player.getToken());
		System.out.printf("current position: %d\n",player.getBoardPosition());
		System.out.printf("amount: %d\n",player.getAmount());
		System.out.printf("inJail: %b\n",player.getInJail());
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
	}

	/**
	 * auction start message
	 */
	public void autionStart() {
		System.out.println("There will now be auction:");
		
	}

}
