package com.bridgelabz.designpattern;

public class PrototypePattern 
{
	public static void main(String[] args) throws Exception
	{
		BookShopForPrototype book = new BookShopForPrototype();
		book.setShopname("Novelty");
		book.loadData();
		book.getList().remove(2);

	
		BookShopForPrototype book1 = (BookShopForPrototype)book.clone();
		book1.setShopname("Novelty");
		
		book.getList().remove(2);

		System.out.println(book);
		System.out.println(book1);
	}
}
