package datastructure;

public class BankQueue
{
	QueueNode front ;
	QueueNode rear ;
	public BankQueue()
	{
		this.front = null;
		this.rear = null;
	}
	int length = 0;
	public void enqueue(int n) 
	{
		// TODO Auto-generated method stub		
		QueueNode temp = new QueueNode(n, null, null);
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
		QueueNode withdrawl ;
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
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void show()
	{
		QueueNode temp ;
		temp = front;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
	}
}
