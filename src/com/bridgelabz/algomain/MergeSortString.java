package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;

public class MergeSortString 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		//MergeSortString merge = new MergeSortString();
		System.out.println("Enter total how many Strings you want enter : ");
		int range = utility.inputInteger();
		System.out.println("Enter Strings to be sorted : ");
		String[] array = new String[range];
		for(int i = 0 ; i<range ; i++)
		{
			array[i]=utility.inputString();
		} 
		utility.sort(array, 0, array.length-1);   
	    System.out.println("\nSorted array"); 
	    Utility.printStringArray(array); 
	}
}
