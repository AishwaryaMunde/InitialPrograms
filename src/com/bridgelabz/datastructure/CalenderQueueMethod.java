package com.bridgelabz.datastructure;

public class CalenderQueueMethod
{
	CalenderQNode front ;
	CalenderQNode rear ;
	int length = 0;
	
	public CalenderQueueMethod() 
	{
		// TODO Auto-generated constructor stub
		 front = null ;
		 rear = null ;
	}

	public void insertInDeque(String ch)
	{
		CalenderQNode node1 = new CalenderQNode(ch, null, null);		
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
		CalenderQNode temp = front;
		while(temp != null)
		{
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		
	}
}
