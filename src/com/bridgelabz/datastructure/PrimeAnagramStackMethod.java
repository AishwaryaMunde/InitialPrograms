package com.bridgelabz.datastructure;

import java.util.EmptyStackException;

public class PrimeAnagramStackMethod
{
	int length ;
	IntNode top;
	//int[] array;
	public PrimeAnagramStackMethod()
	{
		length = 0;
		top = null;
	}
	
	public void show() 
	{
		IntNode node = top;
		while(node.next!=null)
		{
			System.out.print(node.data+ " --> ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	public int push(int anagram) 
	{
		IntNode node = new IntNode(anagram, null);
		node.next = top;
		top = node;
		length++;
		return node.data;
	}

	public int peek()
	{
		if(isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
	public boolean isEmpty() 
	{
		if(length == 0)
		{
			return true;
		}
		return false;
	}

	public int pop() 
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
}
