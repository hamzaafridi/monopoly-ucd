package board;

/**
 * Class describing all elements which belong to the board
 * Card
 * Dice
 * Tile
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */

public class Board {
	private  Property[] board; // array of all tile
	private boolean payAsPercentage; // input of taxes

	/**
	 * This is constructor
	 */
	public Board() {
		board = new Property[41];
		//initialize board tile
		for (int i = 0; i < 41; i++) {
			board[i] = makeAllBoardTile(i+1);
		}
		
		this.payAsPercentage = false;
		
		makeSameColorGroups();
		makeRailroadGroup();
		makeUtilityCompanyGroup();
	}

	/**
	 * 
	 * @param boardPosition
	 * @return board title
	 */
	public Property getBoardTitle(int boardPosition) {
		
		if (boardPosition >0 && boardPosition < 40) {
		return board[boardPosition-1];
		}
		return null;
		
	}

	/**
	 * 
	 * @return array of full board
	 */
	public Property[] getBoard() {
		return board;
	}

	/**
	 * 
	 * @param boardPosition
	 * @return property of that board position
	 */
	private Property makeAllBoardTile(int boardPosition) {
		
		switch (boardPosition) {
			case 1:
				return go(boardPosition);
			case 2:
				return mediterranean(boardPosition);
			case 3:
				return community(boardPosition);
			case 4:
				return baltic(boardPosition);
			case 5:
				return income(boardPosition);
			case 6:
				return readingRailroad(boardPosition);
			case 7:
				return oriental(boardPosition);
			case 8:
				return chance(boardPosition);
			case 9:
				return vermont(boardPosition);
			case 10:
				return connecticut(boardPosition);
			case 11:
				return visiting(boardPosition);
			case 12:
				return charles(boardPosition);
			case 13:
				return electric(boardPosition);
			case 14:
				return states(boardPosition);
			case 15:
				return virginia(boardPosition);
			case 16:
				return pennsylvaniaRailroad(boardPosition);
			case 17:
				return james(boardPosition);
			case 18:
				return community(boardPosition);
			case 19:
				return tennessee(boardPosition);
			case 20:
				return newYork(boardPosition);
			case 21:
				return parking(boardPosition);
			case 22:
				return kentucky(boardPosition);
			case 23:
				return chance(boardPosition);
			case 24:
				return indiana(boardPosition);
			case 25:
				return illinois(boardPosition);
			case 26:
				return BOrailroad(boardPosition);
			case 27:
				return atlantic(boardPosition);
			case 28:
				return ventor(boardPosition);
			case 29:
				return water(boardPosition);
			case 30:
				return marvin(boardPosition);
			case 31:
				return goToJail(boardPosition);
			case 32:
				return pacific(boardPosition);
			case 33:
				return carolina(boardPosition);
			case 34:
				return community(boardPosition);
			case 35:
				return pennsylvania(boardPosition);
			case 36:
				return shortLineRailroad(boardPosition);
			case 37:
				return chance(boardPosition);
			case 38:
				return park(boardPosition);
			case 39:
				return luxuryTax(boardPosition);
			case 40:
				return boardwalk(boardPosition);
			case 41://Same as case 11
				return jail(boardPosition);
			default:
				return null;
		}
	}

	/**
	 * For computing rent cost when player own same color group
	 */
	private void makeSameColorGroups() {
		//TODO add all avenue have same color in a group
	}

	/**
	 * For computing rent cost when player own more than 1 railroad
	 */
	private void makeRailroadGroup() {
		//TODO add all 4 railroad in a group
	}

	/**
	 * For computing rent cost when player own both of company
	 */
	private void makeUtilityCompanyGroup() {
		//TODO add 2 company in a group
	}

	/**
	 * 
	 * @param boardPosition
	 * @return Reading Railroad tile
	 */
	private Property readingRailroad(int boardPosition) {
		return new Railroad("Reading Railroad", boardPosition);
	}
	
