package com.bridgelabz.functionalmain;

import com.bridgelabz.utility.Utility;

public class Distance
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		utility.euclidianDistance(x, y);
	}	
}
