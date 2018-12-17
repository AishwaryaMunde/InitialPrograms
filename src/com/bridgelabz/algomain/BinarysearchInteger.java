package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;
public class BinarysearchInteger 
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
        int N = (int) Math.pow(2, n);
        System.out.println(" N = " +N);
        System.out.println("\nkeep one number in your mind from 0 to " +(N-1));
		Utility.search(0, N);  
	}
}
