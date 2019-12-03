package board;
import player.Player;

/**
 * Class describing 4 railroad
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public class Railroad implements Property{
	private int value = 200;
	private String name;
	private int pos; //Position
	private int numOwned;  //number of railroads owned by player
	private Player owner;
	private boolean isOwned;  //is property owned?
	private int mortgage;

	/**
	 * This is constructor
	 * @param name
	 * @param pos
	 */
	public Railroad(String name, int pos) {
		numOwned = 1;
		this.name = name;
		this.pos = pos;
		this.mortgage = 100;
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
		return value;
	}
	
	/**
	 * Update status of railroad
	 * Update number of railroad that owner have
	 * @param player
	 */
	public void isPurchased(Player player) {
		isOwned = true;
		owner = player;

		//TODO update in Player class;
		//TODO check if the player also buy another railroad updateOwner();
	}

	/**
	 * 
	 * @return money have to pay if another people get into this tile
	 */
	public int rent() {

		switch (numOwned) {
			case 1:
				return 25;
			case 2:
				return 50;
			case 3:
				return 100;
			case 4:
				return 200;
			default:
				return 0;
		}
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
