package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.Board;
import board.Card;
import board.CardType;
import board.Property;
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
}
