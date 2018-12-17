package com.bridgelabz.datastructure;

public class PalindromeNode
{
	public char data;
	public PalindromeNode next;			
	public PalindromeNode previous;
	public PalindromeNode(char ch , PalindromeNode next , PalindromeNode previous) 
	{
		super();
		this.data = ch;
		this.next = next;
		this.previous = previous;		
	}	
}
