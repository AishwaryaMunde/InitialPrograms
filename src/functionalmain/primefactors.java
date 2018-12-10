package functionalmain;
import utility.Utility;
public class primefactors 
{
	public static void main(String[] args) 
	{
		//Initializing variables 
		Utility utility = new Utility();
		System.out.println("\nEnter any prime no. :");
        int n = utility.inputInteger();        
        utility.calculate(n);
	}
}
