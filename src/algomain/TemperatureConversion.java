package algomain;

import utility.Utility;

public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
			Utility utility = new Utility();
			System.out.println("Enter temperature in fahrenheit ");
			int temperature = utility.inputInteger();
			Utility.temperatureConversion(temperature);
	}

}
