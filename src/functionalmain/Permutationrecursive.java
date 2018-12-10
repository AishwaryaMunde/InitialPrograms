package functionalmain;
import utility.Utility;

public class Permutationrecursive 
{
	public static void main(String[] args) 
	{		
		Utility utility = new Utility();
		System.out.println("Enter String : ");
		String str = utility.inputString();
		Utility.permutationRecursion(str.toCharArray(),0);
	}
}
