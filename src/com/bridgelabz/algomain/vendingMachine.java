package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;
public class vendingMachine 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter rupees whose change you want : ");
		int rupee = utility.inputInteger();
		int[] notes = { 1000 , 500 , 100 , 50 , 20 , 10 , 5 , 2 , 1 };
		utility.vendingMachine(notes , rupee);
	}
}
