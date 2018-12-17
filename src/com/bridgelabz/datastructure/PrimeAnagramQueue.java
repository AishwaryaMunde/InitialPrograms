package com.bridgelabz.datastructure;

public class PrimeAnagramQueue
{
	PrimeAnagramQueueNode front ;
	PrimeAnagramQueueNode rear;
	public int length = 0;
	
	public PrimeAnagramQueue() 
	{
		// TODO Auto-generated constructor stub
		 front = null ;
		 rear = null ;
	}
	public void insertInDeque(int anagram)
	{
		PrimeAnagramQueueNode node1 = new PrimeAnagramQueueNode(anagram, null , null);		
		if(length == 0)
		{
			front = node1 ;
		}
		else 
		{
			rear.next= node1;
		}
		node1.previous = rear ; 
		rear = node1;
		length++;
	}
	public void displayFront()
	{
		if(front == null)
			return;
		PrimeAnagramQueueNode temp = front;
		while(temp != null)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public int removeAtFront()
	{
		PrimeAnagramQueueNode node1 ;
		node1 = front;
		int removedFront = front.data;
		if(front == null)
		{
			System.out.println("Empty queue : ");
		}
		else
		{
			front = node1.next;
		}
		return removedFront;
	}
}
