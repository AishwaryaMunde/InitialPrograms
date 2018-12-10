package datastructure;

import utility.Utility;

public class Calender
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter month : ");
		int month = utility.inputInteger();
		System.out.println("Enter year : ");
		int year = utility.inputInteger();
		utility.printCalender(month, year);
	}
}
