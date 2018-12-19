package com.bridgelabz.designpattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorDesignPattern 
{
	public static void main(String[] args) 
	{
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Aishu");
		User user2 = new UserImpl(mediator, "Karuna");
		mediator.addUser(user1);
		mediator.addUser(user2);
		user2.send("Hii user1");
	}
}
interface ChatMediator
{
	public void sendMessage(String msg , User user);
	void addUser(User user);
}
abstract class User
{
	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator mediator, String name) 
	{
		super();
		this.mediator = mediator;
		this.name = name;
	}
	public abstract void send(String msg);
	public abstract void receive(String msg); 
}
class ChatMediatorImpl implements ChatMediator
{
	private List<User> list;
	public ChatMediatorImpl() {
		this.list = new ArrayList<>();
	}
	@Override
	public void sendMessage(String msg, User user) {
		for(User u : list)
		{
			if(u != user)
				u.receive(msg);
		}		
	}	
	@Override	
	public void addUser(User user) {
		this.list.add(user);
		
	}	
}
class UserImpl extends User
{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}
	public void send(String msg)
	{
		System.out.println(this.name+" : sending message = "+msg);
		mediator.sendMessage(msg, this);
	}
	public void receive(String msg)
	{
		System.out.println(this.name+" : received message = "+msg);
	}
}


