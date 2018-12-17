package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;
public class windchillcalculate 
{
	public static void main(String args[]) 
	{
		//Initializing variables
		Utility utility = new Utility();
		System.out.println("\nGiven Temperature and speed is :");
		double t = Double.parseDouble(args[0]); //Command line argument
		double v = Double.parseDouble(args[1]); //Command line argument
		System.out.println("T = "+t+ "\nV = "+v);
		utility.windChillCalculation(t,v);
	}
}
