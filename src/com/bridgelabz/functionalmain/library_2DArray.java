package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;

//import java.util.Scanner;
import java.io.*;
public class library_2DArray
{
	public static void main(String[] args) throws IOException
	{
		Utility utility = new Utility();
		System.out.println("Enter rows for 2D array :\t");
		int M = utility.inputInteger(); //Enter rows
		System.out.println("Enter columns for 2D array :\t");
		int N = utility.inputInteger(); //Enter columns 
		System.out.println("Enter array elements : ");
		utility.twoDarray(M, N);		
	}
}
