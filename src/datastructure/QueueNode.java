package datastructure;


public class QueueNode
{
	public int data;
	public QueueNode next;	
	public QueueNode previous ;
	public QueueNode(int data , QueueNode next ,QueueNode previous) 
	{
		super();
		this.data = data;
		this.next = next;
		this.previous = previous ;
	}	
}