	/**
	 * 
	 * @param boardPosition
	 * @return Short Line Railroad tile
	 */
	private Property shortLineRailroad(int boardPosition) {
		return new Railroad("Short Line", boardPosition);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return B and O Railroad tile
	 */
	private Property BOrailroad(int boardPosition) {
		return new Railroad("B & O Railroad", boardPosition);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return pennsylvania Railroad tile
	 */
	private Property pennsylvaniaRailroad(int boardPosition) {
		return new Railroad("Pennsylvania Railroad", boardPosition);
	}
	
	/**
	 * 
	 * @param boardPosition
	 * @return water company tile
	 */
	private Property water(int boardPosition) {
		return new Utility("Water Works", boardPosition);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return electric company tile
	 */
	private Property electric(int boardPosition) {
		return new Utility("Electric Company", boardPosition);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return Just visiting Jail tile
	 */
	private Property visiting(int boardPosition) {
		return new OtherCard("Just Visiting", boardPosition);
	}
	
	/**
	 * 
	 * @param boardPosition
	 * @return GO tile
	 */
	private Property go(int boardPosition) {
		return new OtherCard("Go", boardPosition);
	}
	
	/**
	 * 
	 * @param boardPosition
	 * @return Parking free tile
	 */
	private Property parking(int boardPosition) {
		return new OtherCard("Free Parking", boardPosition);
	}
	
	/**
	 * 
	 * @param boardPosition
	 * @return Go to jail tile
	 */
	private Property goToJail(int boardPosition) {
		return new Jail("Go To Jail", boardPosition);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return In Jail tile
	 */
	private Property jail(int boardPosition) {
		return new Jail("In Jail", boardPosition);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return chance card
	 */
	private Property chance(int boardPosition) {
		return new CardWrapper("Chance", boardPosition, CardType.CHANCE);
	}
	
	/**
	 * 
	 * @param boardPosition
	 * @return community chest card
	 */
	private Property community(int boardPosition) {
		return new CardWrapper("Community Chest", boardPosition, CardType.COMMUNITY);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return income Tax tile
	 */
	private Property income(int boardPosition) {
		return new Taxes(boardPosition, TaxType.INCOME, payAsPercentage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return luxury Tax tile
	 */ 
	private Property luxuryTax(int boardPosition) {
		return new Taxes(boardPosition, TaxType.LUXURY, false);
	}
	
	// 22 deeds cards
	/**
	 * 
	 * @param boardPosition
	 * @return mediterranean avenue tile
	 */
	private Property mediterranean(int boardPosition) {
		int rent = 2;
		int oneHouse = 10;
		int twoHouse = 30;
		int threeHouse = 90;
		int fourHouse = 160;
		int hotel = 250;
		int cost = 60;
		int houses = 50;
		int mortgage = 30;
		return new DeedsCard("Mediterranean Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return baltic avenue tile
	 */
	private Property baltic(int boardPosition) {
		int rent = 4;
		int oneHouse = 20;
		int twoHouse = 60;
		int threeHouse = 180;
		int fourHouse = 320;
		int hotel = 450;
		int cost = 60;
		int houses = 50;
		int mortgage = 30;
		return new DeedsCard("Baltic Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return oriental avenue tile
	 */
	private Property oriental(int boardPosition) {
		int rent = 6;
		int oneHouse = 30;
		int twoHouse = 90;
		int threeHouse = 270;
		int fourHouse = 400;
		int hotel = 550;
		int cost = 100;
		int houses = 50;
		int mortgage = 50;
		return new DeedsCard("Oriental Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return vermont avenue tile
	 */
	private Property vermont(int boardPosition) {
		int rent = 6;
		int oneHouse = 30;
		int twoHouse = 90;
		int threeHouse = 270;
		int fourHouse = 400;
		int hotel = 550;
		int cost = 100;
		int houses = 50;
		int mortgage = 50;
		return new DeedsCard("Vermont Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return connecticut avenue tile
	 */
	private Property connecticut(int boardPosition) {
		int rent = 8;
		int oneHouse = 40;
		int twoHouse = 100;
		int threeHouse = 300;
		int fourHouse = 450;
		int hotel = 600;
		int cost = 120;
		int houses = 50;
		int mortgage = 60;
		return new DeedsCard("Connecticut Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return ST. Charles Palace 
	 */
	private Property charles(int boardPosition) {
		int rent = 10;
		int oneHouse = 50;
		int twoHouse = 150;
		int threeHouse = 450;
		int fourHouse = 625;
		int hotel = 750;
		int cost = 140;
		int houses = 100;
		int mortgage = 70;
		return new DeedsCard("St. Charles Place", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return states avenue tile
	 */
	private Property states(int boardPosition) {
		int rent = 10;
		int oneHouse = 50;
		int twoHouse = 150;
		int threeHouse = 450;
		int fourHouse = 625;
		int hotel = 750;
		int cost = 140;
		int houses = 100;
		int mortgage = 70;
		return new DeedsCard("States Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return virginia avenue tile
	 */
	private Property virginia(int boardPosition) {
		int rent = 12;
		int oneHouse = 60;
		int twoHouse = 180;
		int threeHouse = 500;
		int fourHouse = 700;
		int hotel = 900;
		int cost = 160;
		int houses = 100;
		int mortgage = 80;
		return new DeedsCard("Virginia Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return james avenue tile
	 */
	private Property james(int boardPosition) {
		int rent = 14;
		int oneHouse = 70;
		int twoHouse = 200;
		int threeHouse = 550;
		int fourHouse = 750;
		int hotel = 950;
		int cost = 180;
		int houses = 100;
		int mortgage = 90;
		return new DeedsCard("St. James Place", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return tennessee avenue tile
	 */
	private Property tennessee(int boardPosition) {
		int rent = 14;
		int oneHouse = 70;
		int twoHouse = 200;
		int threeHouse = 550;
		int fourHouse = 750;
		int hotel = 950;
		int cost = 180;
		int houses = 100;
		int mortgage = 80;
		return new DeedsCard("Tennessee Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return newYork avenue tile
	 */
	private Property newYork(int boardPosition) {
		int rent = 16;
		int oneHouse = 80;
		int twoHouse = 220;
		int threeHouse = 600;
		int fourHouse = 800;
		int hotel = 1000;
		int cost = 200;
		int houses = 100;
		int mortgage = 100;
		return new DeedsCard("New York Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return kentucky avenue tile
	 */
	private Property kentucky(int boardPosition) {
		int rent = 18;
		int oneHouse = 90;
		int twoHouse = 250;
		int threeHouse = 700;
		int fourHouse = 875;
		int hotel = 1050;
		int cost = 220;
		int houses = 150;
		int mortgage = 110;
		return new DeedsCard("Kentucky Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return indiana avenue tile
	 */
	private Property indiana(int boardPosition) {
		int rent = 18;
		int oneHouse = 90;
		int twoHouse = 250;
		int threeHouse = 700;
		int fourHouse = 875;
		int hotel = 1050;
		int cost = 220;
		int houses = 150;
		int mortgage = 110;
		return new DeedsCard("Indiana Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return illinois avenue tile
	 */
	private Property illinois(int boardPosition) {
		int rent = 20;
		int oneHouse = 100;
		int twoHouse = 300;
		int threeHouse = 750;
		int fourHouse = 925;
		int hotel = 1100;
		int cost = 240;
		int houses = 150;
		int mortgage = 120;
		return new DeedsCard("Illinois Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return atlantic avenue tile
	 */
	private Property atlantic(int boardPosition) {
		int rent = 22;
		int oneHouse = 110;
		int twoHouse = 330;
		int threeHouse = 800;
		int fourHouse = 975;
		int hotel = 1150;
		int cost = 260;
		int houses = 150;
		int mortgage = 130;
		return new DeedsCard("Atlantic Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return ventor avenue tile
	 */
	private Property ventor(int boardPosition) {
		int rent = 22;
		int oneHouse = 110;
		int twoHouse = 330;
		int threeHouse = 800;
		int fourHouse = 975;
		int hotel = 1150;
		int cost = 260;
		int houses = 150;
		int mortgage = 130;
		return new DeedsCard("Ventor Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return marvin garden tile
	 */
	private Property marvin(int boardPosition) {
		int rent = 24;
		int oneHouse = 120;
		int twoHouse = 360;
		int threeHouse = 850;
		int fourHouse = 1025;
		int hotel = 1200;
		int cost = 280;
		int houses = 150;
		int mortgage = 140;
		return new DeedsCard("Marvin Gardens", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return pacific avenue tile
	 */
	private Property pacific(int boardPosition) {
		int rent = 26;
		int oneHouse = 130;
		int twoHouse = 390;
		int threeHouse = 900;
		int fourHouse = 1100;
		int hotel = 1275;
		int cost = 300;
		int houses = 200;
		int mortgage = 150;
		return new DeedsCard("Pacific Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return carolina avenue tile
	 */
	private Property carolina(int boardPosition) {
		int rent = 26;
		int oneHouse = 130;
		int twoHouse = 390;
		int threeHouse = 900;
		int fourHouse = 1100;
		int hotel = 1275;
		int cost = 300;
		int houses = 200;
		int mortgage = 150;
		return new DeedsCard("North Carolina Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return pennsylvania avenue tile
	 */
	private Property pennsylvania(int boardPosition) {
		int rent = 28;
		int oneHouse = 150;
		int twoHouse = 450;
		int threeHouse = 1000;
		int fourHouse = 1200;
		int hotel = 1400;
		int cost = 320;
		int houses = 200;
		int mortgage = 160;
		return new DeedsCard("Pennsylvania Avenue", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return park Palace Tile
	 */
	private Property park(int boardPosition) {
		int rent = 35;
		int oneHouse = 175;
		int twoHouse = 500;
		int threeHouse = 1100;
		int fourHouse = 1300;
		int hotel = 1500;
		int cost = 350;
		int houses = 200;
		int mortgage = 175;
		return new DeedsCard("Park Place", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

	/**
	 * 
	 * @param boardPosition
	 * @return boardwalk tile
	 */
	private Property boardwalk(int boardPosition) {
		int rent = 50;
		int oneHouse = 200;
		int twoHouse = 600;
		int threeHouse = 1400;
		int fourHouse = 1700;
		int hotel = 2000;
		int cost = 400;
		int houses = 200;
		int mortgage = 200;
		return new DeedsCard("Boardwalk", boardPosition, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	}

}
