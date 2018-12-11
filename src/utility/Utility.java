package utility;

import java.io.*;
import java.util.*;
import datastructure.*;

public class Utility
{
		/**************String Replace *****************/
	
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * This method takes an input string from the user and returns
		 * it to the specified method. 
		 * 
		 * @return String: the input string given by the user
		 */
		public String inputString() {
			return scanner.next();
		}
		
		public String inputStringWithNext() {
			return scanner.nextLine();
		}
		/**
		 * This method takes an input string from the user and returns
		 * it to the specified method. 
		 * 
		 * @return String: the input string given by the user
		 */
		public Integer inputInteger() {
			return scanner.nextInt();
		}
		
		public Double inputDouble() {
			// TODO Auto-generated method stub
			return scanner.nextDouble();
		}
		
		/**
		 * This method replaces the template with the given input string
		 * 
		 * @param template is a string which is to be modified or replace
		 * @param userName the input string given by the user
		 * @return output the modified string
		 */
		public String replaceString(String template, String userName) {
			if (userName.length() < 3)
				return "Please input name with more than 3 characters";
			else {
				String output = template.replace("<<UserName>>", userName);
				return output;
			}
		}
		/************************Flip Coin**********************/
		static Random random = new Random(); //Random function to
		//to generate random numbers

	/**This method generate random numbers and check whether 
	* it is head or tail
	* @param no_of_times is the range..and till that range
	* you have to generate random numbers.
	*/
	public void HeadOrTail( int no_of_times)
	{
		long headpercentage=0 , tailpercentage=0;
		int headcount=0 , tailcount=0;
		//recursion method to enter valid input
		if(no_of_times<0)
		{
				System.out.println("Please enter valid input :");
				no_of_times=scanner.nextInt();
				HeadOrTail(no_of_times);
		}
		for(int i=0;i<no_of_times;i++)
		{
			double	randNumber = Math.random();
			System.out.println("Random numbers are\t :"+randNumber);
			if(randNumber<0.5)
			{
				System.out.println("****Tail****\t\t :"+randNumber+"\n");
				tailcount=tailcount+1;
			}
			else
			{
				System.out.println("****Head****\t\t :"+randNumber+"\n");
				headcount=headcount+1;
			}
		}
		System.out.println("Total heads are :"+headcount);
		System.out.println("Total tails are :"+tailcount);
		
		headpercentage = (headcount*100)/no_of_times;
		System.out.println("Percetage of occurence of head is :"+headpercentage);
		tailpercentage = (tailcount*100)/no_of_times;
		System.out.println("Percetage of occurence of tail is :"+tailpercentage);
		if(headpercentage>tailpercentage)
		{
			System.out.println("\n Head count is greater");
		}
		else
			System.out.println("Tail count is greater ");
		}
	/*************************Leap Year ***************************/
	int n;
	
		/**This method check that entered year is leap 
		 * year or not
		 * 
		 */
		public void leap_year(int yearnumber)
		{
			if(String.valueOf(yearnumber).length()<4)
			{
				System.out.println("Please enter 4 digit number :");
				yearnumber=scanner.nextInt();
				leap_year(yearnumber);
			}
			
			else if(yearnumber%4==0)
			{
				//if yr no. is divisible by 4 then check by 100
				if(yearnumber%100==0)
				{
					//now checking no. is divisible by 400 or not
					if(yearnumber%400==0)
					{
						//if no. divisible by 4,100 and 400 ie. leap year
						System.out.println("\nIt is leap year");
					}
					else
						System.out.println("\\nIt is not  leap year ");
				}
				//if no is divisible by 4 and not by 100 ,that is leap yr
				else
					System.out.println("\nIt is leap year");
			}
			else
				System.out.println("\nIt is not leap year ");
		}
	/***********************Power Of 2*****************************/
		
		/**This method Print the table of two till the range 
		 * entered by user* 
		 */
		public void table(int n)
		{  	
			int i = 1,mul;
			if(n<=31)
			{
				for(i=0;i<n;i++)
				{     
				  	mul=(int) Math.pow(2,i);
			      	System.out.printf("\n%d",mul);
				}
			}
			else
				System.out.println("Invalid input..!!!");			
		}
		
	/***********************Harmonic Number**********************/
		/**
		 * @param n is the limit, taken from user
		 * @return It return output
		 */
		public int sum(int n)
		{
			float sum=0;
			
			//ensure n!=0
		    if(n>0)
		    {
				for(int i=1;i<=n;i++)
				{
					sum=sum+(float)1/i;
					
				}
				System.out.println("\nSum of harmonic no :"+sum);
		    }
		    else
		    	System.out.println("You have entered invalid no.");
			return n;
		}
		
	/****************************Factors****************************/
		/**This method calculate factors of prime no.
		 * @param n is a input given by user
		 * whose factors we have to calculate
		 */
		public void calculate(int n)
		{
			System.out.print("The prime factorization of " + n + " is: ");
	        for (int i = 2; i*i <= n; i++) 
	        {
	            while (n % i == 0) 
	            {
	                System.out.print(i + " "); 
	                n = n / i;
	            }
	        }
	        if (n > 1)
	        	System.out.println(n);
	        else     
	        	System.out.println();
		}
	/*****************************Gambler****************************/
		
