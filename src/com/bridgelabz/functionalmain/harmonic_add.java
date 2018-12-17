package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;

public class harmonic_add 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter limit");
		int n=utility.inputInteger();
		utility.sum(n);
	}
}
