package monopoly;

import org.junit.*;

public class Card {
	private CardType type;
	private CardAction action;
	private int value;
	private int travel;
	private int travelTo;
	private boolean nearestRail;
	private int payFor1house; // the money have to pay for repairing a house
	private int payFor1hotel; // the money have to pay for repairing a hotel
	private int payForEachPlayer; // the money have to pay for one Player, must be multiple.
	private boolean isPaid; // if player has to pay for the owner or can buy from the bank if it's unowned
	private boolean outJailFree; // the card that helps you out of the Jail without paying money

	public Card(CardType type, int key) {
		this.travel = 999; //return a large number when the chances or communities do not require to move
		this.travelTo = 999;
		if (!type.equals(CardType.CHANCE) && !type.equals(CardType.COMMUNITY))
			System.out.println("Invalid ");
		if (type.equals(CardType.CHANCE))
			chance(key);
		else
			community(key);
	}
	
	//This code for 16 Chance
	
	private void chance(int key) {
		type = CardType.CHANCE;
		switch (key) {
			case 0:
				moveToGo();
				break;
			case 1:
				moveToIllinois();
				break;
			case 2:
				moveToCharles();
				break;
			case 3:
				nearestUtility();
				break;
			case 4:
				nearestRailroad();
				break;
			case 5:
				dividend();
				break;
			case 6:
				jailFree();
				break;
			case 7:
				goBack();
				break;
			case 8:
				goToJail();
				break;
			case 9:
				repair();
				break;
			case 10:
				poorTax();
				break;
			case 11:
				readingRailroad();
				break;
			case 12:
				goToBoardwalk();
				break;
			case 13:
				chairman();
				break;
			case 14:
				loanMature();
				break;
			case 15:
				wonCompetition();
				break;
			default:
				break;
		}
	}

	//Advance to "Go". (Collect $200)
	private void moveToGo() { 
		action = CardAction.MOVE_TO;
		travelTo = 0;
		isPaid = false;
	}
	
	//Advance to Illinois Ave. If you pass Go, collect $200.
	private void moveToIllinois() {
		action = CardAction.MOVE_TO;
		travelTo = 24;
		isPaid = false;
	}
	
	//Advance to St.Charles Place. If you pass Go, collect $200.
	private void moveToCharles() {
		action = CardAction.MOVE_TO;
		travelTo = 11;
		isPaid = false;
	}
	
	//Advance token to nearest Utility. 
	//If unowned, you may buy it from the Bank. 
	//If owned, throw dice and pay owner a total 10 times the amount thrown.
	private void nearestUtility() {
		action = CardAction.MOVE_NEAREST;
		nearestRail = false;
		isPaid = true;
	}
	
	//Advance token to the nearest Railroad and pay owner twice the rental to 
	//which he/she {he} is otherwise entitled. 
	//If Railroad is unowned, you may buy it from the Bank
	private void nearestRailroad() {
		action = CardAction.MOVE_NEAREST;
		nearestRail = true;
		isPaid = true;
	}
	
	//Bank pays you dividend of $50.
	private void dividend() {
		action = CardAction.BANK_MONEY;
		value = 50;
	}
	
	//Get out of Jail Free. This card may be kept until needed, or traded/sold.
	//if sold, take $50.
	private void jailFree() {
		action = CardAction.GET_OUT_JAIL;
		outJailFree = true;
	}
	
	//Go Back Three Spaces.
	private void goBack() {
		action = CardAction.MOVE;
		travel = -3;
		isPaid = false;
	}
	
	//Go to Jail. Go directly to Jail. 
	//Do not pass GO, do not collect $200.
	private void goToJail() {
		action = CardAction.MOVE_TO;
		travelTo = 40;
	}
	
	//Make general repairs on all your property: 
	//For each house pay $25, For each hotel pay $100.
	private void repair() {
		action = CardAction.REPAIR;
		payFor1house = -25;
		payFor1hotel = -100;
	}
	
	//Pay poor tax of $15
	private void poorTax() {
		action = CardAction.BANK_MONEY;
		value = -15;
	}
	
	//Take a trip to Reading Railroad.
	//If you pass Go, collect $200.
	private void readingRailroad() {
		action = CardAction.MOVE_TO;
		travelTo = 5;
		isPaid = false;
	}
	
	//Take a walk on the Boardwalk. Advance token to Boardwalk.
	private void goToBoardwalk() {
		action = CardAction.MOVE_TO;
		travelTo = 39;
		isPaid = false;
	}
	
	//You have been elected Chairman of the Board. 
	//Pay each player $50.
	private void chairman() {
		action = CardAction.PLAYER_MONEY;
		payForEachPlayer = -50;
	}
	
