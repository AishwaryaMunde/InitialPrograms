package com.bridgelabz.designpattern;

public class FactoryPattern 
{
	public static void main(String[] args) 
	{
		FactoryALL all = new FactoryALL();
		Computer computer = all.getInstance(" ");
		computer.display();
		Computer computer1 = all.getInstance("Server");
		computer1.display();
		Computer computer2 = all.getInstance("Computer Factory");
		computer2.display();
	}

}