		/**This method shows simulation of gambler game that how 
		 * and when game the game will win  
		 * @param n is range that how many times you are going to play
		 * @param stake is your initial amount 
		 * @param goal is achieve goal that is increment in amount
		 * @param bets is counter to check whether how many times 
		 * you can play
		 * @param win is counter that how many times you win 
		 */
		public void playthegame(int n , int stake , int goal , int bets, int win)
		{
			for(int i=0;i<n;i++)
			{
				    int cash = stake;
		            while (cash > 0 && cash < goal) //play till cash is greater 
		            {								//than 0 and less than goal 
		                bets++;
		                if (Math.random() < 0.5)
		                	cash++;     // win $1
		                else
		                	cash--;     // lose $1
		            }
		            if (cash == goal) 
		            	win++;  		
		    }
			System.out.println("\nHe/She wins "+win+" of "+ n);
			System.out.println("\nPercentage of win is : "+(1.0 * bets)/n);	
		}
	/***************************Coupon Number ********************/
		/**This method generate random numbers and repeatedly
		 * check whether it is unique one or not 
		 * @param No_Of_Times is the number thats how many coupons 
		 * you wants to generate
		 * @return one temporary variable which is used for 
		 * looping
		 */
		
		public static double RandomNumberGeneration(int No_Of_Times)
		{
			boolean[] isDistinct = new boolean[No_Of_Times];
			int temp=0;
			while(temp<No_Of_Times)
			{	
				int randomnumber = (int ) (Math.random()*No_Of_Times);
				if(!isDistinct[randomnumber])
				{
					temp++;
					isDistinct[randomnumber]=true;
					System.out.println("Distinct coupons are : "+randomnumber);
				}
			}
			return temp;
		}
	/**************************2D Array*****************************/		
		
