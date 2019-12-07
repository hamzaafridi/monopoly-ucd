package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.CardAction;

/**
 * This is a JUnit test for CardAction Enum class
 * @author BaoAnh
 * @version 0.1
 * @since 06-11-2019
 */
class CardActionEnumTest {

	@Test
	/**
	 * Tests for correct implementation of Enum class.
	 */
	void testSimpleCardAction() {
		CardAction Action = CardAction.BANK_MONEY;
		Assert.assertEquals(CardAction.valueOf("BANK_MONEY"),Action);
	}

}
