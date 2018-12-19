package com.bridgelabz.designpattern;

public class SocketForAdapterPattern
{
	public VoltForAdapterPattern getVolt()
	{
		return new VoltForAdapterPattern(120);
	}
}
