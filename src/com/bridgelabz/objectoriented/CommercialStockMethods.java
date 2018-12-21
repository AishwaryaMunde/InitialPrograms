package com.bridgelabz.objectoriented;

import org.json.simple.parser.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.utility.Utility;

public class CommercialStockMethods 
{
	Utility utility = new Utility();
	Scanner scanner = new Scanner(System.in);
	private String companyFilePath = "Company.json";
	private String userFilePath = "UserStock.json";
	private CommercialCompanyPojo companyPojo = new CommercialCompanyPojo();
	
	public void addDetails() throws Exception
	{
		System.out.println("Enter Whose details you want to add\n1.Company Stock\t2.User Deatils");
		int choice = utility.inputInteger();
		switch(choice)
		{
		case 1:
			addStockDetails();				
			break;
		case 2:
			addUser();
			break;
		default:
			System.out.println("Invalid choice...!!!");
			System.out.println("Do you wants to enter again...(Y/N)");
			char ch = scanner.next().charAt(0);
			if(ch == 'Y' || ch == 'y')
				addDetails();
		}
	}	
	public void addStockDetails() throws Exception
	{
		File file = new File(companyFilePath);
		System.out.println("Enter Stock name : ");
		String stockName = utility.inputString();
		companyPojo.setStockName(stockName);
		
		System.out.println("Enter stock symbol : ");
		String stockSymbol = utility.inputString();
		companyPojo.setStockSymbol(stockSymbol);
		
		System.out.println("Enter no. of share : ");
		String noOfShare = utility.inputString();
		companyPojo.setNoOFShare(noOfShare);
		
		System.out.println("Enter share Price : ");
		String sharePrice = utility.inputString();
		companyPojo.setSharePrice(sharePrice);		
		createCompanyJsonObj(companyPojo ,file);
	}
	@SuppressWarnings("unchecked")
	public void createCompanyJsonObj(CommercialCompanyPojo companyPojo , File file) throws Exception
	{
		JSONParser parser = new JSONParser();		 
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray =(JSONArray)jsonObj.get("StockDetails");
		JSONObject simple = new JSONObject();
		simple.put("StockName",companyPojo.getStockName());
		simple.put("StockSymbol", companyPojo.getStockSymbol());
		simple.put("NoOfShare", companyPojo.getNoOFShare());
		simple.put("SharePrice", companyPojo.getSharePrice());
		jsonArray.add(simple);
		jsonObj.put("StockDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj , companyFilePath);		
	}
	private void writeIntoFile(JSONObject jsonObj2 , String filePath) throws Exception {
		File file = new File(filePath);
		FileWriter writer = new FileWriter(file);
		writer.write(jsonObj2.toString());
		writer.flush();
	}	
	
	public void addUser() throws Exception
	{
		CommercialUserPojo userPojo = new CommercialUserPojo();
		File file = new File(userFilePath);
		System.out.println("Enter User name : ");
		String userName = utility.inputString();
		userPojo.setUserName(userName);
				
		System.out.println("Enter no. of share : ");
		String noOfShare = utility.inputString();
		userPojo.setNoOfShares(noOfShare);
		
		System.out.println("Enter share price : ");
		String sharePrice = utility.inputString();
		userPojo.setPrice(sharePrice);					
		createUserJsonObj(userPojo ,file);
	}	
	@SuppressWarnings("unchecked")
	public void createUserJsonObj(CommercialUserPojo userPojo , File file) throws Exception
	{
		JSONParser parser = new JSONParser();		 
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray =(JSONArray)jsonObj.get("UserDetails");
		JSONObject simple = new JSONObject();
		simple.put("UserName",userPojo.getUserName());
		simple.put("NoOfShare", userPojo.getNoOfShares());
		simple.put("SharePrice", userPojo.getPrice());
		jsonArray.add(simple);
		jsonObj.put("UserDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj ,userFilePath );
	}	
	
	/*JSONObject compareObj;
	
	*/
	
	public void buyStock() throws Exception
	{
		File file = new File(companyFilePath);
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray = (JSONArray)jsonObj.get("StockDetails");
		System.out.println("Enter user name");
		String userName = utility.inputString();
		boolean isAvailble = checkPersonAvailability(userName);
		JSONObject obj;
		if(isAvailble)
		{
			for(int i = 0 ; i < jsonArray.size();i++)
			{
				obj = (JSONObject)jsonArray.get(i);
				System.out.println((i+1)+" : "+obj);
			}
			System.out.println("Enter Stock name from given list whose stocks you want to buy");
			String stockName = utility.inputString();
			JSONObject compareObj;
			for(int i=0;i<jsonArray.size();i++)
			{
				compareObj = (JSONObject)jsonArray.get(i);
				if(compareObj.get("StockName").equals(stockName))
				{
					System.out.println(compareObj);
					//System.out.println("share for "+stockName+" "+compareObj.get("NoOfShare"));
					System.out.println("Enter how many you wants buy : ");
					int noOfShares = utility.inputInteger();	
					/*int totalShare = (int)compareObj.get("NoOfShare");
					System.out.println(totalShare);*/
				}
			}	
		}
		else
		{
			System.out.println("Entered user is not available in list");
			System.out.println("Do you want to register this user (Y/N) ");
			char ch = scanner.next().charAt(0);
			if(ch == 'Y' || ch == 'y')
			{
				addUser();
				System.out.println("User Registered Successfully");
			}
			System.out.println("Now you want to buy stock (Y/N)");
			char ch1 = scanner.next().charAt(0);
			if(ch1 == 'Y' || ch1 == 'y')
			{
				buyStock();
			}
		}
	}
	public boolean checkPersonAvailability(String userName) throws Exception
	{
		boolean isPresent = false;
		File file = new File(userFilePath);
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray = (JSONArray)jsonObj.get("UserDetails");
		JSONObject compareObj;
		for(int i=0;i<jsonArray.size();i++)
		{
			compareObj = (JSONObject)jsonArray.get(i);
			if(compareObj.get("UserName").equals(userName))
			{
				isPresent = true;
			}
		}
		return isPresent;		
	}	
	/*public boolean searchStockName(String stockName) throws Exception
	{
		boolean stockNameAvailable = false;
		File file = new File(companyFilePath);
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray = (JSONArray)jsonObj.get("StockDetails");
		JSONObject compareObj;
		for(int i=0;i<jsonArray.size();i++)
		{
			compareObj = (JSONObject)jsonArray.get(i);
			if(compareObj.get("StockName").equals(stockName))
			{
				System.out.println(compareObj);
				stockNameAvailable = true;
			}
		}
		return stockNameAvailable;		
	}*/
	public void sellStock() throws Exception
	{
		File file = new File(userFilePath);
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
		JSONArray jsonArray = (JSONArray)jsonObj.get("UserDetails");
		System.out.println("Enter user name");
		String userName = utility.inputString();
		JSONObject compareObj;
		for(int i=0;i<jsonArray.size();i++)
		{
			compareObj = (JSONObject)jsonArray.get(i);
			if(compareObj.get("UserName").equals(userName))
			{
				System.out.println(compareObj);
				System.out.println("Enter how many shares you wants to sell ?  ");
				int sharesToSell = utility.inputInteger();
				System.out.println("Enter Price Of Each Share");
				int priceOfEachShare = utility.inputInteger();
			}
		}		
	}
	
}
