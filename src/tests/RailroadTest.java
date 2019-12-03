package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.Railroad;
import player.Player;
import player.Token;

/**
 * This is a JUnit test for Railroad class
 * @author BaoAnh
 * @version 0.1
 * @since 2-12-2019
 */

class RailroadTest {

	@Test
	// Case 1: Reading RailRoad and no one own this
	public void testCase1() {
		int pos = 6;
		Railroad myRailroad = new Railroad("Reading Railroad", pos);
	    Assert.assertEquals(6,myRailroad.position());
	    Assert.assertEquals("Reading Railroad",myRailroad.name());
	    Assert.assertEquals(true,myRailroad.isOwnable());
	    Assert.assertEquals(false,myRailroad.isOwned());
	    Assert.assertEquals(200,myRailroad.cost());
	    Assert.assertEquals(0,myRailroad.rent());
	    Assert.assertEquals(100,myRailroad.mortgage());
	    Assert.assertEquals(null,myRailroad.owner());
	}
	
	@Test
	// Case 2: Reading RailRoad and player 1 own this
	public void testCase2() {
		int pos = 6;
		Player player1 = new Player(Token.BLACK, "Hamza");
		Railroad myRailroad = new Railroad("Reading Railroad", pos);
		myRailroad.isPurchased(player1);
	    Assert.assertEquals(6,myRailroad.position());
	    Assert.assertEquals("Reading Railroad",myRailroad.name());
	    Assert.assertEquals(true,myRailroad.isOwnable());
	    Assert.assertEquals(true,myRailroad.isOwned());
	    Assert.assertEquals(200,myRailroad.cost());
	    Assert.assertEquals(25,myRailroad.rent());
	    Assert.assertEquals(100,myRailroad.mortgage());
	    Assert.assertEquals(player1,myRailroad.owner());
		}
	
	//TODO updateOwner (own 2 or more)

}
