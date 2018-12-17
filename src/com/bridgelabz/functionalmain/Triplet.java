package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;
public class Triplet 
{
	public static void main(String[] args) 
	{
		//Initializing varialbles.......
		Utility utility = new Utility();
		System.out.println("Enter how many array elements you want :");
		int number= utility.inputInteger();
		int arr[] =new int[number];
		System.out.println("\nEnter array elements :");
		//Accept array elements 
		for(int i=0;i<number;i++)
		{
			arr[i] = utility.inputInteger();		
		}	
		Utility.cal(arr, number);
	}
}

