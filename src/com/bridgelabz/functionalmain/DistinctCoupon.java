package com.bridgelabz.functionalmain;

import com.bridgelabz.utility.Utility;

public class DistinctCoupon 
{
	public static void main(String[] args) 
	{
		//Initializing variables 
		Utility utility = new Utility();
		System.out.println("Enter how many distinct "
				+ "coupons you wants to generate :");
		int No_Of_Times = utility.inputInteger();
		Utility.RandomNumberGeneration(No_Of_Times);
	}
}
