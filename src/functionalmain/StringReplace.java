package functionalmain;
import utility.Utility;

public class StringReplace {

	public static void main(String[] args) {

		// initializing variables
		Utility utility = new Utility();
		String template = "Hello <<UserName>>, How are you?";

		System.out.println("Please enter your name: ");
		String userName = utility.inputString();
		String output = utility.replaceString(template, userName);
		System.out.println(output);
	}

}