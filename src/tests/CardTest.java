package monopoly;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import monopoly.Card;
import monopoly.Card.CardAction;
import monopoly.Card.CardType;

public class CardTest {

	@Test
	//Type is not CHANCE and COMMUNITY
	public void testCardWithWrongType() {
		//input of method Card must be a CardType ENUM
   	}
	
	@Test
	//Type is is CHANCE but test key < 0
	public void testChanceWithKeyLessThanZero() {
	    int testKey = -10;
	    Card myCard = new Card(CardType.CHANCE,testKey);
	    Assert.assertEquals(true, myCard.invalidKey() );
	}
	
	@Test
	//Type is is CHANCE but test key = 7 (Go Back Three Spaces)
	public void testChanceWithKeyEqual7() {
		    int testKey = 7;
		    Card myCard = new Card(CardType.CHANCE,testKey);
		    Assert.assertEquals(false, myCard.invalidKey() );
		    Assert.assertEquals(0, myCard.value() );
		    Assert.assertEquals(-3, myCard.travel() );
		    Assert.assertEquals(999, myCard.travelTo() );
		    Assert.assertEquals(false, myCard.travelRail() );
		    Assert.assertEquals(0, myCard.house() );
		    Assert.assertEquals(0, myCard.hotel() );
		    Assert.assertEquals(0, myCard.eachPlayer() );
		    Assert.assertEquals(false, myCard.isPaid() );
		    Assert.assertEquals(false, myCard.outJailFree() );
		    Assert.assertEquals(CardType.CHANCE, myCard.type() );
		    Assert.assertEquals(CardAction.MOVE, myCard.action() );
	}
	
	@Test
	//Type is is CHANCE but test key > 15
	public void testChanceWithKeyGreaterThan15() {
	    int testKey = 30;
	    Card myCard = new Card(CardType.CHANCE,testKey);
	    Assert.assertEquals(true, myCard.invalidKey() );
	}
	
	@Test
	//Type is is COMMUNITY but test key < 0
	public void testCommunityWithKeyLessThanZero() {
	    int testKey = -10;
	    Card myCard = new Card(CardType.COMMUNITY,testKey);
	    Assert.assertEquals(true, myCard.invalidKey() );
	}
	
	@Test
	//Type is is COMMUNITY but test key = 7
	public void testCommunityWithKeyEqual7() {
	    int testKey = 7;
	    Card myCard = new Card(CardType.COMMUNITY,testKey);
	    Assert.assertEquals(false, myCard.invalidKey() );
	    Assert.assertEquals(100, myCard.value() );
	    Assert.assertEquals(999, myCard.travel() );
	    Assert.assertEquals(999, myCard.travelTo() );
	    Assert.assertEquals(false, myCard.travelRail() );
	    Assert.assertEquals(0, myCard.house() );
	    Assert.assertEquals(0, myCard.hotel() );
	    Assert.assertEquals(0, myCard.eachPlayer() );
	    Assert.assertEquals(false, myCard.isPaid() );
	    Assert.assertEquals(false, myCard.outJailFree() );
	    Assert.assertEquals(CardType.COMMUNITY, myCard.type() );
	    Assert.assertEquals(CardAction.BANK_MONEY, myCard.action() );
}
	
	@Test
	//Type is is COMMUNITY but test key > 16
	public void testCommunityWithKeyGreaterThan16() {
	    int testKey = 30;
	    Card myCard = new Card(CardType.COMMUNITY,testKey);
	    Assert.assertEquals(true, myCard.invalidKey() );
	}
}
