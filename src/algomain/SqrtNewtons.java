package algomain;

import utility.Utility;

public class SqrtNewtons 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter value of c : ");
		Double c = utility.inputDouble();
		Utility.sqrtNewtons(c);
	}

}
