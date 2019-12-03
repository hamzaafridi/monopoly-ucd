package board;
import player.Player;

/**
 * Class describing 2 kind of taxes (income and luxury)
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public class Taxes implements Property{
	private TaxType type; // type of tax
	private int fixedTax;  //fixed tax 
	private double percent; //percent in case income tax
	private String name;
	private int pos; //Position
	private boolean payAsPercentage; // true if player want to pay as percentage

	/**
	 * This is constructor
	 * @param pos
	 * @param type
	 * @param payAsPercentage
	 */
	public Taxes(int pos, TaxType type, boolean payAsPercentage) {
		this.pos = pos;
		this.payAsPercentage = payAsPercentage;
		if (type.equals(TaxType.INCOME)) {
			this.fixedTax = 200;
			this.percent = 10/100;
			this.name = "Income Tax";
		} else {
			this.fixedTax = 75;
			this.name = "Luxury Tax";
		}
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

	//--other method
	/**
	 * 
	 * @return fixed tax
	 */
	public int tax() {
		return fixedTax;
	}

	/**
	 * 
	 * @param value
	 * @return fixed tax or tax as percentage, depend on value of player's assets
	 */
	public int tax(int value) {
		//if no variable tax option, return fixed tax value
		if (this.payAsPercentage== false)
			return fixedTax;
		else {
		return (int) (value * this.percent);
		}
	}
	
	/**
	 * 
	 * @return type of the tax, it should be INCOME or LUXURY
	 */
	public TaxType type() {
		return type;
	}

}
