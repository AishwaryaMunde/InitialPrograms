package com.bridgelabz.objectoriented;

public class DeckOfCardsQLL
{
	Node front ;
	Node rear ;
	public DeckOfCardsQLL()
	{
		this.front = null;
		this.rear = null;
	}
	int length = 0;
	public void enqueue(String n) 
	{
		// TODO Auto-generated method stub		
		Node temp = new Node(n, null);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next = temp;
		}
		rear = temp ; 
		length++ ;
	}
	
	public void dequeue() 
	{
		// TODO Auto-generated method stub		
		Node withdrawl ;
		if(isEmpty())
		{
			System.out.println("No elements in queue !!");
		}
		else
		{
			withdrawl = front ;
			front = withdrawl.next;
		}		
	}
	
	public String frontElement()
	{
		return front.data;		
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void show()
	{
		Node temp ;
		temp = front;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
