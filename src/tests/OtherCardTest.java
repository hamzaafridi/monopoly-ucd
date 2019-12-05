package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.OtherCard;

/**
 * This is a JUnit test for Railroad class
 * @author BaoAnh
 * @version 0.1
 * @since 2-12-2019
 */

class OtherCardTest {

	@Test
	// Case 1: GO
	public void testCase1() {
		int pos = 1;
		OtherCard myOtherCard = new OtherCard("Go", pos);
	    Assert.assertEquals(1,myOtherCard.position());
	    Assert.assertEquals("Go",myOtherCard.name());
	    Assert.assertEquals(false,myOtherCard.isOwnable());
	    Assert.assertEquals(false,myOtherCard.isOwned());
	    Assert.assertEquals(0,myOtherCard.cost());
	    Assert.assertEquals(0,myOtherCard.rent());
	    Assert.assertEquals(0,myOtherCard.mortgage());
	    Assert.assertEquals(null,myOtherCard.owner());
	}
	
	@Test
	// Case 2: Parking free
	public void testCase2() {
		int pos = 11;
		OtherCard myOtherCard = new OtherCard("Parking free", pos);
	    Assert.assertEquals(11,myOtherCard.position());
	    Assert.assertEquals("Parking free",myOtherCard.name());
	    Assert.assertEquals(false,myOtherCard.isOwnable());
	    Assert.assertEquals(false,myOtherCard.isOwned());
	    Assert.assertEquals(0,myOtherCard.cost());
	    Assert.assertEquals(0,myOtherCard.rent());
	    Assert.assertEquals(0,myOtherCard.mortgage());
	    Assert.assertEquals(null,myOtherCard.owner());
	}
	
	@Test
	// Case 3: Visiting Jail
	public void testCase3() {
		int pos = 21;
		OtherCard myOtherCard = new OtherCard("Visiting Jail", pos);
	    Assert.assertEquals(21,myOtherCard.position());
	    Assert.assertEquals("Visiting Jail",myOtherCard.name());
	    Assert.assertEquals(false,myOtherCard.isOwnable());
	    Assert.assertEquals(false,myOtherCard.isOwned());
	    Assert.assertEquals(0,myOtherCard.cost());
	    Assert.assertEquals(0,myOtherCard.rent());
	    Assert.assertEquals(0,myOtherCard.mortgage());
	    Assert.assertEquals(null,myOtherCard.owner());
	}

}
