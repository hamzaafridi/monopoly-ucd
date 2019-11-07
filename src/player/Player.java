package player;

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
		this.boardPosition = 1;
		this.amount = 0;
		this.addAmount(1500);
		this.name = name;
	}
	
	/**
	 * Constructor for class Player which also includes startingAmount parameter
	 * @param playerToken describes a token assigned to the user from the Token Enum class.
	 * @param name is a string with full name of a user. 
	 * @param startingAmount
	 */
	public Player(Token playerToken, String name, int startingAmount)
	{
		this.token = playerToken;
		this.setInJail(false);
		this.boardPosition = 1;
		this.amount = 0;
		this.addAmount(startingAmount);
		this.name = name;
	}
	
	/**
	 * to get the current position of player on board. 1 being starting position
	 * @return boardPosition as int where 1 is the starting position and it starts over after 40. 
	 */
	public int getBoardPosition() {
		return this.boardPosition;
	}
	
	/**
	 * to move the player by some positions.
	 * @param numberOfPosition is the number of positions to move
	 * @return new position 
	 */
	public int moveBoardPosition(int numberOfPosition) {
		this.boardPosition = this.boardPosition + numberOfPosition;
		if (this.boardPosition > 40)
		{
			this.boardPosition = this.boardPosition - 40;
		}
		return this.boardPosition;
	}
	
	/**
	 * to get if the player is in jail.
	 * @return boolean true if player is in jail.
	 */
	public boolean getInJail() {
		return this.inJail;
	}
	
	/**
	 * to set if the player is in jail.
	 * @param inJail boolean true if player is in jail, false if player is out of jail.
	 * @return boolean new set value of inJail
	 */
	public boolean setInJail(boolean inJail) {
		this.inJail = inJail;
		return this.inJail;
	}
	
	/**
	 * to get amount of money the player has.
	 * @return amount of money the player has currently
	 */
	public int getAmount() {
		return this.amount;
	}
	
	/**
	 * to add amount to the amount the player has
	 * @param amount to be added to the player
	 * @return new amount 
	 */
	public int addAmount(int amount) {
		this.amount = this.amount + amount;
		return this.amount;
	}
	
	/**
	 * to deduct amount to the amount the player has
	 * @param amount to be deducted from the player
	 * @return new amount 
	 */
	public int deductAmount(int amount) {
		this.amount = this.amount - amount;
		return this.amount;
	}
	
	/**
	 * to get name of the player
	 * @return amount of money player has.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * to get token assigned to the user.
	 * @return token assigned to the user.
	 */
	public Token getToken() {
		return this.token;
	}
	
	
}
