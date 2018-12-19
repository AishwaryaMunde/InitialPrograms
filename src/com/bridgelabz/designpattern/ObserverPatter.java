package com.bridgelabz.designpattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatter 
{
	public static void main(String[] args) 
	{
		Subscriber subscriber1 = new Subscriber();
		subscriber1.setCustomername("Aishwarya");
		Subscriber subscriber2 = new Subscriber();
		subscriber2.setCustomername("Karuna");
		
		MyTopic topic = new MyTopic();
		topic.setProductname("IOT");
		topic.setAvailable(false);
		
		topic.registeredObserver(subscriber1);
		topic.registeredObserver(subscriber2);
		topic.setAvailable(true);
	} 

}

interface Observer
{
	public void update(String productName);
}

interface Subject
{
	public void registeredObserver(Observer observer);
	public void notifyObserver();
}

class Subscriber implements Observer
{
	private String customername;
	private Subject subject;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}	
	
	@Override
	public void update(String productName) 
	{
		System.out.println("Hello "+customername+" ,"+productName+" is now available");		
	}	
}
class MyTopic implements Subject
{
	private String productname;
	private boolean isAvailable;
	List<Observer> list = new ArrayList<Observer>();	

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if(isAvailable == true)
			notifyObserver();
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	@Override
	public void registeredObserver(Observer observer) {
		list.add(observer);
		
	}

	@Override
	public void notifyObserver() 
	{
		System.out.println("Notify all subscribers whos regidtered for that topic ");
		for(Observer observer : list)
		{
			observer.update(productname);
		}
		//list.notify();		
	}
	
}
