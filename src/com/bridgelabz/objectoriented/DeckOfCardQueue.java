package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.Utility;

public class DeckOfCardQueue 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = utility.assignCards();
		String[] shuffleCards = utility.shuffleCards(init);
		String[][] distributedShuffle = utility.distributedCards(shuffleCards, noOfPlayer, noOfCards);
		System.out.println("Players Cards After Sorting ");
		utility.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
	}	
}
