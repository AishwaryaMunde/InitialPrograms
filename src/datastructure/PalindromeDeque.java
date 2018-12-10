package datastructure;

public class PalindromeDeque 
{
	PalindromeNode front ;
	PalindromeNode rear ;
	public int length = 0;
	
	public PalindromeDeque() 
	{
		// TODO Auto-generated constructor stub
		 front = null ;
		 rear = null ;
	}

	public void insertInDeque(char ch)
	{
		PalindromeNode node1 = new PalindromeNode(ch, null , null);		
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
		PalindromeNode temp = front;
		while(temp != null)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public void displayRear()
	{
		if(rear == null)
		{
			return;
		}
		PalindromeNode temp = rear;
		while(temp != null)
		{
			
			System.out.print(temp.data+" --> ");
			temp = temp.previous;
		}
		System.out.println("null");		
	}	
	public Character removeAtRear()
	{
		if(length == 0 )
		{
			System.out.println("No such elements ");
		}
		PalindromeNode node = rear ;
		char removedChracter = node.data; 
		if(front == rear)
		{
			front =null;
		}
		else
			rear.previous.next = null;
		rear = rear.previous;
		node.previous = null;
		length--;
		return removedChracter;		
	}
}
