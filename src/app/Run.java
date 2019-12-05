package app;

import board.Rules;
import player.Player;
import player.Token;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Run {

public static void main(String[] args) {
		//TODO load board
		
		Scanner input = new Scanner(System.in); //input object
		Screen disp = new Screen(); //welcome message
		
		int numUsers = 0; //initializing number of user variable
		
		do
		{
			disp.numberOfPlayersMsg(); //display message for new players
			numUsers = input.nextInt(); //input for new users
		}
		while(!Rules.checkNumberofUsers(numUsers)); //check for correct input
		
		//creating players
		List<Player> player = new ArrayList<Player>();
		List<Token> tokens = new LinkedList(Arrays.asList(Token.values()));
		
		int tokenSelect=-1;
		String name;
		
		for (int i=0;i<numUsers;i++)
		{
			disp.nameMessage(i);
			name = input.next();
			disp.selectToken(tokens);
			
			do
			{
				tokenSelect = input.nextInt();
			}while(Rules.checkTokenInput(tokenSelect, tokens));
			
			
			player.add(new Player(tokens.get(tokenSelect),name));
			tokens.remove(0);
		}
		
		input.close();
}
}