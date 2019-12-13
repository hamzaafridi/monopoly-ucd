package utils;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Utils {
	Scanner input;
	
	/**
	 * constructor for Utils
	 * @param in which is of scanner type and is initialized in the main class
	 */
	public Utils(Scanner in)
	{
		this.input = in;
	}
	
	/**
	 * inInteger is input integer class with exception handling for wrong inputs
	 * @return integer input or -1 for invalid input
	 */
	public int inInteger() {
		int numUsers = -1;
		
		if (input.hasNextInt()) {
	        numUsers = input.nextInt() ; 
	      
	    } else {
	        System.out.println("\nPlease input integer only!");
	        input.nextLine();
	    }
		
		return numUsers;
	}
	
	
	/**
	 * press any key to continue input method
	 */
	public void pressAnyKey() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		input.nextLine();
	}
	
	/**
	 * input method for yes and no type question
	 * @return boolean true for yes and false for no
	 */
	public boolean ynInput() {
		String decision = input.nextLine();
		while(!(decision.equals("y") || decision.equals("n") || decision.equals("Y\n") || decision.equals("N\n")))  
		{
			System.out.println("Invalid input please try again (y/n):\t");
			decision = input.nextLine();
		}
		
		if(decision.equals("Y") | decision.equals("y"))
			return true;
		else
			return false;
		
	}
	
	/**
	 * Generate random number between min max
	 * @param min, minimum integer value
	 * @param max, maximum integer value
	 * @return int
	 */
	public static int randInt(int max, int min){
		Random random = new Random();
		return random.ints(min,(max+1)).findFirst().getAsInt();
	}
	
	/**
	 * board differeance is the distance between two positions on board
	 * @param val1 is first position
	 * @param val2 is the second position
	 * @return int the distance between two position
	 */
	public static int diffPosition(int val1, int val2){
		if (val1>val2){
			return 40+val2-val1;
		}
		else {
			return val1-val2;
		}
	}
}