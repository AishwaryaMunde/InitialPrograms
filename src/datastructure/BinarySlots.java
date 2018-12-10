package datastructure;

import utility.Utility;

public class BinarySlots 
{
	public static void main(String[] args) 
	{
		Utility util = new Utility();		
		System.out.println("Enter number of slots: ");
		int number= util.inputInteger();
		int result1 = util.factorial(2*number);
		int result2 =  util.factorial(number+1);
		int result3 =  util.factorial(number);
		int finalResult = result1 / (result2 * result3);
		System.out.println("Total slots can be : "+finalResult);
	}

}
