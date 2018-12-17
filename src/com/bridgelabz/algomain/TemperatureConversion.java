package com.bridgelabz.algomain;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
			Utility utility = new Utility();
			System.out.println("Enter temperature  ");
			int temperature = utility.inputInteger();
			Utility.temperatureConversion(temperature);
	}

}
