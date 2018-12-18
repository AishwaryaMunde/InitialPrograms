package com.bridgelabz.designpattern;

public class FactoryALL 
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
