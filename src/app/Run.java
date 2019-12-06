package app;

import board.Dice;
import board.Rules;
import player.Player;
import player.Token;
import utils.Screen;
import utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO load board
		Dice dice = new Dice();
		Scanner in = new Scanner(System.in); // input object
		Screen disp = new Screen(); // welcome message
		Utils input = new Utils(in);
		int numUsers = 0; // initializing number of user variable

		do {
			disp.numberOfPlayersMsg(); // display message for new players
			numUsers = input.inInteger();
			System.gc();
		} while (!Rules.checkNumberofUsers(numUsers)); // check for correct input

		// creating players
		List<Player> player = new ArrayList<Player>();
		List<Token> tokens = new LinkedList(Arrays.asList(Token.values()));

		// create new users
		int tokenSelect = -1;
		String name;

		// enter name of the users and select token
		for (int i = 0; i < numUsers; i++) {
			disp.nameMessage(i);
			name = in.next();// get name of player
			disp.selectToken(tokens);

			do {
				tokenSelect = input.inInteger();
			} while (Rules.checkTokenInput(tokenSelect, tokens));

			player.add(new Player(tokens.get(tokenSelect), name));
			tokens.remove(tokenSelect);
			System.gc();

		}

		// press any key to continue
		disp.enterToContinue();
		input.pressAnyKey();

		boolean gameplay = true;

		while (gameplay) {
			for (int i = 0; i < numUsers; i++) {
				disp.playerStatus(player.get(i));
				disp.rollDice();
				input.pressAnyKey();
				System.out.println(dice.roll());
			}

		}

		System.out.println("exiting");
	}
}