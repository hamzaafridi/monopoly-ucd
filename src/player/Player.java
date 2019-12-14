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
	private int houses=0;
	private int hotels=0;
	//TODO add property list
	private int amount; //amount player currently has 
	private boolean inJail; //true if the player is current in jail else false 
	private int boardPosition; //current board position in integer 40 spaces. 1 being home.
	private boolean getOutOfJail = false; //get out of jail card
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
			this.addAmount(200);//add amount on complete rotation.
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
	 * to set if the player is in jail. and move the player to jail.
	 * @param inJail boolean true if player is in jail, false if player is out of jail.
	 * @return boolean new set value of inJail
	 */
	public boolean setInJail(boolean inJail) {
		if (inJail)
			this.boardPosition = 11;
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
	
	/**
	 * to get number of houses
	 * @return number of houses owned by player
	 */
	public int getHousesNumber() {
		return this.houses;
	}
	
	/**
	 * to set number of houses
	 * @param number of houses owned by player
	 */
	public void setHousesNumber(int house) {
		this.houses=house;
	}
	
	/**
	 * to add one to number of houses
	 * @return number of houses owned by player
	 */
	public int addHouse() {
		this.houses++;
		return this.houses;
	}
	
	/**
	 * to deduct one to number of houses
	 * @return number of houses owned by player
	 */
	public int subHouse() {
		this.houses--;
		return this.houses;
	}

	
	/**
	 * to get number of hotel
	 * @return number of hotels owned by player
	 */
	public int getHotelsNumber() {
		return this.hotels;
	}
	
	/**
	 * to set number of hotels
	 * @param number of hotels owned by player
	 */
	public void setHotelsNumber(int hotel) {
		this.hotels=hotel;
	}
	
	/**
	 * to add one to number of hotels
	 * @return number of hotels owned by player
	 */
	public int addHotel() {
		this.hotels++;
		return this.hotels;
	}
	
	/**
	 * to deduct one to number of hotel
	 * @return number of hotel owned by player
	 */
	public int subHotel() {
		this.hotels--;
		return this.hotels;
	}
	
	/**
	 * to check if the player has get out of jail card
	 * @return boolean value for getOutOfJail parameter
	 */
	public boolean getOutOfJailCard() {
		return this.getOutOfJail;
	}	
	
	/**
	 * to set value for the player jail card
	 * @param card boolean for the value of getOutOfJail parameter
	 */
	public void setOutOfJailCard(boolean card) {
		this.getOutOfJail = card;
	}	
}
