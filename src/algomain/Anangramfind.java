package algomain;
import utility.Utility;
public class Anangramfind
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter 1st String : ");
		String str1 = utility.inputStringWithNext();
		String str3 = str1.replaceAll("\\s","");
		System.out.println("Enter 2nd String : ");
		String str2 = utility.inputStringWithNext();
		String str4 = str2.replaceAll("\\s","");
		utility.checkAnangram(str3, str4);	
	}
}
