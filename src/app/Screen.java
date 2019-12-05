package app;

import java.util.List;

import player.Token;

public class Screen {
	String message;
	
	public Screen()
	{
		this.welcomeScreen();
	}
	
	public void welcomeScreen()
	{
		System.out.printf("Welcome to MONOPOLY by Hamza and BaoAnh\n");
	}
	
	public void numberOfPlayersMsg()
	{
		System.out.printf("\nEnter number of players:");
	}
	
	public void nameMessage(int n)
	{
		System.out.printf("\nEnter player %d name:",n);
	}
	
	public void selectToken(List<Token> tokens)
	{
		System.out.println("Available tokens:");
		int i = 0;
		for (Token token: tokens)
		{
			System.out.printf("%d %s \t",i,token);
			i++;
		}
		System.out.printf("\nEnter token number:");
	}

}
