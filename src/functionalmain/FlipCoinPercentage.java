package functionalmain;
import utility.Utility;
public class FlipCoinPercentage 
{
	public static void main(String[] args) 
	{
		//Initializing variables
		Utility utility = new Utility();
		System.out.println("\nEnter how many times you wants to flip the coin :");
		int no_of_times = utility.inputInteger(); //User Input 
		utility.HeadOrTail(no_of_times ); //Calculating head or
										   //tail percentage	
	}
}
