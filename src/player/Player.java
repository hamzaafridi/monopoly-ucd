package player;

import utils.Token;
/**
 * Class describing a player
 * @author Hamza Afridi
 * @version 0.1
 * @since 06-11-2019
 */
public class Player {
	private Token token; //token assigned to the player, unique to the game
	private String name;
	//TODO add cards list 
	//TODO add houses list
	//TODO add hotel list
	//TODO add property list
	private int amount; //amount player currently has 
	private boolean inJail; //true if the player is current in jail else false 
	private int boardPosition; //current board position in integer 40 spaces. 1 being home.
	
	/**
	 * Constructor for class Player.
	 * @param playerToken describes a token assigned to the user from the Token Enum class.
	 * @param name is a string with full name of a user. 
	 */
	public Player(Token playerToken, String name)
	{
		this.token = playerToken;
		this.setInJail(false);
		this.setBoardPosition(1);
		this.setAmount(1500);
	}
	
	/**
	 * to get the current position of player on board. 1 being starting position
	 * @return boardPosition as int where 1 is the starting position and it starts over after 40. 
	 */
	public int getBoardPosition() {
		return boardPosition;
	}
	
	/**
	 * to set the current position of player on board. 1 being starting position.
	 * @param boardPosition as input.
	 * @return boolean true if the input is correct and false if input is incorrect 
	 */
	public boolean setBoardPosition(int boardPosition) {
		if (boardPosition > 40 || boardPosition < 1){
			return false;
		}
		else {
			this.boardPosition = boardPosition;
			return true;
		}
	}
	
	/**
	 * to get if the player is in jail.
	 * @return boolean true if player is in jail.
	 */
	public boolean getInJail() {
		return inJail;
	}
	
	/**
	 * to set if the player is in jail.
	 * @param boolean true if player is in jail, false if player is out of jail.
	 */
	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}
	
	/**
	 * to get amount of money the player has.
	 * @return amount of money the player has currently
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * to set amount of money the player has
	 * @param amount amount of money the player has currently
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * to get name of the player
	 * @return amount of money player has.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * to get token assigned to the user.
	 * @return token assigned to the user.
	 */
	public Token getToken() {
		return token;
	}
	
	
}
