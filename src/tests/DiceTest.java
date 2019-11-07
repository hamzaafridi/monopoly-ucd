package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import board.Dice;

class DiceTest {

	@Test
	void diceTest() {
		Dice dice = new Dice();
		int min = 2;
		int max = 12;
		int roll_number = dice.roll();
		assertTrue(roll_number >= min && roll_number <=max);
	}

}