		PrintWriter printwriter = new PrintWriter(System.out, true);
		/**This method generate two dimensional array and print using 
		 * printWriter function
		 * @param M this parameter is for entering number 
		 * 			of rows
		 * @param N this parameter is for entering number
		 * 			of columns 
	 	 * @return will null value
		 */
		public Integer twoDarray(int M,int N)
		{		
			int[][] array = new int[M][N];
			for(int i=0;i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					array[i][j]=scanner.nextInt(); //accept array elements 
												  //from user
				}
			}
			System.out.println("2D array : \n");
			for(int i=0;i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					printwriter.print(array[i][j]+" ");//printing 2D array
				}
				printwriter.println( );
			}
			
			return null;
		}
		
	/**************************Sum of Three Integer******************/
		
		/**In this method we created an array , And in that array
		 * we check any three numbers whose addition is 0
		 * we call those 3 number as triplet 
		 * @param arr where triplet is store
		 * @param number is array range which store total number of 
		 *  elements you entered in array
		 */
		public static void cal(int[] arr,int number) 
	    {
			 for(int i=0;i<number-2;i++)
			 {
				 for(int j=i+1;j<number-1;j++) 
				 {
					 for(int k=j+1;k<number;k++)
					 {
						 //addition should be equals to 0
						 if(arr[i]+arr[j]+arr[k]==0) //check addition of 3
							 	     //number in array is 0 
						 {
		    				System.out.println("\nTriplets are : ");
		    				System.out.print(arr[i]); 
		                    System.out.print(" "); 
		                    System.out.print(arr[j]); 
		                    System.out.print(" "); 
		                    System.out.print(arr[k]); 
		                    System.out.print("\n");
		                   
		    			 }
		    		 }
				 }
			 }
			 //If in array there is no any 3 number whose addition
			 //is 0 then it will print that there is no any triplet
	    }	
		
	/*****************Euclidian Distance************************/	
	  
		public void euclidianDistance(int x , int y)
		{
			int distance = (int) Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
			System.out.println("Eucludian distance : " + distance );
		}
		
		
	/***************************Permutation*************************/
		
		/** This method swap the elements in array
		 * @param ch store character array
		 * @param i store index element
		 * @param j this also point to array element
		 */
		public static void swap(char[] ch, int i , int j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;		
		}
		/**This method find permutation of string using recursion
		 * @param ch store character array of string for permutation
		 * @param currentIndex point to current index in array 
		 */
		public static void permutationRecursion(char ch[] , int currentIndex)
		{
			if(currentIndex==ch.length-1)
				System.out.println(String.valueOf(ch));
			for(int i=currentIndex;i<ch.length;i++)
			{
				swap(ch,currentIndex,i);
				permutationRecursion(ch,currentIndex + 1);
				swap(ch,currentIndex,i);
			}
		}		
		
		/**This method is to find permutation of string using recursion
		 * @param ch is used to store character array of string
		 */
	/***************************Stopwatch***********************/	
		/**This method takes current time of system  
		 * @param start_time in this we store current system
		 * time
		 * @return will return start-time
		 */
		public Long StartTime(long start_time)
		{
			//System.out.println("\nPress 1 start time");
			if(start_time==0)
			{
			start_time=System.currentTimeMillis();
			return start_time; 
			}
			else
				System.out.println("\n*********Invalid input*******");
			
			return (long) 0;
		}
		
		/**This mathod takes end time of current working system
		 *  when we stop or when we entered time 
		 * @param end_time
		 * @return
		 */
		public Long EndTime(long end_time) 
		{	
			if(end_time==1)
			{
				end_time=System.currentTimeMillis();
				return end_time;
			}
			else
				System.out.println("\n*********Invalid input********");
			return (long) 0; 
		}
		
		/**This method calculate elapsed time for stopwatch
		 * @param start_time store stopwatch start time
		 * @param end_time store time when we stop stopwatch
		 * @return
		 */
		public Long ElapsedTime(long start_time , long end_time)
		{
			long elapsed_time = end_time - start_time;
			return elapsed_time/1000;
		}	
		
	/****************************Tic Tac Toe***********************/
		
		char[][] gameboard = new char[3][3];
		public void initializeBoard()
		{
			for(int row = 0;row < 3;row++)
			{
				for(int col = 0;col<3;col++)
				{	
					gameboard[row][col] = ' ';
				}
			}
		}
		public void displayBoard()
		{
			//initializeBoard();
			for(int row = 0; row<gameboard.length;row++)
			{
				for(int col=0;col<gameboard[0].length;col++ )
				{
					System.out.print("  "+ gameboard[row][col]+"  ");
					if(col==0 || col==1)
					{
						System.out.print("|");
					}				
				}
				if(row==0 || row==1)				
					System.out.print("\n-----------------\n");			
			}
		}
		public void makeMove(char ch , int num)
		{
			if(	num == 1 )
			{
				System.out.println("Player..enter your position to mark ");
				System.out.println("Row : ");
				int i = scanner.nextInt();
				System.out.println("Column : ");
				int j = scanner.nextInt();
				if(gameboard[i][j] == ' ')
				{
					gameboard[i][j] = ch;				
				}
				else
				{
					System.out.println("Already Marked...!!!");
					makeMove( ch , num);
				}
			}
			else if( num == 0 )
			{						
				computerMove(ch);
			}
		}
		
		public char[][] computerMove(char ch)
		{
			for(int i = 0 ;i<3; i++)
			{	
				//rows
				if(gameboard[i][0]==gameboard[i][1] && gameboard[i][2] ==' ' && gameboard[i][0]!=' ')
				{
					gameboard[i][2] = ch;
					return gameboard;
				}
				if(gameboard[i][1]==gameboard[i][2] && gameboard[i][0] == ' ' && gameboard[i][1]!=' ') 				
				{
					gameboard[i][0] = ch ;
					return gameboard;
				}
				if(gameboard[i][0]== gameboard[i][2] && gameboard[i][1]==' ' && gameboard[i][1]!=' ')
				{
					gameboard[i][1] = ch ;
					return gameboard;
				}
				//Column
				if(gameboard[0][i]==gameboard[1][i] && gameboard[2][i] ==' ' && gameboard[1][i]!=' ')
				{
					gameboard[2][i] = ch;
					return gameboard;
				}
				if(gameboard[1][i]==gameboard[2][i] && gameboard[0][i] == ' ' && gameboard[1][i]!=' ') 				
				{
					gameboard[0][i] = ch ;
					return gameboard;
				}
				if(gameboard[0][i]== gameboard[2][i] && gameboard[1][i]==' ' && gameboard[2][i]!=' ')
				{
					gameboard[1][i] = ch ;
					return gameboard;
				}
			}
			
			//Cross
			if(gameboard[0][0]==gameboard[1][1] && gameboard[2][2] == ' ' && gameboard[1][1]!=' ') 				
			{
				gameboard[2][2] = ch ;
				return gameboard;
			}
			if(gameboard[1][1]==gameboard[2][2] && gameboard[0][0] == ' ' && gameboard[1][1]!=' ') 				
			{
				gameboard[0][0] = ch ;
				return gameboard;
			}
			if(gameboard[0][0]== gameboard[2][2] && gameboard[1][1]==' ' && gameboard[2][2]!=' ')
			{
				gameboard[1][1] = ch ;
				return gameboard;
			}
			
			
			if(gameboard[0][2]== gameboard[1][1] && gameboard[2][0]==' ' && gameboard[0][2]!=' ')
			{
				gameboard[2][0] = ch ;
				return gameboard;
			}		
			if(gameboard[1][1]==gameboard[2][0] && gameboard[0][2] == ' ' && gameboard[2][0]!=' ') 				
			{
				gameboard[0][2] = ch ;
				return gameboard;
			}
			if(gameboard[0][2]== gameboard[2][0] && gameboard[1][1]==' ' && gameboard[2][0]!=' ')
			{
				gameboard[1][1] = ch ;
				return gameboard;
			}
			
			Random random = new Random();
			int i = random.nextInt(3);
			int j = random.nextInt(3);
			if(gameboard[i][j] == ' ')
			{
				gameboard[i][j] = ch;				
			}
			else
			{
				makeMove(ch , 0);
			}
			return gameboard;
		}
		
		public boolean winORLose()
		{
			for(int i = 0 ;i<3; i++)
			{	
				if(gameboard[0][i]==gameboard[1][i] && gameboard[1][i]==gameboard[2][i] && gameboard[1][i]!=' ')
				{
					return true;
				}
				if(gameboard[i][0]==gameboard[i][1] && gameboard[i][1]==gameboard[i][2] && gameboard[i][1]!=' ')
				{
					return true;
				}
			}
			if((gameboard[0][0]==gameboard[1][1] && gameboard[1][1]==gameboard[2][2] &&  gameboard[1][1]!=' ') || 
					(gameboard[0][2]==gameboard[1][1] && gameboard[1][1]==gameboard[2][0] && gameboard[0][2]!=' '))
			{
				return true;
			}
			return false;
		}			
		
		
	/****************************Quadratic*************************/
		
		int root1_x ,root2_x;
		/**This method is used to calculate roots for
		 * quadratic equation
		 * @param a is user input to making quadratic equation
		 * @param b is user input to making quadratic equation
		 * @param c is user input to making quadratic equation
		 */
		public void CalculatingRoots(int a , int b , int c)
		{
			double delta =( b*b) - (4*a*c);
			root1_x=(int) ((-b+Math.sqrt(delta))/(2*a));
			root2_x=(int) ((-b-Math.sqrt(delta))/(2*a));
			System.out.println("X = "+root1_x);
			System.out.println("X = "+root2_x);
		}
	/************************Wind chill*******************************/
		
		/**
		 * @param t is temperature which is in  Fahrenheit
		 * @param v is speed  miles per hour
		 * @return effective wind chill temperature
		 */
		public void windChillCalculation(double t , double v)
		{
			if(t>50 || (v<3 || v>120))  //This is recursion..to allow user
			{							// to enter input again and again
				System.out.println("You have entered wrong input:");
				System.out.println("Enter T :=");
				t=scanner.nextInt();
				System.out.println("Enter V :=");
				v=scanner.nextInt();
				windChillCalculation(t, v);
			}
			else if(t <=50 && (v>=3 && v<=120))
			{
				long w = 0;
				double raiseToPower = Math.pow(v,0.16);
				w = (long) ((long)35.74 + 0.6215*t+ (0.4275*t-35.75)*raiseToPower);
				System.out.println("Wind chill is : "+w);
			}		
		}
		
	/************************Algorithm Programs*********************/	
		
	/****************************Anagram*****************************/
				
		/**This method check entered two string are anagram or not
		 * @param str1 store first string
		 * @param str2 store second string
		 * Now later it compare both strings are anagram or not 
		 */
		public void checkAnangram(String str3 , String str4 )
		{			
	        char array1[] = str3.toCharArray();      //convert string 
	        char array2[] = str4.toCharArray(); 	//in character array	        
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	        
	        if(Arrays.equals(array1, array2))   //check characters of both 
	        {									//array is same or not
	        	 
	        	 System.out.println("String is anangram");
	       	}
	       	else 
	       		 System.out.println("String is not anangram");
	      
	     }
	
	/***********************Prime Number(0-1000)*******************/
		
		/**This method print prime number from 0 to till the range
		 * whatever you want  
		 * @param range store number and till that it will print
		 * prime numbers
		 */
		public int[] printingPrimeNumber(int range) 
		{
			   boolean isPrime = true;
			   int count = 0;
			   int primeno[]=new int[range];		   
			   for (int i = 0; i <= range; i++)         
		       { 		  
		          for(int j=2; j<i ;j++)
		          {
		        	     if(i%j==0)
		             	 {
		             	 	isPrime=false;
		             	 	break;
		             	 }
		             	 else 	
		        	     	isPrime=true;
		          	}
		          	if(isPrime==true)
		        	  primeno[count++]=i;
		       }
			return primeno ;		     
		}
		
