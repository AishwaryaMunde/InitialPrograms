package com.bridgelabz.objectoriented;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CommercialStock
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		CommercialStockMethods stock = new CommercialStockMethods();
		char ch;
		System.out.println("****Welcome to Stock Market****");
		do
		{
			System.out.println("Enter What you wants to do\n1.Add Details\t2.Buy\t3.Sell ");
			int choice = utility.inputInteger();			
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					break;
				case 3:
					stock.sellStock();
					break;
				default : 
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = scanner.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
}
