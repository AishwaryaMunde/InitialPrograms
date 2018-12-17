package com.bridgelabz.algomain;

import com.bridgelabz.utility.Utility;
import java.lang.NumberFormatException;
public class MonthlyPayment 
{
	public static void main(String[] args)throws NumberFormatException
	{
		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		double R = Integer.parseInt(args[2]);
		Utility.monthlyPayment(P, Y, R);
	}
}
