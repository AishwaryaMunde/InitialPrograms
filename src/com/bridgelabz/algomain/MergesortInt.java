package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;
public class MergesortInt 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter total how many elements you want enter : ");
		int n=utility.inputInteger();
		System.out.println("Enter array elements : ");
		int[] array = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
			array[i]=utility.inputInteger();
		} 
	    utility.sort(array, 0, array.length-1);   
	    System.out.println("\nSorted array"); 
	    Utility.printArray(array); 
	}
}
