package com.bridgelabz.datastructure;

public class OrderedListSort 
{
	Node head;
	public void sortedInsert(String words) 
    { 
		Node new_node = new Node(words, null);
        Node current;      
        if (head == null || ((head.data).compareTo(new_node.data)) >=0 ) 
        { 
           new_node.next = head; 
           head = new_node; 
        } 
        else 
        {
        	current = head;  
            while (current.next != null && (current.next.data).compareTo(new_node.data)<0) 
                  current = current.next; 
  
            new_node.next = current.next; 
            current.next = new_node; 
         } 
     } 
	
	public void show() 
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data+ " --> ");
			node = node.next;
		}
		System.out.println(node.data);
	}	

}
