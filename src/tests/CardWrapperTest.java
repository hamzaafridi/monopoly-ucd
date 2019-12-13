package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.CardWrapper;
import board.Card;
import board.CardType;

/**
 * This is a JUnit test for Card Wrapper class
 * @author BaoAnh
 * @version 0.1
 * @since 04-12-2019
 */
class CardWrapperTest {

	@Test
	//Case 1: Test chance Card
	public void testChanceCard() {
	    int pos = 7;
	    CardWrapper myCardWrapper = new CardWrapper("Chance", pos ,CardType.CHANCE);
	    Card myChanceCard = myCardWrapper.Draw();
	    Assert.assertEquals(7,myCardWrapper.position());
	    Assert.assertEquals("Chance",myCardWrapper.name());
	    Assert.assertEquals(false,myCardWrapper.isOwnable());
	    Assert.assertEquals(false,myCardWrapper.isOwned());
	    Assert.assertEquals(0,myCardWrapper.cost());
	    Assert.assertEquals(0,myCardWrapper.rent());
	    Assert.assertEquals(0,myCardWrapper.mortgage());
	    Assert.assertEquals(null,myCardWrapper.owner());
	    //Test Draw Card
	    Assert.assertEquals(false, myChanceCard.invalidKey());
	    Assert.assertEquals(CardType.CHANCE, myChanceCard.type());
	}

	@Test
	//Case 2: Test Community Card
	public void testCommunityCard() {
	    int pos = 10;
	    CardWrapper myCardWrapper = new CardWrapper("Community chest", pos ,CardType.COMMUNITY);
	    Card myCommunityCard = myCardWrapper.Draw();
	    Assert.assertEquals(10,myCardWrapper.position());
	    Assert.assertEquals("Community chest",myCardWrapper.name());
	    Assert.assertEquals(false,myCardWrapper.isOwnable());
	    Assert.assertEquals(false,myCardWrapper.isOwned());
	    Assert.assertEquals(0,myCardWrapper.cost());
	    Assert.assertEquals(0,myCardWrapper.rent());
	    Assert.assertEquals(0,myCardWrapper.mortgage());
	    Assert.assertEquals(null,myCardWrapper.owner());
	    //Test Draw Card
	    Assert.assertEquals(false, myCommunityCard.invalidKey());
	    Assert.assertEquals(CardType.COMMUNITY, myCommunityCard.type());
	}

}
