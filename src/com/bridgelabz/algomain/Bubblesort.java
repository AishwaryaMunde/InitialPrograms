package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;
public class Bubblesort
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter limit :");
		int number = utility.inputInteger();
		int array[]=new int[number];
		System.out.println("Enter array elements :");
		for(int i=0;i<number;i++)
		{
			array[i]=utility.inputInteger();
		}
		utility.Sorting(number, array);
		utility.sortedArray(number, array);		
	}	
}
