package functionalmain;
import utility.Utility;
import java.io.*;
public class findpower {
	public static void main(String[] args)throws IOException  
	{
		Utility utility = new Utility();
		System.out.println("Enter number :");
		int n=Integer.parseInt(args[0]);
		System.out.println(n);
		utility.table(n);
	}
}
