package com.bridgelabz.algomain;

import com.bridgelabz.utility.Utility;

public class DecToBinaryConverion 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter decimal number : ");
		int decimal = utility.inputInteger();
		Utility.toBinary(decimal);
	}
}