/************************PrimeAnangramPalindrome*********************/	
		
		/**This method check prime numbers are palindrome or not
		 * @param primenumber: store prime number which we have to check 
		 * whether it is palindrome or not
		 */
		static int reversenum = 0;
	    static int remainder=0;

	    public static void checkPalindrome(int[] primenumber) {

	        for (int i = 0; i < primenumber.length; i++) {
	            reversenum=0;
	            if (primenumber[i] > 0) {
	                int temp = primenumber[i];
	                while (temp > 0) 
	                {
	                    remainder = temp % 10;
	                    temp = temp / 10;
	                    reversenum = reversenum * 10 + remainder;
	                }
	                       temp=primenumber[i];
	                if (temp == reversenum) 
	                    System.out.print(reversenum + " ");                
	            }
	        }
	    }

		/**This method check that prime number is anagram or not
		 * @param primenumber:is prime numbers which we check that numbers are
		 * anangram or not
		 */
	    public static int[] checkAnagram(int[] primenumber)
	    {
	        System.out.println("\nThe prime number which are Anagram:");
	        int anagram = 0;
	        int[] anagramArray = new int[primenumber.length]; 
	        for (int  i = 0; i < primenumber.length; i++)
	        {
	            for (int j = 0; j < primenumber.length; j++)
	            {
	                 if(primenumber[i]>0 && primenumber[j]>0 && primenumber[i]!=primenumber[j])
	                 {     
		                 String string1 = Integer.toString(primenumber[i]);
		                 String string2 = Integer.toString(primenumber[j]);
		                 anagram = Utility.checkPrimeAnagram(string1, string2);
		                 if(anagram>0)
		                 {
		                	 anagramArray[i] = anagram;
		                	 //anagramArray[i]
		                 }
	                 }
	            }
	        }
			return anagramArray;				        
	    }
	    
	    private static int checkPrimeAnagram(String string1, String string2)
	    {
			int anagram =0 ;
			char[] ch1 = string1.toCharArray();
		    char[] ch2 = string2.toCharArray();
		    boolean result=false;
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    result = Arrays.equals(ch1,ch2);
		    if(result==true)
		    {
		    	anagram = Integer.parseInt(string1);
		    	//System.out.print(anagram+" ");
		    	return anagram;
		    }
			return anagram;		
	    }  		
	
		/**************************All sorting algo **************************/
		
		/**This method swap the elements is next number is greater than 
		 * previous number
		 * @param number is range that how elements you want to enter 
		 * @param array it store array elements
		 * @return 
		 */
		public static int[] bubbleInt(int nInt , int[] intArray)
		{
			
			int i,j,temp;
			for(i=0;i<nInt-1;i++)
			{
				for(j=0;j<nInt-i-1;j++)
				{
					if(intArray[j]>intArray[j+1])
					{
						//swapping
						temp=intArray[j];
						intArray[j]=intArray[j+1];
						intArray[j+1]=temp;
					}
				}
			}
			
			return intArray;
		}
		
		/** This method sort the strings in ascending order
		 * @param nString :store total how many strings are their in array 
		 * @param stringArray : store number of strings 
		 * @return :string array ,where sorted strings are stored
		 */
		public static String[] bubbleString(int nString,String[] stringArray)
		{	
			int i,j;
			String temp;
			for(i=0;i<nString-1;i++)
			{
				for(j=0;j<nString-i-1;j++)
				{
					if((stringArray[j]).compareTo(stringArray[j+1]) > 0)
					{
						//swapping
						temp=stringArray[j];
						stringArray[j]=stringArray[j+1];
						stringArray[j+1]=temp;
					}
				}
			}
			
			return stringArray;		
		}	
		
		/** This method find an element in sorted arrray
		 * @param bubbleArray : store sorted array elements 
		 * @param key : is an element which is to be search in array
		 * @return key that is searching element
		 */
		public static int binaryInt(int[] bubbleArray , int key)
		{ 
			//Initializing variables 
			int low=0;
			int high = bubbleArray.length-1; //sorted array length
			int mid = (low+high)/2;			//calculate middle position 
											//in array
			while(low <= high)
			{				
				if(bubbleArray[mid]<key)
				{
					low = mid+1;
				}
				else if(bubbleArray[mid]==key)
				{
					System.out.println("Element found at " +(mid+1)+ " location ");
					break;
				}
				else
					high = mid-1;
				if(low>high)
				{
					System.out.println("Number "+key+ " Not available in list ");
				}
			}
			return -1;			
		}
		/** this method search a string or word in sorted list 
		 * @param bubbleStringArray store sorted strings 
 		 * @param stringsearch is a string which is to be search
		 * @return searching element
		 */
		public static int binaryString(String[] bubbleStringArray , String stringsearch)
		{
			int first = 0;
			int last = bubbleStringArray.length;
			int mid = 0;
			while (first <= last) {
				mid = (first + last) / 2;

				if (bubbleStringArray[mid].compareTo(stringsearch) == 0) 
				{
					System.out.println(stringsearch + " is found at "+(mid+1)+ " location");
					break;
				} 
				else if (bubbleStringArray[mid].compareTo(stringsearch) < 0) 
				{
					first = mid + 1;
				} else 
				{
					last = mid - 1;
				}
			}
			if(bubbleStringArray[mid].compareTo(stringsearch)!=0)
			{
				System.out.println("String "+stringsearch+ " Not present in list");
			}
			return 1;
		}
		
	/**This method sort the data in ascending order by using insertion sort
	 * @param nInt: total number element given by user
	 * @param intArray : Array element entered by user
	 * @return sorted array
	 */
	public static int[] insertionInt(int nInt , int[] intArray)
	{
		int key;
		int j,i;
	    for (j = 1; j < intArray.length; j++) 
	    {
	    	key=intArray[j];      //store original in any temporary variable
	    	i=j-1;
	    	while(i>=0)
	    	{
	    		if((intArray[i])<key)
	    		{
	    			break;
	    		}
	    		intArray[i+1]=intArray[i];    //swapping
	    		i--;
	    	}
	    	intArray[i+1]=key;
	    }
		return intArray;
	}
	
	/**This method sort string data in ascending order using insertion sort
	 * @param nString store total number of string given by user
	 * @param stringArray store strings entered by user 
	 * @return sorted strings 
	 */
	public static String[] insertionString(int nString , String[] stringArray)
	{
		
		String key;
		int j,i;
	    for (j = 1; j < stringArray.length; j++) 
	    {
	    	key=stringArray[j];      //store original in any temporary variable
	    	i=j-1;
	    	while(i>=0)
	    	{
	    		if(stringArray[i].compareTo(key)<0)  //comparing 2 strings
	    		{
	    			break;
	    		}
	    		stringArray[i+1]=stringArray[i];    //swapping
	    		i--;
	    	}
	    	stringArray[i+1]=key;         
	    }
		return stringArray;         // sorted strings 
	}
		
	/****************************Binary Search****************************/
		
		 /**This method is used to search an element n-1
		 * @param low : store start element
		 * @param high : store end element
		 * @return 
		 */
		public static int search(int low, int high) 
		 {
			    boolean readBoolean = true;
		        if ((high - low) == 1) 
		        	return low;
		        int mid = (low +high) / 2; //finding mid in between
		        						   //low and high	
		        if (readBoolean==false) {
		        	System.out.println(mid+" High");
		        	return search(low, mid);
		        }
		        else
		        	System.out.println(mid+"is Low");
		        	return search(mid, high);
		 }
	/***************************Binary search file*************************/
		
		public static String[] readFiles(String file) throws Exception {
			File f = new File(file);
			
			Scanner scanner1 = new Scanner(f);
			int counter = 0;
			while (scanner1.hasNext()) {
				counter++;
				scanner1.next();
			}
			String[] array = new String[counter];
			Scanner scanner2 = new Scanner(f);
			System.out.println("File contents are :  ");
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner2.next();
				System.out.println(array[i]);
			}
			System.out.println();
			sortArray(array);
			return array;

		}

		public static void sortArray(String[] filearray) {

			Scanner scanner = new Scanner(System.in);
			Arrays.sort(filearray);
			System.out.println("File contents after sorting :  \n ");
			
			System.out.print(Arrays.toString(filearray));
			System.out.println(" \n ");
			System.out.println(" Enter the string you want to search : ");			
			String key = scanner.nextLine();
			int mid = binarySearchfile(filearray, key);
			if(mid!=1)
			System.out.println("Data found at " +( mid+1) + " position");

		}
		/** This method is used to search an element in file
		 * @param filearray store contents in file 
		 * @param key : is a string which you want to search in file
		 * @return search element 
		 */
		public static int binarySearchfile(String[] filearray, String key) 
		{
			int first = 0;
			int last = filearray.length;
			int mid = 0;
			while (first <= last) {
				mid = (first + last) / 2;

				if (filearray[mid].compareTo(key) == 0) {
					return mid;
				} else if (filearray[mid].compareTo(key) < 0) {
					first = mid + 1;
				} else {
					last = mid - 1;
				}
			}
			System.out.println("Data is not present in file !!!");
			return 1;
		}

		/**********************Bubble sort*********************/
		int i,j,temp;
		/**This method swap the elements is next number is greater than 
		 * previous number
		 * @param number is range that how elements you want to enter 
		 * @param array it store array elements
		 */
		public void Sorting(int number , int[] array)
		{
			for(i=0;i<number-1;i++)
			{
				for(j=0;j<number-i-1;j++)
				{
					if(array[j]>array[j+1])
					{
						//swapping
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
		}
			
		/** This method  print sorted elements in array
		 * @param number is total number of elements in array
		 * @param array store sorted array elements
		 */
		public void sortedArray(int number , int[] array)
		{
			System.out.println("Sorted array elements :");
			for(int i=0;i<number;i++)
			{
				System.out.print(array[i]+" "); //sorted array elements
			}
		}
		/**********************Insertion Sort(String)**************************/
		
		 /**This method sort the string given by user in ascending order
		 * @param num store total number of string
		 * @param str store strings which is to be sorted
		 */
		public void stringSort(int num , String[] str)
		{
		    String key;
			int j,i;
		    for (j = 1; j < str.length; j++) 
		    {
		    	key=str[j];      //store original in any temporary variable
		    	i=j-1;
		    	while(i>=0)
		    	{
		    		if(str[i].compareTo(key)<0)
		    		{
		    			break;
		    		}
		    		str[i+1]=str[i];    //swapping
		    		i--;
		    	}
		    	str[i+1]=key;
		    }
		}
/***************************Merge Sort Integer****************************/
		
		/**This method sort the integer number in ascending order
		 * @param array is array element to be sorted
		 * @param low is starting index
		 * @param mid is middle position between low and high
		 * @param high is end position of array
		 */
		void merge(int array[], int low, int mid, int high) 
	    { 
	        // Find sizes of two sub arrays to be merged 
	        int leftArrayRange = mid - low + 1; 
	        int  rightArrayRange = high - mid; 
	  
	        /* Create temporary arrays */
	        int L[] = new int [leftArrayRange]; 
	        int R[] = new int [rightArrayRange]; 
	  
	        /*Copy data to temporary arrays*/
	        for (int i=0; i<leftArrayRange; ++i) 
	            L[i] = array[low + i]; 
	        for (int j=0; j<rightArrayRange; ++j) 
	            R[j] = array[mid + 1+ j]; 	  
	  
	        /* Merge the temporary arrays */	  
	        // Initial indexes of first and second sub arrays 
	        
	        int i = 0, j = 0; 
	  
	        // Initial index of merged sub array 
	        int k = low; 
	        while (i < leftArrayRange && j < rightArrayRange) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                array[k] =  L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                array[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < leftArrayRange) 
	        { 
	            array[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < rightArrayRange) 
	        { 
	            array[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	    public void sort(int array[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            // Find the middle point 
	            int m = (low+high)/2; 
	  
	            // Sort first and second halves 
	            sort(array, low, m); 
	            sort(array , m+1, high); 
	  
	            // Merge the sorted halves 
	            merge(array, low, m, high); 
	        } 
	    } 
	    public static void printArray(int array[]) 
	    { 
	        int n = array.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(array[i] + " "); 
	        System.out.println(); 
	    }

	/**********************Merge sort String****************************/
	    
	    void merge(String[] array, int low, int mid, int high) 
	    { 
	        // Find sizes of two sub arrays to be merged 
	        int leftArrayRange = mid - low + 1; 
	        int  rightArrayRange = high - mid; 
	  
	        /* Create temporary arrays */
	        String L[] = new String [leftArrayRange]; 
	        String R[] = new String [rightArrayRange]; 
	  
	        /*Copy data to temporary arrays*/
	        for (int i=0; i<leftArrayRange; ++i) 
	            L[i] = array[low + i]; 
	        for (int j=0; j<rightArrayRange; ++j) 
	            R[j] = array[mid + 1+ j]; 	  
	  
	        /* Merge the temporary arrays */	  
	        // Initial indexes of first and second sub arrays 
	        
	        int i = 0, j = 0; 
	  
	        // Initial index of merged sub array 
	        int k = low; 
	        while (i < leftArrayRange && j < rightArrayRange) 
	        { 
	            if(L[i].compareTo(R[j])<=0)  //(L[i] <= R[j]) 
	            { 
	                array[k] =  L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                array[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 	  
	        /* Copy remaining elements of L[] if any */
	        while (i < leftArrayRange) 
	        { 
	            array[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < rightArrayRange) 
	        { 
	            array[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	   
	    public void sort(String[] array, int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            // Find the middle position 
	            int m = (low+high)/2; 
	  
	            // Sort first and second halves 
	            sort(array, low, m); 
	            sort(array , m+1, high); 
	  
	            // Merge the sorted halves 
	            merge(array, low, m, high); 
	        } 
	    } 
	    /**This method print sorted array
	     * @param array is sorted array elements 
	     */
	    public static void printStringArray(String[] array) 
	    { 
	        int n = array.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(array[i] + " "); 
	        System.out.println(); 
	    }
	    
	    
	/***********************Temperature Conversion **********************/    
	    
	    /**This method convert temperature from celsius to fahrenheit
		 * and from fahrenheit to celsius
		 * @param temperature
		 */
		public static void temperatureConversion(int temperature) 
		{
			// TODO Auto-generated method stub
			System.out.println("Fahrenheit to celsius conversion : ");
			float celsius = ((temperature-32) * 5)/9 ;
			System.out.println("Temperature in celsius : "+celsius);
			
			System.out.println("Celsius to Fahrenheit conversion  :");
			float fahrenheit = (temperature *9/5+32);
			System.out.println("Temperature in fahrenheit : "+fahrenheit );
			
		} 	
	/************************Sqrt using newtons method******************/
		
		/**This method is used to find square root of a nonnegative number
		 * @param c is user input
		 */
		public static void sqrtNewtons(double c)
		{
			double epsilon = 1e-15;
			double t = c;			
			while(Math.abs(t - c/t) > epsilon*t)
			{
				t=(c/t + t)/2.0;
			}
			System.out.println(" "+t);
		}
		
	/*****************************Week Day*******************************/
		
		/**This method find day of any entered date 
		 * @param m store month given by user
		 * @param d store date given by user
		 * @param y is year given by user
		 * @return day present on that day
		 */
		public static int dayOfWeek(int m, int d, int y) 
		{			
			// TODO Auto-generated method stub
			int y0=y-(14-m)/12;;
			int x = y0+(y0/4)-y0/100+y0/400;
			int m0 = m+12*((14-m)/12)-2;
			int d0 = (d+x+31*m0/12)%7;
			return d0;
		}	
		
     /*****************************ToBinary*******************************/
		
		/**This method convert decimal number to binary number without
		 * using toBinary() function
		 * @param decimal is decimal number given by user
		 */
		public static void toBinary(int decimal)
		{
			Scanner scanner = new Scanner(System.in);
			int temp= decimal;
			int[] remainder = new int[100];
			int i=0;
			while(decimal > 0)
			{
				remainder[i] =( decimal % 2);
				decimal = decimal / 2 ;
				i++;
			}
			for(int j = i-1 ; j>=0 ; j--)
			{
				System.out.print(remainder[j]);
			}
		}
		
	/*********************Binary Nibble *******************************/
		
		public static int swapNibbles(int decimal) 
		{ 
		    return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4); 
		} 
		public void isPowerTwo(int decimal) //check enteres number is 
											//power of two
		{
			if(decimal%2==0)
			{
				System.out.println("\nNumber is power of two ");
			}
			else
				System.out.println(decimal+" is  not power of two ");
		}	
		
	/********************Data Structure programs************************/
	
	/************************Unordered Linked List *********************/	
		
		public void unorderedList() throws Exception
		{
			BufferedReader br = new BufferedReader(new FileReader("binarytextfile.txt"));
			UnorderedLinkedList list = new UnorderedLinkedList();
			Scanner scanner = new Scanner(System.in);
			String str="";
			String[] words = null;
			while((str=br.readLine())!=null)
			{
				words=str.split(" ");			
			}
			for(int i=0;i<words.length;i++)
			{
				list.insert(words[i]);
			}
			list.show();
			System.out.println("Enter data to be search : ");
			String search = scanner.next();
			list.search(search);
			list.show();
		}		
		
		/**********************Orderedlist  ****************************/
		
		public void orderedList() throws Exception
		{
			OrderedLinkedList list = new OrderedLinkedList();		
			BufferedReader br = new BufferedReader(new FileReader("OrderedTextFile.txt"));
			String str="";
			String[] words = null;
			while((str=br.readLine())!=null)
			{
				words=str.split(" ");			
			}
			System.out.println("File contents :");
			for(int i=0;i<words.length;i++)
			{
				System.out.print(words[i]+"  ");
			}	
			int filelength = words.length; 
			
			System.out.println("\nInsert Sorted data in list ");
			for(int i=0;i<filelength;i++)
			{
				list.sortedInsert(words[i]);
			}
			list.show();
		}
		
	/*******************Bank Cash Counter using Queue*******************/
		
		/**This method check how many peoples are standing in queue and ask  
		 * them that what they wants to do. depend on that handle bank 
		 * balanced using linked list 
		 */
		public void handleBankCashCounter()
		{
			BankQueue queue = new BankQueue();
			System.out.println("Enter Bank Balanced : ");
			int balanced = scanner.nextInt();
			System.out.println("Enter how many peoples are standing in bank queue : ");
			int n=scanner.nextInt();
			for(int i = 1 ; i <= n ; i++)
			{
				queue.enqueue(i);
			}
			queue.show();
			System.out.println("\n\n*********Bank Cash Counter*********");
			for(int i = 1 ; i <= n ; i++)
			{
				System.out.println("\nCustomer No :\t"+i);
				System.out.println("\nWhat you wants to do ?? \n1. Cash Deposit\n2. Cash Withdrawl ");
				System.out.println("Enter your choice : ");
				int choice = scanner.nextInt();
				if(choice == 1)
				{
					System.out.println("Enter amount to deposit in ur account : ");
					int deposit = scanner.nextInt();
					balanced = balanced+deposit;
					queue.dequeue();
					queue.show();
				}
				else if(choice == 2)
				{
					System.out.println("Enter amount to withdraw from ur account : ");
					int withdraw = scanner.nextInt();
						
					if(withdraw > balanced )
					{
						System.out.println("Insufficient amount !!!\n");
						break;
					}
					else
					{
						balanced = balanced - withdraw;
					}					
					queue.dequeue();
					queue.show();
				}
			}
			System.out.println("Remainig balanced is: "+balanced);
		}
	
	/***********************Stack for Parenthesis***********************/
		
		/**This method entered any expression and check it is balanced or 
		 * not by checking equal parenthesis is present in the list or not 
		 */
		public void expressionBallenced()
		{
			System.out.println("Arithmetic expression : ");
			String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
			System.out.println(expression);
			ParenthesisStackMethods stack = new ParenthesisStackMethods(expression);	
			//utility.inputString();
			for(int i=0 ; i<expression.length();i++)
			{
				char ch = expression.charAt(i);
				
				if(ch == '(')
				{
					stack.push(expression);
				}
				if(ch == ')')
				{
					stack.pop();
				}
			}
			if(stack.isEmpty())
			{
				System.out.println("Expression is balanced ");
			}
			else
				System.out.println("Not balanced ");
		}
		
	/*****************************Palindrome Deque**********************/
		
		/**This method check string is palindrome or not by using doubly 
		 * linked list 
		 */
		public void deque()
		{
			Scanner scanner = new Scanner(System.in);
			PalindromeDeque deque = new  PalindromeDeque();
			System.out.println("Enter String to whether it is palindrome or not : ");
			String string = scanner.next();
			char[] rear = new char[string.length()];
			char[] character = string.toCharArray();
			
			for(int i= 0; i<string.length();i++)
			{
				deque.insertInDeque(character[i]);
			}
			int length = deque.length;
			for(int i=0;i<length;i++)
			{
				rear[i] = deque.removeAtRear();
			}
			
			String compareString = new String(rear);
			if(string.equalsIgnoreCase(compareString))
			{
				System.out.println("String "+string+" & "+compareString+" is palindrome ");
			}
			else
			{
				System.out.println("String "+string+" & "+compareString+" is not palindrome ");
			}
		}
		
    /**********************Binary slots factorial*********************/
		
		public int factorial(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact = fact*i;
			}
			//System.out.println("Factorial : "+fact);
			return fact;
		}
	
	/****************************Calender**********************/
		
		
		/**This method check that entered year is leap 
		 * year or not
		 * 
		 */
		public boolean leapforCalender(int yearnumber)
		{
			boolean isLeapYear = true;
			if(String.valueOf(yearnumber).length()<4)
			{
				System.out.println("Please enter 4 digit number :");
				yearnumber=scanner.nextInt();
				leap_year(yearnumber); 
			}
			
			else if(yearnumber%4==0)
			{
				//if yr no. is divisible by 4 then check by 100
				if(yearnumber%100==0)
				{
					//now checking no. is divisible by 400 or not
					if(yearnumber%400==0)
					{
						//if no. divisible by 4,100 and 400 ie. leap year
						return true;
					}
					else
						return false;
				}
				//if no is divisible by 4 and not by 100 ,that is leap yr
				else
					return true;
			}
			else
				return false;
			return isLeapYear;
		}
		public void printCalender(int month , int year)
		{
			String[] Month = {"January","February", "March","April", "May", "June","July", "August", "September",
		            	"October", "November", "December"};
			int[] noOfDays  = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			int result = Utility.dayOfWeek(month, 1, year);
			System.out.println("   "+Month[month-1]+" "+year);
			if( month == 2 && leapforCalender(year) )
			{
				noOfDays[2] = 29;
			}									
			System.out.println("S  M  Tu W  Th F  Sa  ");
	 		for(int i = 0 ;i<result ; i++)
	 		{
	 			System.out.print("   ");
	 		}
	 		for(int i=1;i<=noOfDays[month];i++)
	 		{
	 			if(i<=9)
	 			{
	 				System.out.print(i+"  ");
	 			}
	 			else if(i>9)
	 			{
	 				System.out.print(i+" ");
	 			}
	 			if((result+i)%7==0)
	 				System.out.println();
	 		}
	 		
		}	
	
	/********************PrimeNumber in 2d array ***********************/
		
		public void twoDPrime(int[] primenumber)
		{
			int row = 10 ,column = 27;
	 		int[][] array = new int[row][column];
	 		int temp = 100 , k=0;
	 		for(int i = 0 ;i<row; i++)
	 		{
	 			for(int j= 0 ; j<column ; j++)
	 			{
	 				if(k<primenumber.length )
					{
	 					if(primenumber[k] <= temp )
	 					{
	 						array[i][j] = primenumber[k];
	 						k = k+1;
	 					}
	 				} 
	 			} 	
	 			temp = temp + 100;
	 		}
	 		
	 		System.out.println("");
	 		for(int i = 0 ;i<row ; i++)
	 		{
	 			for(int j= 0 ; j<column ; j++)
	 			{
	 				if(primenumber[j]>0)
	 				{
	 					if(array[i][j] != 0)
	 					{
	 						System.out.print(array[i][j]+"\t");
	 					}
	 				}
	 			}
	 			System.out.println();
	 		}
		}	
		
	/******************Prime Anagram 2D*****************************/
		
		
		 public void twoDPrimeAnagram(int[] anagram)
			{
				int row = 20 ,column = 26;
		 		int[][] anagramArray = new int[row][column];
		 		int temp = 100 , k=0;
		 		for(int i = 0 ;i<row; i++)
		 		{
		 			for(int j= 0 ; j<column ; j++)
		 			{
		 				if(k<anagram.length )
						{
		 					if(anagram[k] <= temp )
		 					{
		 						anagramArray[i][j] = anagram[k];
		 						k = k+1;
		 					}
		 				} 
		 			} 	
		 			temp = temp + 100;
		 		}
		 		
		 		System.out.println("");
		 		for(int i = 0 ;i<row ; i++)
		 		{
		 			for(int j= 0 ; j<column ; j++)
		 			{
		 				if(anagram[j]>0)
		 				{
		 					if(anagramArray[i][j] != 0)
		 					{
		 						System.out.print(anagramArray[i][j]+"\t");
		 					}
		 				}
		 			}
		 			System.out.println();
		 		}
			}	 
		
		 /****************Prime anagram Queue***********************/
		  
		 public void primeAnagramQueue()
		 {
			 PrimeAnagramQueue queue = new PrimeAnagramQueue();
			 int[] primeNumber = printingPrimeNumber(1000);
				int[] anagram = Utility.checkAnagram(primeNumber);
				for(int i = 0 ; i<anagram.length;i++)
				{
					if(anagram[i]>0)
					{
						queue.insertInDeque(anagram[i]);
					}
				}
				queue.displayFront();
				int[] removed = new int[queue.length];
				System.out.println("Remove elements from queue(linked list) are: ");
				for(int i =0; i<queue.length;i++)
				{
					removed[i] = queue.removeAtFront();
					//queue.displayFront();
				}
				for(int i =0; i<removed.length;i++)
				{
					System.out.print(removed[i] +" ");
				}		
		 } 
		 
	/**********************Prime Anagram Stack************************/
		 
		 public void primeAnagramStack()
		 {
			int[] primeNumber = printingPrimeNumber(1000);
			int[] anagram = Utility.checkAnagram(primeNumber);
			PrimeAnagramStackMethod stack = new PrimeAnagramStackMethod();
			System.out.println("Prime anagram number After push into stack :");
			for(int i = 0;i<anagram.length;i++)
			{
				if(anagram[i]>0)
				{				
					System.out.print(stack.push(anagram[i])+" ");
				}
			}		
			
			System.out.println("\nTop = "+stack.peek());
			int[] stackPop = new int[anagram.length];
			System.out.println("\nPrime anagram number After pop from stack :");
			try
			{
				for(int  i=0 ; i<stackPop.length;i++)
				{
					stackPop[i] = stack.pop();
					System.out.print(stackPop[i]+" ");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		 }
}

