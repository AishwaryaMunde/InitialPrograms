package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;
public class PrimeAnangramPalindrome 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter range : ");
		int range = utility.inputInteger();
		int[] primenumber = new int[range];
		primenumber=utility.printingPrimeNumber(range);
		System.out.println("Prime no's are : ");
		for(int i=0 ; i<range ; i++)
		{
			if(primenumber[i]>0)
			{
			System.out.print(primenumber[i]+" ");
			}
		}
		System.out.println("\nPrime No which are palindrome : ");
		Utility.checkPalindrome(primenumber);
		int[] anagram = Utility.checkAnagram(primenumber);
		for(int i=0 ;i<anagram.length;i++)
		{
			if(anagram[i]>0)
			{
				System.out.print(anagram[i]+" ");
			}
		}
	}
}

