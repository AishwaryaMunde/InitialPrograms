package com.bridgelabz.objectoriented;

import java.util.Scanner;


import com.bridgelabz.utility.Utility;

public class AddressBook 
{
	public static void main(String[] args) throws Exception {
		AddressBookMethods book = new AddressBookMethods();
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		char ch;
		do
		{
			System.out.println("What you wants to do : ");
			System.out.println("1.Add Address\n2.Edit Information\n3.Sort Information"
					+ "\n4.Remove Person");
			int choice = utility.inputInteger();
			switch(choice)
			{
			case 1 :
				book.addAddress();
				break;
			case 2 :
				book.editInfo();
				break;
			case 3 :
				book.sortData();
				break;
			case 4 :
				book.removeData();
				break;
			default :
				break;				
			}
			System.out.println("Do u want to continue : ");
			ch = scanner.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		}
}
