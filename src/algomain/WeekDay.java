package algomain;
import utility.Utility;
public class WeekDay 
{
	public static void main(String[] args) 
	{		
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int result = Utility.dayOfWeek(month, day, year);
		String[] array = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println(array[result]);
	}
}
