package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;
public class Primenumber 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter range : ");
		int range = utility.inputInteger();
		int[] primenumber = new int[range];
		primenumber=utility.printingPrimeNumber(range);
		System.out.println("Prime numbers are: " );
		for(int i=0 ; i<range ; i++)
		{
			if(primenumber[i]>1)
			{
			System.out.println(primenumber[i]);
			}
		}		
	}
}
