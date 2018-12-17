package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PrimeTwoDArray 
{
	public static void main(String[] args) 
	{
		Utility  util = new Utility();	
		System.out.println("Enter range to print prim number ");
		int range =  util.inputInteger();
		
		int[] primenumber = util.printingPrimeNumber(range);
		util.twoDPrime(primenumber);
	}
}
