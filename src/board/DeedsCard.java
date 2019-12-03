package board;
import player.Player;

/**
 * Class describing 22 deeds cards 
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public class DeedsCard implements Property{
		private int rent; //costs of rent without any elements
		private int oneHouse; //costs of rent with 1 house
		private int twoHouse; //costs of rent with 2 house
		private int threeHouse; //costs of rent with 3 house
		private int fourHouse; //costs of rent with 4 house
		private int hotel; //costs of rent with a hotel
		private int value; //cost to purchase property
		private int houses; //cost to purchase one house
		private int mortgage; // money owner can receive when mortgage
		private int pos; // Position
		private String name;
		private int buildings;  //building status
		private boolean isOwnSameColor; //does one player own all properties in set?
		private boolean isOwned;  //is property owned?
		private Player owner;

		/**
		 *  This is constructor
		 * @param name
		 * @param pos
		 * @param rent
		 * @param oneHouse
		 * @param twoHouse
		 * @param threeHouse
		 * @param fourHouse
		 * @param hotel
		 * @param value
		 * @param houses
		 * @param mortgageValue
		 */
		public DeedsCard(String name, int pos, int rent, int oneHouse, int twoHouse, int threeHouse, int fourHouse, int hotel, int value, int houses, int mortgage) {
			this.name = name;
			this.pos = pos;
			this.rent = rent;
			this.oneHouse = oneHouse;
			this.twoHouse = twoHouse;
			this.threeHouse = threeHouse;
			this.fourHouse = fourHouse;
			this.hotel = hotel;
			this.value = value;
			this.houses = houses;
			this.mortgage = mortgage;
			buildings = 0;
			isOwnSameColor = false;
			isOwned = false;
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
		 * @return name of the property
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
		 * @return  true if it is owned by somebody
		 */
		public boolean isOwned() {
			return isOwned;
		}
		
		/**
		 * 
		 * @return the cost to purchase property
		 */
		public int cost() {
			return value;
		}
		
		/**
		 * 
		 * @param player 
		 * update player who buy this property
		 */
		public void isPurchased(Player player) {
			isOwned = true;
			owner = player;

			//TODO update player class here
		}

		/**
		 * 
		 * @return money that another people have to pay if got into this tile.
		 */
		public int rent() {
			if (!isOwned)
				return 0;
			switch (buildings) {
				case 0:
					if (isOwnSameColor) return 2 * rent;
					return rent;
				case 1:
					return oneHouse;
				case 2:
					return twoHouse;
				case 3:
					return threeHouse;
				case 4:
					return fourHouse;
				case 5:
					return hotel;
				default:
					return 0;
			}
		}
		
		/**
		 * 
		 * @return money if this deed is mortgage
		 */
		public int mortgage() {
			return mortgage;
		}

		/**
		 * 
		 * @return who own this property
		 */
		public Player owner() {
			return owner;
		}
		
		//More method
		
		/**
		 * 
		 * @return number of buildings
		 */
		public int numHouses() {
			return buildings;
		}

		/**
		 * 
		 * @return cost to build a house
		 */
		public int houseCost() {
			return houses;
		}
		
		//TODO check if there is a player own group of color
		// There are 8 groups of color.
		
		/**
		 * 
		 * @return true if there is a player own group of color
		 */
		public boolean isOwnSameColor() {
			return isOwnSameColor;
		}
}