	//Your building and loan matures. Receive $150.
	private void loanMature() {
		action = CardAction.BANK_MONEY;
		value = 150;
	}
	
	//You have won a crossword competition. Collect $100.
	private void wonCompetition() {
		action = CardAction.BANK_MONEY;
		value = 100;
	}
	
	
	
	//This code for 17 Community Chest

	private void community(int key) {
		type = CardType.COMMUNITY;
		switch (key) {
			case 0:
				moveToGo();
				break;
			case 1:
				bankError();
				break;
			case 2:
				doctorFee();
				break;
			case 3:
				saleStock();
				break;
			case 4:
				jailFree();
				break;
			case 5:
				goToJail();
				break;
			case 6:
				opera();
				break;
			case 7:
				holiday();
				break;
			case 8:
				refundTax();
				break;
			case 9:
				birthday();
				break;
			case 10:
				lifeInsurance();
				break;
			case 11:
				hospitalFee();
				break;
			case 12:
				schoolFee();
				break;
			case 13:
				consultancyFee();
				break;
			case 14:
				streetRepair();
				break;
			case 15:
				beautyContest();
				break;
			case 16:
				inherit();
				break;
			default:
				break;
		}
	}
	
	//moveToGo()
	
	//Bank error in your favor. Collect $200.
	private void bankError() {
		action = CardAction.BANK_MONEY;
		value = 200;
	}
	
	//Doctor's fees. Pay $50
	private void doctorFee() {
		action = CardAction.BANK_MONEY;
		value = -50;
	}
	
	//From sale of stock you get $50.
	private void saleStock() {
		action = CardAction.BANK_MONEY;
		value = 45;
	}
	
	//jailFree()
	
	//goToJail()
	
	//Grand Opera Night. 
	//Collect $50 from every player for opening night seats.
	private void opera() {
		action = CardAction.PLAYER_MONEY;
		payForEachPlayer = 50;
	}

	//Holiday Xmas Fund matures. Receive $100.
	private void holiday() {
		action = CardAction.BANK_MONEY;
		value = 100;
	}
	
	//Income tax refund. Collect $20.
	private void refundTax() {
		action = CardAction.BANK_MONEY;
		value = 20;
	}
	
	//It is your birthday. Collect $10 from every player. 
	private void birthday() {
		action = CardAction.PLAYER_MONEY;
		payForEachPlayer = 10;
	}
	
	//Life insurance matures – Collect $100
	private void lifeInsurance() {
		action = CardAction.BANK_MONEY;
		value = 100;
	}
	
	//Hospital Fees. Pay $50. 
	private void hospitalFee() {
		action = CardAction.BANK_MONEY;
		value = -50;
	}
	
	//School fees. Pay $50.
	private void schoolFee() {
		action = CardAction.BANK_MONEY;
		value = -50;
	}
	
	//Receive $25 consultancy fee.
	private void consultancyFee() {
		action = CardAction.BANK_MONEY;
		value = 25;
	}
	
	//You are assessed for street repairs: 
	//Pay $40 per house and $115 per hotel you own.
	private void streetRepair() {
		action = CardAction.REPAIR;
		payFor1house = -40;
		payFor1hotel = -115;
	}
	
	//You have won second prize in a beauty contest. Collect $10.
	private void beautyContest() {
		action = CardAction.BANK_MONEY;
		value = 10;
	}
	
	//You inherit $100.
	private void inherit() {
		action = CardAction.BANK_MONEY;
		value = 100;
	}


	public int value() {
		return value;
	}

	public int travel() {
		return travel;
	}

	public int travelTo() {
		return travelTo;
	}

	public boolean travelRail() {
		return nearestRail;
	}

	public int house() {
		return payFor1house;
	}

	public int hotel() {
		return payFor1hotel;
	}

	public int eachPlayer() {
		return payForEachPlayer;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public boolean outJailFree() {
		return outJailFree;
	}

	public CardType type() {
		return type;
	}

	public CardAction action() {
		return action;
	}

	public enum CardType {
		CHANCE,COMMUNITY
	}

	public enum CardAction {
		BANK_MONEY,
		PLAYER_MONEY, 
		MOVE, 
		MOVE_TO, 
		MOVE_NEAREST, 
		REPAIR, 
		GET_OUT_JAIL
	}
	
	//Unit Test
	public void testChance() 
	{
	    int testKey = 1;
	    Card myCard = new Card(CardType.CHANCE,testKey);
	    Assert.assertEquals(24, myCard.value() );
	}
}
