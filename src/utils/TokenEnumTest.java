package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokenEnumTest {

	@Test
	void test() {
		Token player1 = Token.BLACK;
		assertEquals(Token.valueOf("BLACK"),player1);
	}

}
