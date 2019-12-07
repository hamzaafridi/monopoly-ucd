package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.Board;
import board.Card;
import board.CardType;
import board.Property;
import board.Railroad;
import player.Player;
import player.Token;

class BoardTest {

	@Test
	//Case 1: Board position is 2, Mediterranean Avenue tile
	public void testCase1() {
		    int boardPosition = 2; // board position = array number - 1
			int rent = 2;
			int cost = 60;
			int mortgage = 30;
		    Board myBoard = new Board();
		    Player player1 = new Player(Token.BLACK, "Hamza");
		    myBoard.getBoardTitle(boardPosition).isPurchased(player1);
		    Property[] board = myBoard.getBoard();
		    Assert.assertEquals(board[boardPosition-1], myBoard.getBoardTitle(boardPosition));
		    Assert.assertEquals(boardPosition,myBoard.getBoardTitle(boardPosition).position());
		    Assert.assertEquals("Mediterranean Avenue",myBoard.getBoardTitle(boardPosition).name());
		    Assert.assertEquals(true,myBoard.getBoardTitle(boardPosition).isOwnable());
		    Assert.assertEquals(true,myBoard.getBoardTitle(boardPosition).isOwned());
		    Assert.assertEquals(cost,myBoard.getBoardTitle(boardPosition).cost());
		    Assert.assertEquals(rent,myBoard.getBoardTitle(boardPosition).rent());
		    Assert.assertEquals(mortgage,myBoard.getBoardTitle(boardPosition).mortgage());
		    Assert.assertEquals(player1,myBoard.getBoardTitle(boardPosition).owner());
	}
	
	@Test
	//Case 2: Board position is 3, community chest
	public void testCase2() {
		    int boardPosition = 3; // board position = array number - 1
		    Board myBoard = new Board();
		    Property[] board = myBoard.getBoard();
		    Assert.assertEquals(board[boardPosition-1], myBoard.getBoardTitle(boardPosition));
		    Assert.assertEquals(boardPosition,myBoard.getBoardTitle(boardPosition).position());
		    Assert.assertEquals("Community Chest",myBoard.getBoardTitle(boardPosition).name());
		    Assert.assertEquals(false,myBoard.getBoardTitle(boardPosition).isOwnable());
		    Assert.assertEquals(false,myBoard.getBoardTitle(boardPosition).isOwned());
		    Assert.assertEquals(0,myBoard.getBoardTitle(boardPosition).cost());
		    Assert.assertEquals(0,myBoard.getBoardTitle(boardPosition).rent());
		    Assert.assertEquals(0,myBoard.getBoardTitle(boardPosition).mortgage());
		    Assert.assertEquals(null,myBoard.getBoardTitle(boardPosition).owner());
	}
	
	@Test
	//Case 3: Board position is 5, income tax
	public void testCase3() {
		    int boardPosition = 5; // board position = array number - 1
		    Board myBoard = new Board();
		    Property[] board = myBoard.getBoard();
		    Assert.assertEquals(board[boardPosition-1], myBoard.getBoardTitle(boardPosition));
		    Assert.assertEquals(boardPosition,myBoard.getBoardTitle(boardPosition).position());
		    Assert.assertEquals("Income Tax",myBoard.getBoardTitle(boardPosition).name());
		    Assert.assertEquals(false,myBoard.getBoardTitle(boardPosition).isOwnable());
		    Assert.assertEquals(false,myBoard.getBoardTitle(boardPosition).isOwned());
		    Assert.assertEquals(0,myBoard.getBoardTitle(boardPosition).cost());
		    Assert.assertEquals(0,myBoard.getBoardTitle(boardPosition).rent());
		    Assert.assertEquals(0,myBoard.getBoardTitle(boardPosition).mortgage());
		    Assert.assertEquals(null,myBoard.getBoardTitle(boardPosition).owner());
	}
	
	@Test
	// Case 4: Reading RailRoad and player 1 own both reading and  BO
	public void testCase4() {
		Board myBoard = new Board();
		Player player1 = new Player(Token.BLACK, "Bao Anh");
		myBoard.getBoardTitle(6).isPurchased(player1);
		//myBoard.getBoardTitle(16).isPurchased(player1);
		myBoard.getBoardTitle(26).isPurchased(player1);
		//myBoard.getBoardTitle(36).isPurchased(player1);
	    Assert.assertEquals(player1,myBoard.getBoardTitle(6).owner());
	    Assert.assertEquals(player1,myBoard.getBoardTitle(26).owner());
	    Assert.assertEquals(6,myBoard.getBoardTitle(6).position());
	    Assert.assertEquals("Reading Railroad",myBoard.getBoardTitle(6).name());
	    Assert.assertEquals(true,myBoard.getBoardTitle(6).isOwnable());
	    Assert.assertEquals(true,myBoard.getBoardTitle(6).isOwned());
	    Assert.assertEquals(200,myBoard.getBoardTitle(6).cost());
	    Assert.assertEquals(50,myBoard.getBoardTitle(6).rent());
	    Assert.assertEquals(100,myBoard.getBoardTitle(6).mortgage());
		}
	
