package com.bridgelabz.objectoriented;
import com.bridgelabz.utility.Utility;

public class DeckOfCards 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = utility.assignCards();
		String[] shuffleCards = utility.shuffleCards(init);
		@SuppressWarnings("unused")
		String[][] distributedshuffle = utility.distributedCards(shuffleCards, noOfPlayer, noOfCards);
	}
}
