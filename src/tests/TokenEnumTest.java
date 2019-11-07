package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.Token;
/**
 * This is a JUnit test for Token Enum class
 * @author Hamza Afridi
 * @version 0.1
 * @since 06-11-2019
 */
public abstract class TokenEnumTest {

	@Test
	/**
	 * Tests for correct implementation of Enum class.
	 */
	void testTokenInstance() {
		Token player1 = Token.BLACK;
		assertEquals(Token.valueOf("BLACK"),player1);
	}

}