	@Test
	// Case 5: player 1 own both electric company and water company
	public void testCase5() {
		int min = 2*10;
		int max = 12*10;
		Board myBoard = new Board();
	    Property[] board = myBoard.getBoard();
		Player player1 = new Player(Token.BLACK, "Bao Anh");
		myBoard.getBoardTitle(13).isPurchased(player1);
		myBoard.getBoardTitle(29).isPurchased(player1);
		int rentNumber = myBoard.getBoardTitle(13).rent();
	    Assert.assertEquals(player1,myBoard.getBoardTitle(13).owner());
	    Assert.assertEquals(player1,myBoard.getBoardTitle(29).owner());
	    Assert.assertEquals(13,myBoard.getBoardTitle(13).position());
	    Assert.assertEquals("Electric Company",myBoard.getBoardTitle(13).name());
	    Assert.assertEquals(true,myBoard.getBoardTitle(13).isOwnable());
	    Assert.assertEquals(true,myBoard.getBoardTitle(13).isOwned());
	    Assert.assertEquals(150,myBoard.getBoardTitle(13).cost());
	    Assert.assertTrue(rentNumber >= min && rentNumber <=max);
	    Assert.assertEquals(75,myBoard.getBoardTitle(13).mortgage());
		}
	
	@Test
	//Case 6: Player own both Mediterranean Avenue and Baltic Avenue
	public void testCase6() {
		Board myBoard = new Board();
		Player player1 = new Player(Token.BLACK, "Bao Anh");
		myBoard.getBoardTitle(2).isPurchased(player1);
		myBoard.getBoardTitle(4).isPurchased(player1);
	    Assert.assertEquals(player1,myBoard.getBoardTitle(2).owner());
	    Assert.assertEquals(player1,myBoard.getBoardTitle(4).owner());
	    Assert.assertEquals(2,myBoard.getBoardTitle(2).position());
	    Assert.assertEquals("Mediterranean Avenue",myBoard.getBoardTitle(2).name());
	    Assert.assertEquals(true,myBoard.getBoardTitle(2).isOwnable());
	    Assert.assertEquals(true,myBoard.getBoardTitle(2).isOwned());
	    Assert.assertEquals(60,myBoard.getBoardTitle(2).cost());
	    Assert.assertEquals(4,myBoard.getBoardTitle(2).rent());
	    Assert.assertEquals(30,myBoard.getBoardTitle(2).mortgage());
	}
	
	@Test
	//Case 7: Player own Oriental Avenue, Vermont Avenue and Connecticut Avenue
	public void testCase7() {
		Board myBoard = new Board();
		Player player1 = new Player(Token.BLACK, "Bao Anh");
		myBoard.getBoardTitle(7).isPurchased(player1);
		myBoard.getBoardTitle(9).isPurchased(player1);
		myBoard.getBoardTitle(10).isPurchased(player1);
	    Assert.assertEquals(player1,myBoard.getBoardTitle(7).owner());
	    Assert.assertEquals(player1,myBoard.getBoardTitle(9).owner());
	    Assert.assertEquals(player1,myBoard.getBoardTitle(10).owner());
	    Assert.assertEquals(7,myBoard.getBoardTitle(7).position());
	    Assert.assertEquals("Oriental Avenue",myBoard.getBoardTitle(7).name());
	    Assert.assertEquals(true,myBoard.getBoardTitle(7).isOwnable());
	    Assert.assertEquals(true,myBoard.getBoardTitle(7).isOwned());
	    Assert.assertEquals(100,myBoard.getBoardTitle(7).cost());
	    Assert.assertEquals(12,myBoard.getBoardTitle(7).rent());
	    Assert.assertEquals(50,myBoard.getBoardTitle(7).mortgage());
	}
	
	@Test
	//Case 7: Player own Oriental Avenue, Vermont Avenue but not Connecticut Avenue
	public void testCase8() {
		Board myBoard = new Board();
		Player player1 = new Player(Token.BLACK, "Bao Anh");
		myBoard.getBoardTitle(7).isPurchased(player1);
		myBoard.getBoardTitle(9).isPurchased(player1);
	    Assert.assertEquals(player1,myBoard.getBoardTitle(7).owner());
	    Assert.assertEquals(player1,myBoard.getBoardTitle(9).owner());
	    Assert.assertEquals(null,myBoard.getBoardTitle(10).owner());
	    Assert.assertEquals(7,myBoard.getBoardTitle(7).position());
	    Assert.assertEquals("Oriental Avenue",myBoard.getBoardTitle(7).name());
	    Assert.assertEquals(true,myBoard.getBoardTitle(7).isOwnable());
	    Assert.assertEquals(true,myBoard.getBoardTitle(7).isOwned());
	    Assert.assertEquals(100,myBoard.getBoardTitle(7).cost());
	    Assert.assertEquals(6,myBoard.getBoardTitle(7).rent());
	    Assert.assertEquals(50,myBoard.getBoardTitle(7).mortgage());
	}
	
}
