package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.Utility;
import player.Player;
import player.Token;

/**
 * This is a JUnit test for Railroad class
 * @author BaoAnh
 * @version 0.1
 * @since 2-12-2019
 */

class UtilityTest {
	
	@Test
	// Case 1: Electric Company and no one own this
	public void testCase1() {
		int pos = 13;
		Utility myUtility = new Utility("Electric Company", pos);
	    Assert.assertEquals(13,myUtility.position());
	    Assert.assertEquals("Electric Company",myUtility.name());
	    Assert.assertEquals(true,myUtility.isOwnable());
	    Assert.assertEquals(false,myUtility.isOwned());
	    Assert.assertEquals(150,myUtility.cost());
	    Assert.assertEquals(0,myUtility.rent());
	    Assert.assertEquals(75,myUtility.mortgage());
	    Assert.assertEquals(null,myUtility.owner());
	}
	
	@Test
	// Case 2: Electric Company and player 1 own this
	public void testCase2() {
		int pos = 13;
		int min = 2*4;
		int max = 12*4;
		Player player1 = new Player(Token.BLACK, "Hamza");
		Utility myUtility = new Utility("Electric Company", pos);
		myUtility.isPurchased(player1);
		int rentNumber = myUtility.rent();
	    Assert.assertEquals(13,myUtility.position());
	    Assert.assertEquals("Electric Company",myUtility.name());
	    Assert.assertEquals(true,myUtility.isOwnable());
	    Assert.assertEquals(true,myUtility.isOwned());
	    Assert.assertEquals(150,myUtility.cost());
	    Assert.assertTrue(rentNumber >= min && rentNumber <=max);
	    Assert.assertEquals(75,myUtility.mortgage());
	    Assert.assertEquals(player1,myUtility.owner());
	}
	
	//More test about player own both companies is implemented in BoardTest.java
}
