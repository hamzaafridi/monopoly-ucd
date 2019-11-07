package tests;
import player.Player;
import utils.Token;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This is a JUnit test for Player class
 * @author Hamza Afridi
 * @version 0.1
 * @since 06-11-2019
 */
class PlayerTests {
	private Player player1;
	
	@BeforeEach
	//initialize of player for each test
	public void init() {
		this.player1 = new Player(Token.BLACK, "Hamza");
	}
	
	@Test
	//test if getboardposition is working and is set to 1 at initialization.
	void testGetBoardPosition() {
		assertEquals(this.player1.getBoardPosition(),1);
	}
	
	@Test
	//test if getamount method to check if it's working and there has been correct initialization
	void testGetAmount() {
		assertEquals(this.player1.getAmount(),1500);
	}
	
	@Test
	//test to check if method to get in jail variable is correct and initialized correctly to false.
	void testGetInJail() {
		assertEquals(this.player1.getInJail(),false);
	}
	
	@Test
	//test to get name
	void testGetName() {
		assertEquals(this.player1.getName(),"Hamza");
	}
	
	@Test
	//test to get connect
	void testGetToken() {
		assertEquals(this.player1.getToken(),Token.valueOf("BLACK"));
	}
	
	@Test
	//test to add amount to player's account
	void testAddAmount() {
		assertEquals(player1.addAmount(100),1600);
	}
	
	@Test
	//test to deduct amount from player's account.
	void testDeductAmount() {
		assertEquals(player1.deductAmount(100),1400);
	}
	
	@Test
	//test to check the move method for player
	void testMoveBoardPosition()
	{
		assertEquals(player1.moveBoardPosition(40),1);
		assertEquals(player1.moveBoardPosition(2),3);
	}
	
	@Test
	//test to check set function for inJail.
	void testSetInJail()
	{
		assertEquals(player1.setInJail(true),true);
		//assertEquals(player1.moveBoardPosition(2),3);
	}

}
