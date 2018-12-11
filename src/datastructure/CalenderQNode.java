package datastructure;

public class CalenderQNode
{
	public String data;
	public CalenderQNode next;			
	public CalenderQNode previous;
	public CalenderQNode(String ch , CalenderQNode next , CalenderQNode previous) 
	{
		super();
		this.data = ch;
		this.next = next;
		this.previous = previous;		
	}	
}
