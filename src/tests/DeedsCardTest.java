package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import board.DeedsCard;
import player.Player;
import player.Token;

class DeedsCardTest {

	@Test
	// Case 1: Mediterranean Avenue and no one own this
	public void testCase1() {
		int pos = 2;
		int rent = 2;
		int oneHouse = 10;
		int twoHouse = 30;
		int threeHouse = 90;
		int fourHouse = 160;
		int hotel = 250;
		int cost = 60;
		int houses = 50;
		int mortgage = 30;
	    DeedsCard myDeedsCard = new DeedsCard("Mediterranean Avenue", pos, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
	    Assert.assertEquals(2,myDeedsCard.position());
	    Assert.assertEquals("Mediterranean Avenue",myDeedsCard.name());
	    Assert.assertEquals(true,myDeedsCard.isOwnable());
	    Assert.assertEquals(false,myDeedsCard.isOwned());
	    Assert.assertEquals(60,myDeedsCard.cost());
	    Assert.assertEquals(0,myDeedsCard.rent());
	    Assert.assertEquals(30,myDeedsCard.mortgage());
	    Assert.assertEquals(null,myDeedsCard.owner());
	    Assert.assertEquals(0,myDeedsCard.numHouses());
	    Assert.assertEquals(50,myDeedsCard.houseCost());
	    Assert.assertEquals(false,myDeedsCard.isOwnSameColor());
	}
	
	@Test
	// Case 2: Mediterranean Avenue and player 1 own this
		public void testCase2() {
			int pos = 2;
			int rent = 2;
			int oneHouse = 10;
			int twoHouse = 30;
			int threeHouse = 90;
			int fourHouse = 160;
			int hotel = 250;
			int cost = 60;
			int houses = 50;
			int mortgage = 30;
			Player player1 = new Player(Token.BLACK, "Hamza");
		    DeedsCard myDeedsCard = new DeedsCard("Mediterranean Avenue", pos, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
		    myDeedsCard.isPurchased(player1);
		    Assert.assertEquals(2,myDeedsCard.position());
		    Assert.assertEquals("Mediterranean Avenue",myDeedsCard.name());
		    Assert.assertEquals(true,myDeedsCard.isOwnable());
		    Assert.assertEquals(true,myDeedsCard.isOwned());
		    Assert.assertEquals(60,myDeedsCard.cost());
		    Assert.assertEquals(2,myDeedsCard.rent());
		    Assert.assertEquals(30,myDeedsCard.mortgage());
		    Assert.assertEquals(player1,myDeedsCard.owner());
		    Assert.assertEquals(0,myDeedsCard.numHouses());
		    Assert.assertEquals(50,myDeedsCard.houseCost());
		    Assert.assertEquals(false,myDeedsCard.isOwnSameColor());
		}
	
	@Test
	// Case 3: player 1 own Mediterranean Avenue, build 3 house
		public void testCase3() {
			int pos = 2;
			int rent = 2;
			int oneHouse = 10;
			int twoHouse = 30;
			int threeHouse = 90;
			int fourHouse = 160;
			int hotel = 250;
			int cost = 60;
			int houses = 50;
			int mortgage = 30;
			Player player1 = new Player(Token.BLACK, "Hamza");
		    DeedsCard myDeedsCard = new DeedsCard("Mediterranean Avenue", pos, rent, oneHouse, twoHouse, threeHouse, fourHouse, hotel, cost, houses, mortgage);
		    myDeedsCard.isPurchased(player1);
		    myDeedsCard.build();
		    myDeedsCard.build();
		    myDeedsCard.build();
		    Assert.assertEquals(threeHouse,myDeedsCard.rent());
		    Assert.assertEquals(2,myDeedsCard.position());
		    Assert.assertEquals("Mediterranean Avenue",myDeedsCard.name());
		    Assert.assertEquals(true,myDeedsCard.isOwnable());
		    Assert.assertEquals(true,myDeedsCard.isOwned());
		    Assert.assertEquals(60,myDeedsCard.cost());
		    Assert.assertEquals(30,myDeedsCard.mortgage());
		    Assert.assertEquals(player1,myDeedsCard.owner());
		    Assert.assertEquals(3,myDeedsCard.numHouses());
		    Assert.assertEquals(50,myDeedsCard.houseCost());
		    Assert.assertEquals(false,myDeedsCard.isOwnSameColor());
		    
		    // build hotel
		    myDeedsCard.build();
		    myDeedsCard.build();
		    Assert.assertEquals(hotel,myDeedsCard.rent());
		    Assert.assertEquals(5,myDeedsCard.numHouses());
		}
	
	//More test about own same color group is implemented in BoardTest.java

}
