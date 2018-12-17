package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class CalenderQueue
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter month : ");
		int month = utility.inputInteger();
		System.out.println("Enter year : ");
		int year = utility.inputInteger();
		utility.calenderQueue(month, year);
	}
}
