package com.bridgelabz.algomain;

import com.bridgelabz.utility.Utility;

public class AllSortAlgo
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int ch , starttime , stoptime  , elapsedtime ;
		System.out.println("Enter total no. of element : ");
		int nInt =utility.inputInteger();//utility.inputInteger();
		int[] intArray = new int[nInt];
		System.out.println("Enter array elements : ");
		for(int i=0 ; i< nInt ; i++)
		{
			intArray[i] =utility.inputInteger();// utility.inputInteger();
		}
		System.out.println("Enter total how many strings you wants to enter : ");
		int nString =utility.inputInteger();//scanner.nextInt();
		String[] stringArray = new String[nString];

		System.out.println("Enter Strings : ");
		for(int i=0 ; i< nString ; i++)
		{
			stringArray[i] = utility.inputString();//scanner.next();
		}
		int[] bubbleIntArray= new int[nInt];
		String[] bubbleStringArray = new String[nString];
		do
		{			
			System.out.println(" Enter you choice ");
			System.out.println("1. Bubble Sort (Int) ");
			System.out.println("2. Binary Search (Int) ");
			System.out.println("3. Bubble Sort (String) :");
			System.out.println("4. Binary Search (String) ");
			System.out.println("5. Insertion Sort (Int) ");
			System.out.println("6. Insertion Sort (String) ");
			ch = utility.inputInteger();
			switch(ch)
			{
			case 1 : 
				starttime=(int) System.currentTimeMillis();
				System.out.println("Start time of bubble int : "+starttime+"\n");
				System.out.println("/*******bubble Int***********/");					
				System.out.println("\nSorted array elements :");
				bubbleIntArray= Utility.bubbleInt(nInt, intArray);
				for(int i =0 ;  i< bubbleIntArray.length;i++ )
				{
					System.out.println(bubbleIntArray[i]);
				}
				stoptime = (int) System.currentTimeMillis();
				System.out.println("Stop time of bubble int : "+stoptime+"\n");
				elapsedtime = (stoptime-starttime);
				System.out.println("Elapsed time for bubbleInt : "+elapsedtime +"\n");
				
				break;
			case 2 : 
				starttime=(int) System.currentTimeMillis();
				System.out.println("Start time of binary int : "+starttime+"\n");
				System.out.println("/*******binaryInt **********/");				
				System.out.println("\nEnter the element which you want to search : ");
				int key = utility.inputInteger();
				Utility.binaryInt(bubbleIntArray, key);
				stoptime = (int) System.currentTimeMillis();
				System.out.println("Stop time of binary int : "+stoptime+"\n");
				elapsedtime = (stoptime-starttime);
				System.out.println("Elapsed time for binaryInt : "+elapsedtime +"\n");

				break;
			case 3 : 
				starttime=(int) System.currentTimeMillis();
				System.out.println("Start time of bubble String : "+starttime+"\n");
				System.out.println("/********bubble String ********");			
				bubbleStringArray = Utility.bubbleString(nString, stringArray);
				System.out.println("\nSorted array elements :");
				for(int i=0;i<bubbleStringArray.length;i++)
				{
					System.out.print(bubbleStringArray[i]+" "); //sorted array elements
				}	
				stoptime = (int) System.currentTimeMillis();
				System.out.println("\nStop time of bubble String : "+stoptime+"\n");
				elapsedtime = (stoptime-starttime);
				System.out.println("Elapsed time for bubble string : "+elapsedtime +"\n");

				break;
			case 4 : 
				starttime=(int) System.currentTimeMillis();
				System.out.println("Start time of binary string : "+starttime+"\n");
				System.out.println("*********Binary String******");
				System.out.println("\nEnter string  which is to be search ");
				String stringsearch =  utility.inputString();
				Utility.binaryString(bubbleStringArray, stringsearch);
				stoptime = (int) System.currentTimeMillis();
				System.out.println("\nStop time of binary string : "+stoptime+"\n");
				elapsedtime = (stoptime-starttime);
				System.out.println("Elapsed time for binary string : "+elapsedtime+"\n" );

				break;
			case 5 :
				starttime=(int) System.currentTimeMillis();
				System.out.println("Start time of insertion int : "+starttime+"\n");
				System.out.println("******Insertion Int*******");
				int[] insertionIntArray= Utility.insertionInt(nInt, intArray);
				System.out.println("\nSorted array elements :");
				for(int i =0 ;  i< insertionIntArray.length;i++ )
				{
					System.out.println(insertionIntArray[i]);
				}
				stoptime = (int) System.currentTimeMillis();
				System.out.println("Stop time of insertion int : "+stoptime+"\n");
				elapsedtime = (stoptime-starttime);
				System.out.println("Elapsed time for insertion Int : "+elapsedtime+"\n" );

				break;
			case 6 : 
				starttime=(int) System.currentTimeMillis();
				System.out.println("Start time of insertion String : "+starttime+"\n");
				System.out.println("*******Insertion String*********");				
				String[] insertionString = Utility.insertionString(nString, stringArray);
				System.out.println("Sorted strings are  :");
				for(int i =0 ;i<insertionString.length ; i++)
				{
					System.out.print(insertionString[i]+"  \n");
				}
				stoptime = (int) System.currentTimeMillis();
				System.out.println("Stop time of insertion string : "+stoptime+"\n");
				elapsedtime = (stoptime-starttime);
				System.out.println("Elapsed time for insertion string : "+elapsedtime +"\n");

				break;
			default :
				System.out.println("You have entered invalid choice : ");
				break ;
			}
		}while(ch<=6);
	}
}
