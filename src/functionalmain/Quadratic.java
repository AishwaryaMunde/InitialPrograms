package functionalmain;

import utility.Utility;
public class Quadratic

{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("\nEnter values of a :  ");
		int a = utility.inputInteger();
		System.out.println("\nEnter values of b :  ");
		int b= utility.inputInteger();
		System.out.println("\nEnter values of c :  ");
		int c=utility.inputInteger();
		System.out.println("\nEquation is :"+a+"x*x + "+b+"x + "+c );	
		utility.CalculatingRoots(a, b, c);
	}
}
