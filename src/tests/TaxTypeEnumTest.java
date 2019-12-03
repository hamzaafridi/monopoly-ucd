package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.TaxType;

/**
 * This is a JUnit test for TaxType Enum class
 * @author BaoAnh
 * @version 0.1
 * @since 30-11-2019
 */
class TaxTypeEnumTest {

	@Test
	/**
	 * Tests for correct implementation of Enum class.
	 */
	void testSimpleTaxType() {
		TaxType Type = TaxType.INCOME;
		Assert.assertEquals(TaxType.valueOf("INCOME"),Type);
	}

}
