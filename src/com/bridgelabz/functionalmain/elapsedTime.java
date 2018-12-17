package com.bridgelabz.functionalmain;
import com.bridgelabz.utility.Utility;
public class elapsedTime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		long elapsed_time;
		
		Utility utility = new Utility();
		System.out.println("\nPress 0 to start time");
		long start_time=utility.inputInteger();
		start_time=utility.StartTime(start_time);
		System.out.println(start_time);
		System.out.println("\nPress 1 to End time");
		long end_time=utility.inputInteger();
		end_time=utility.EndTime(end_time);
		System.out.println(end_time);
		
		elapsed_time=utility.ElapsedTime(start_time , end_time);
		System.out.println("\nElapsed time for stop watch :"+elapsed_time);
	}
}
