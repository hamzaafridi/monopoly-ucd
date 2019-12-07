package board;

import java.util.Random;


/**
 * Dice class represents a dice in monopoly games 
 * @author Hamza Afridi
 * @version 0.1
 * @since 03-11-2019
 */
public class Dice {
	private int min;
	private int max;
	/**
	 * This is a constructor for class Dice
	 * There are no parameters for this class and it runs initialize minimum and maximum values possible on a dice 
	 */
	public Dice(){		
		this.min = 2;
		this.max = 12;
	}
	
	/**
	 * Rolls the dice
	 * @return returns integer value between min and maximum value possible. 
	 */
	public int roll(){
		Random random = new Random();
		return random.ints(this.min,(this.max+1)).findFirst().getAsInt();
	}
}
