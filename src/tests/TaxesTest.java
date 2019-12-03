package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import board.TaxType;
import board.Taxes;

/**
 * This is a JUnit test for Railroad class
 * @author BaoAnh
 * @version 0.1
 * @since 2-12-2019
 */

class TaxesTest {

	@Test
	// Case 1: Income tax with fixed price
	public void testCase1() {
		int pos = 5;
		boolean payAsPercentage = false;
		Taxes myTaxes = new Taxes(pos, TaxType.INCOME, payAsPercentage);
	    Assert.assertEquals(5,myTaxes.position());
	    Assert.assertEquals("Income Tax",myTaxes.name());
	    Assert.assertEquals(false,myTaxes.isOwnable());
	    Assert.assertEquals(false,myTaxes.isOwned());
	    Assert.assertEquals(0,myTaxes.cost());
	    Assert.assertEquals(0,myTaxes.rent());
	    Assert.assertEquals(0,myTaxes.mortgage());
	    Assert.assertEquals(null,myTaxes.owner());
	    Assert.assertEquals(200,myTaxes.tax());
	    Assert.assertEquals(200,myTaxes.tax(1000));
	}

	@Test
	// Case 2: Income tax and pay as percentage
	public void testCase2() {
		int pos = 5;
		boolean payAsPercentage = true;
		Taxes myTaxes = new Taxes(pos, TaxType.INCOME, payAsPercentage);
	    Assert.assertEquals(5,myTaxes.position());
	    Assert.assertEquals("Income Tax",myTaxes.name());
	    Assert.assertEquals(false,myTaxes.isOwnable());
	    Assert.assertEquals(false,myTaxes.isOwned());
	    Assert.assertEquals(0,myTaxes.cost());
	    Assert.assertEquals(0,myTaxes.rent());
	    Assert.assertEquals(0,myTaxes.mortgage());
	    Assert.assertEquals(null,myTaxes.owner());
	    Assert.assertEquals(200,myTaxes.tax());
	    Assert.assertEquals(100,myTaxes.tax(1000));
	}
	
	@Test
	// Case 3: Luxury tax and pay as percentage =false
	public void testCase3() {
		int pos = 39;
		boolean payAsPercentage = false;
		Taxes myTaxes = new Taxes(pos, TaxType.LUXURY, payAsPercentage);
	    Assert.assertEquals(39,myTaxes.position());
	    Assert.assertEquals("Luxury Tax",myTaxes.name());
	    Assert.assertEquals(false,myTaxes.isOwnable());
	    Assert.assertEquals(false,myTaxes.isOwned());
	    Assert.assertEquals(0,myTaxes.cost());
	    Assert.assertEquals(0,myTaxes.rent());
	    Assert.assertEquals(0,myTaxes.mortgage());
	    Assert.assertEquals(null,myTaxes.owner());
	    Assert.assertEquals(75,myTaxes.tax());
	    Assert.assertEquals(75,myTaxes.tax(1000));
	}
	
	@Test
	// Case 4: Luxury tax and pay as percentage = true
	public void testCase4() {
		int pos = 39;
		boolean payAsPercentage = true;
		Taxes myTaxes = new Taxes(pos, TaxType.LUXURY, payAsPercentage);
	    Assert.assertEquals(39,myTaxes.position());
	    Assert.assertEquals("Luxury Tax",myTaxes.name());
	    Assert.assertEquals(false,myTaxes.isOwnable());
	    Assert.assertEquals(false,myTaxes.isOwned());
	    Assert.assertEquals(0,myTaxes.cost());
	    Assert.assertEquals(0,myTaxes.rent());
	    Assert.assertEquals(0,myTaxes.mortgage());
	    Assert.assertEquals(null,myTaxes.owner());
	    Assert.assertEquals(75,myTaxes.tax());
	    Assert.assertEquals(75,myTaxes.tax(1000));
	}
	
	
}
