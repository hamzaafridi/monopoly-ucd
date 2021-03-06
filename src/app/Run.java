package app;

import board.Board;
import board.Card;
import board.CardType;
import board.Dice;
import board.Property;
import board.Rules;
import player.Player;
import player.Token;
import utils.Screen;
import utils.Utils;

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
		Board board = new Board(); 
		Card community = new Card(CardType.COMMUNITY);
		Card chance = new Card(CardType.CHANCE);
		
		int numUsers = 0; // initializing number of user variable

		do {
			disp.numberOfPlayersMsg(); // display message for new players
			numUsers = input.inInteger();
			System.gc();
		} while (!Rules.checkNumberofUsers(numUsers)); // check for correct input

		
		//game end conditions
		int bankruptLimit;
		int bankruptNum=0;
		if (numUsers==2)
			bankruptLimit = 1;
		else
			bankruptLimit = 2;
		
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
		int iter;
		int roll;
		int rollTotal;
		Property currentTile;
		
		//game loop
		while (gameplay) {
			//players loop
			for (int i = 0; i < numUsers; i++) {
				//ignore bankrupt players
				if(player.get(i).getAmount()<1)
					continue;
				
				disp.playerStatus(player.get(i));
				iter = 0;
				rollTotal = 0;
				//roll dice
				if(player.get(i).getInJail())
				{
					if (player.get(i).getOutOfJailCard())
						{
						player.get(i).setInJail(false);
						System.out.println("get out of jail card used");
						}
			
					else {
						player.get(i).setInJail(false);
						System.out.println("in jail, turn ignored");
						continue;
					}
				}
				do {
					disp.rollDice();
					input.pressAnyKey();
					roll = dice.roll();
					System.out.printf("dice value: %d\n", roll);
					rollTotal += roll;
					iter++;
				}while(Rules.diceRule(roll, iter));
				
				//check for three doubles
				if(Rules.diceRuleJail(roll, iter)) {
					disp.diceRuleGotoJail();
					player.get(i).setInJail(true);
				}
				else
				{
					player.get(i).moveBoardPosition(rollTotal);
					//tile action
					currentTile = board.getBoardTitle(player.get(i).getBoardPosition());
					
					if(!currentTile.isOwnable()) //it's not a property card
					{
						if(currentTile.name()=="Chance")
						{
							disp.drawChanceMessage();
							input.pressAnyKey();
							chance.draw(); //draw random card
							player.set(i, chance.execute(player.get(i))); //update the value of player
						}
						//if it's go to jail tile
						else if (currentTile.name()=="Go To Jail")
						{
							player.get(i).setInJail(true);
							disp.sentToJailMessage();
						}
						// if it's a community chest
						else if (currentTile.name()=="Community Chest")
						{
							disp.drawCommunityMessage();
							input.pressAnyKey();
							community.draw(); //draw random card
							player.set(i, community.execute(player.get(i))); //update the value of player
						}
						
					}	
					
					currentTile = board.getBoardTitle(player.get(i).getBoardPosition());//updated value
					
					if(currentTile.isOwnable())
						if(currentTile.isOwned())
						{
							player.get(i).deductAmount(currentTile.rent());
							int j = player.indexOf(currentTile.owner());
							player.get(j).addAmount(currentTile.rent());
							disp.payRent(player.get(i),currentTile.owner(),currentTile.rent());
						}
						else
						{
							disp.purchaseQuestion(currentTile.cost(),currentTile.name());
							if(input.ynInput())
							{
								player.get(i).deductAmount(currentTile.cost());
								currentTile.isPurchased(player.get(i));
								disp.purchased(player.get(i),currentTile);
							}
							else {
								disp.autionStart();
								player = Rules.auction(player,currentTile,input);
							}
						}
				}
				
				if(player.get(i).getAmount()<1) {
					disp.playerBanckrupt(player.get(i));
					bankruptNum++;
				}
				disp.playerStatus2(player.get(i));
				
			}
		if(bankruptNum>=bankruptLimit)
			gameplay =	false;
		}
		Player winnerPlayer=Rules.winner(player);
		disp.winner(winnerPlayer);
		System.out.println("exiting");
	}
}