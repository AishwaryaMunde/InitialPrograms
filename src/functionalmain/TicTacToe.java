package functionalmain;
import utility.Utility;

public class TicTacToe 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		TicTacToe t = new TicTacToe();
		char[][] gameboard = new char[3][3];
		System.out.println("*******TIC TAC TOE GAME*******");
		System.out.println("Player VS Computer");
		System.out.println("Enter player symbol :");
		String str1 = utility.inputString();
		char usersymbol = str1.charAt(0);
		System.out.println("Enter computer symbol :");
		String str2 = utility.inputString();
		char computersymbol = str2.charAt(0);
		utility.initializeBoard();
		System.out.println("\n*********Game Board**********\n");
		utility.displayBoard();
		System.out.println("\nDo you want to turn 1st  y/n : ");
		String str3 = utility.inputString();
		char turn = str3.charAt(0);
		int count = 0;
		while(count++<9)
		{
			switch(turn)
			{
			case 'y' :
				System.out.println("\n****Player Turn*****");
				utility.makeMove(usersymbol , 1);
				utility.displayBoard();
				if(utility.winORLose())
				{
					System.out.println("\n******Player Win*****");
					return;
				}
				turn = 'n';
				break;
			case 'n':
				System.out.println("\n*****Computer turn****");
				utility.makeMove(computersymbol,0);				
				utility.displayBoard();
				if(utility.winORLose())
				{
					System.out.println("\n****Computer Win******");
					return;
				}
				turn = 'y';
				break;
			}
		}
		System.out.println("\nGame Draw...!!!!!");
	}
}
