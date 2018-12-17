package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;
public class GamblerGame 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		//Initialize variables
		System.out.println("\nEnter stack :");
		int stake = utility.inputInteger(); 
		System.out.println("\nEnter goal :");
		int goal = utility.inputInteger();
		System.out.println("Enter limit");
		int n = utility.inputInteger();
		int bets=0,win=0;
		utility.playthegame(n, stake, goal, bets, win);
	}

}
