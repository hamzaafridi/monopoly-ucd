package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.Jail;

class JailTest {

	@Test
	// Case 1: GO TO JAIL
	public void testCase1() {
		int pos = 31;
		Jail myJail = new Jail("Go To Jail", pos);
	    Assert.assertEquals(31,myJail.position());
	    Assert.assertEquals("Go To Jail",myJail.name());
	    Assert.assertEquals(false,myJail.isOwnable());
	    Assert.assertEquals(false,myJail.isOwned());
	    Assert.assertEquals(0,myJail.cost());
	    Assert.assertEquals(0,myJail.rent());
	    Assert.assertEquals(0,myJail.mortgage());
	    Assert.assertEquals(null,myJail.owner());
	}

}
