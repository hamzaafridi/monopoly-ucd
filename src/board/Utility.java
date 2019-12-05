package board;
import player.Player;

/**
 * Class describing electricity, water company
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public class Utility implements Property{
	private int cost = 150; //cost to purchase utility
	private Dice dice;
	private int rollValue;
	private String name;
	private int pos;
	private Player owner;  //
	private boolean isOwned;  // true if it is owned by somebody
	private int numOwned; // number of utilities owned by a player
	private int mortgage; // money if the owner have to mortgage it.

	/**
	 * This is constructor
	 * @param name
	 * @param pos
	 */
	public Utility(String name, int pos) {
		numOwned = 0;
		this.mortgage = 75;
		this.name = name;
		this.pos = pos;
		this.dice = new Dice();
		this.rollValue = dice.roll();
		
	}

	/**
	 * 
	 * @return position
	 */
	public int position() {
		return pos;
	}

	/**
	 * 
	 * @return name
	 */
	public String name() {
		return name;
	}

	/**
	 * 
	 * @return true if it can be purchased
	 */
	public boolean isOwnable() {
		return true;
	}
	
	/**
	 * 
	 * @return true if it is owned by somebody
	 */
	public boolean isOwned() {
		return isOwned;
	}
	
	/**
	 * 
	 * @return cost to buy this tile
	 */
	public int cost() {
		return cost;
	}
	
	/**
	 * Update status of utility company
	 * Update number of company that owner have
	 * @param player
	 */
	public void isPurchased(Player player) {
		isOwned = true;
		owner = player;
		numOwned = 1;
		
		//TODO update in Player class;
		//TODO check if the player also buy another company updateOwner();
	}

	/**
	 * 
	 * @return money have to pay if another people get into this tile
	 */
	public int rent() {
		if (!isOwned)
			return 0;
		return this.rollValue * 4;
		
		//TODO if player own both
	}

	/**
	 * 
	 * @return money if the owner have to mortgage it.
	 */
	public int mortgage() {
		return mortgage;
	}

	/**
	 * 
	 * @return who owned this
	 */
	public Player owner() {
		return owner;
	}

	//more method
	//TODO check the numbers of railroad that owner has
	private void updateOwner() {
		//TODO if owned another numOwned ++
	}
}
