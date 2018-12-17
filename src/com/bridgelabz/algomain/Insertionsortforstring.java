package com.bridgelabz.algomain;
import com.bridgelabz.utility.Utility;

public class Insertionsortforstring 
{
	public static void main(String[] args) 
	{

		Utility utility = new Utility();		
		System.out.println("Enter range to accept number of string : ");
		int num = utility.inputInteger();
		String[] str = new String[num];
		System.out.println("Enter Strings : ");
		for(int i =0 ;i<num ; i++)
		{
			str[i]=utility.inputString();
		}
		utility.stringSort(num, str);
		System.out.println("Sorted strings are  :");
		for(int i =0 ;i<num ; i++)
		{
			System.out.print(str[i]+"  ");
		}
	}
}
