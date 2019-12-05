package board;

import player.Player;
import board.Card;
/**
 * Class describing other cards: Go, Parking Free and Visiting Jail
 * @author BaoAnh
 * @version 0.1
 * @since 04-12-2019
 */
public class CardWrapper implements Property{
	private String name;
	private int pos;
	private CardType type;
	private Dice dice;
	private int rollValue;
	//construct square of type cards
	public CardWrapper(String name, int pos, CardType type) {
		this.dice = new Dice();
		this.rollValue = dice.roll();
		if (type != CardType.COMMUNITY && type != CardType.CHANCE)
			throw new IllegalArgumentException("Card type invalid!");
		this.name = name;
		this.pos = pos;
		this.type = type;
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
	
	//More method
	/**
	 * 
	 * @return type of Card
	 */
	public CardType type() {
		return type;
	}
	
	/**
	 * For drawing chance or community chest
	 * @return Object Card
	 */
	public Card Draw() {
		Card myCard = new Card(type, rollValue);
		return myCard;
	}
	

}
