package player;

import utils.Token;

public class Player {
	private Token token; //token assigned to the player, unique to the game
	private String name;
	//TODO add cards list 
	//TODO add houses list
	//TODO add hotel list
	private int amount; //amount player currently has 
	private boolean inJail; //true if the player is current in jail else false 
	private int boardPosition; //current board position in integer 40 spaces. 1 being home.
	
	public Player(Token playerToken, String name)
	{
		this.token = playerToken;
		this.setInJail(false);
		this.setBoardPosition(1);
		this.setAmount(1500);
	}

	public int getBoardPosition() {
		return boardPosition;
	}

	public boolean setBoardPosition(int boardPosition) {
		if (boardPosition > 40 || boardPosition < 1){
			return false;
		}
		else {
			this.boardPosition = boardPosition;
			return true;
		}
	}

	public boolean getInJail() {
		return inJail;
	}

	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public Token getToken() {
		return token;
	}
	
	
	
}
