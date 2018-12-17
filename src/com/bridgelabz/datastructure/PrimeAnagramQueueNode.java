package com.bridgelabz.datastructure;

public class PrimeAnagramQueueNode 
{
	public int data;
	public PrimeAnagramQueueNode next;			
	public PrimeAnagramQueueNode previous;
	public PrimeAnagramQueueNode(int data , PrimeAnagramQueueNode next , PrimeAnagramQueueNode previous) 
	{
		super();
		this.data = data;
		this.next = next;
		this.previous = previous;		
	}	
}
