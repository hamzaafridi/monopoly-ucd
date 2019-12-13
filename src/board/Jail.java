package board;

import player.Player;

/**
 * Class describing other cards: Go, Parking Free and Visiting Jail
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public class Jail implements Property{
	private final int pos;
	private final String name;

	/**
	 * This is constructor
	 * @param name
	 * @param pos
	 */
	public Jail(String name, int pos) {
		this.name = name;
		this.pos = pos;
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
		return false;
	}
	
	/**
	 * 
	 * @return true if it is owned by somebody
	 */
	public boolean isOwned() {
		return false;
	}

	/**
	 * 
	 * @return cost to buy this tile
	 */
	public int cost() {
		return 0;
	}
	
	/**
	 * Nothing need to update
	 * @param player
	 */
	public void isPurchased(Player player) {
	}
	
	/**
	 * In this case do not have to rent
	 * @return money have to pay if another people get into this tile
	 */
	public int rent() {
		return 0;
	}
	
	/**
	 * In this case this card cannot be mortgaged
	 * @return money if the owner have to mortgage it.
	 */
	public int mortgage() {
		return 0;
	}
	
	/**
	 * In this case nobody can own this
	 * @return who owned this
	 */
	public Player owner() {
		return null;
	}
	
	/**
	 * Just use for update in Player class
	 * @param player
	 */
	public void updatePlayer(Player player) {
		// update the flag GO TO JAIL in Player class
	}
}
