package com.bridgelabz.objectoriented;
import com.bridgelabz.utility.Utility;

public class CommercialStockAccount 
{
	public static void main(String[] args) throws Exception 
	{
		Utility utility = new Utility();
		int ch;
		do
		{
			System.out.println("What you wants to do : ");
			System.out.println("1.Stock Buy\n2.Stock Sell");
			ch = utility.inputInteger();
			switch(ch)
			{
			case 1:
				break;
			case 2: 
				break;
			default:
				System.out.println("Invalid choice...!!!");
				break;
			}
		}while(ch<=2);
	}

}
