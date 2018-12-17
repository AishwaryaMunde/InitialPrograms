package com.bridgelabz.algomain;

import com.bridgelabz.utility.Utility;

public class BinaryNibble
{
	public static void main(String arg[])
	{ 
	    Utility utility = new Utility();
	    System.out.println("Enter decimal no. : ");
	    int decimal = utility.inputInteger();
	    int nibble = Utility.swapNibbles(decimal);
	    System.out.print("Nibble is "+nibble); 
	    utility.isPowerTwo(decimal);	    
	} 

}
