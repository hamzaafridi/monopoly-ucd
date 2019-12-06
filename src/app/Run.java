package app;

import board.Dice;
import board.Rules;
import player.Player;
import player.Token;
import utils.Screen;

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
		Scanner input = new Scanner(System.in); // input object
		Screen disp = new Screen(); // welcome message
		// Utils input = new Utils();
		int numUsers = 0; // initializing number of user variable

		do {
			disp.numberOfPlayersMsg(); // display message for new players
			numUsers = input.nextInt();
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
			name = input.next();// get name of player
			disp.selectToken(tokens);

			do {
				tokenSelect = input.nextInt();
			} while (Rules.checkTokenInput(tokenSelect, tokens));

			player.add(new Player(tokens.get(tokenSelect), name));
			tokens.remove(tokenSelect);
			System.out.println(tokens.size());
			System.gc();

		}

		// press any key to continue
		disp.enterToContinue();

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean gameplay = true;

		while (gameplay) {
			for (int i = 0; i < numUsers; i++) {
				disp.rollTurn(i);
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println(dice.roll());
			}

		}

		System.out.println("exiting");
	}
}