package datastructure;

import utility.Utility;

public class PrimeAnagramTwoD 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter range : ");
		int range = utility.inputInteger();
		int[] primenumber = new int[range];
		primenumber=utility.printingPrimeNumber(range);
		
		int[] anagram = Utility.checkAnagram(primenumber);		
		utility.twoDPrimeAnagram(anagram);
    }
}
