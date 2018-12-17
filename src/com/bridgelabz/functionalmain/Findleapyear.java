package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;

public class Findleapyear {
	public static void main(String args[])
	{
		Utility utility = new Utility();
		System.out.println("\nEnter year : ");
		int yearnumber = utility.inputInteger();
		utility.leap_year(yearnumber);
	}
}
