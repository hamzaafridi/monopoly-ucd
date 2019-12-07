package board;
import player.Player;

/**
 * Class describing properties for all tile of board 
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public interface Property {
	
	int position(); // position

	String name(); // name

	boolean isOwnable(); // true if it can be purchased
 
	boolean isOwned(); // true if it is owned by somebody

	int cost(); //cost to buy this tile

	void isPurchased(Player player); // use for update owned and update information in Player class

	int rent(); // money have to pay if another people get into this tile
	
	int mortgage(); // money if the owner have to mortgage it.

	Player owner(); // who owned this

}
