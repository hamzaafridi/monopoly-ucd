package tests;
import board.Rules;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RulesTest {

	@Test
	//test to check input of negative number
	void testNumberofPlayersNegative() {
		int a = -1;
		assertEquals(Rules.checkNumberofUsers(a),false);
		
	}
	@Test
	//test to check outside smaller edge
	void testNumberofPlayersFirstEdge() {
		int a = 1;
		assertEquals(Rules.checkNumberofUsers(a),false);
		
	}
	@Test
	//test on the first edge
	void testNumberofPlayersLeftEdge() {
		int a = 2;
		assertEquals(Rules.checkNumberofUsers(a),true);
		
	}
	@Test
	//test inside the range
	void testNumberofPlayersInRange() {
		int a = 4;
		assertEquals(Rules.checkNumberofUsers(a),true);
		
	}
	@Test
	//test on the other edge
	void testNumberofPlayersRightEdge() {
		int a = 6;
		assertEquals(Rules.checkNumberofUsers(a),true);
		
	}
	@Test
	//test outside other edge
	void testNumberofPlayersSecondEdge() {
		int a = 7;
		assertEquals(Rules.checkNumberofUsers(a),false);
		
	}

}
