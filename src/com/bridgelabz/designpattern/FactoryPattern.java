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

interface Computer 
{
	void display();
}
class ComputerFactory implements Computer
{
	public void display()
	{
		System.out.println("This is computer factory");
	}
}

class Server implements Computer
{
	@Override
	public void display() {
		System.out.println("This is server class");		
	}	
}

class PC implements Computer 
{
	@Override
	public void display() {
		System.out.println("This is PC Class..!!");		
	}	
}

class FactoryALL 
{
	public Computer getInstance(String str)
	{
		if(str.equals("Computer Factory"))
			return new ComputerFactory();
		else if(str.equals("Server"))
			return new Server();
		else
			return new PC();
	}
}
