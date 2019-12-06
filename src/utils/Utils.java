package utils;

import java.io.IOException;
import java.util.Scanner;

public class Utils {
	Scanner input;
	
	public Utils(Scanner in)
	{
		this.input = in;
	}
	
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
	
	public void pressAnyKey() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		input.nextLine();
	}
}