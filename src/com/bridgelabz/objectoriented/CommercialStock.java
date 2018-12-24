package com.bridgelabz.objectoriented;

import java.util.Scanner;

import org.json.simple.JSONObject;

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
			System.out.println("Enter What you wants to do\n1. Add Details\t2. Buy\t3. Sell\t4. Print Report ");
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
				case 4 : 
					System.out.println("Whose data you want to see\n1. Company\t2. User");
					int reportchoice = utility.inputInteger();
					switch (reportchoice) 
					{
					case 1:
						String companyFilePath = "Company.json";
						String companyArrayName = "StockDetails";
						stock.printReport(companyFilePath, companyArrayName);						
						break;
					case 2:
						String userFilePath = "UserStock.json";
						String userArrayName = "UserDetails";
						stock.printReport(userFilePath, userArrayName);
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}					
				default :
					System.out.println("Invalid Choice..!!!");
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = scanner.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
}
