package com.bridgelabz.designpattern;

import java.util.ArrayList;
import java.util.List;

public class BookShopForPrototype implements Cloneable
{
	private String shopname;
	List<BookForPrototype> list = new ArrayList<>();
	@Override
	protected BookShopForPrototype clone()
	{
		BookShopForPrototype shop = new BookShopForPrototype();
		for(BookForPrototype book : this.getList())
		{
			shop.getList().add(book);
		}
		return shop;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<BookForPrototype> getList() {
		return list;
	}
	public void setList(List<BookForPrototype> list) {
		this.list = list;
	}
	public void loadData()
	{
		for(int i=0;i<5;i++)
		{
			BookForPrototype book = new BookForPrototype();
			book.setBookid(i);
			book.setBookname("Book "+i);
			getList().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShopForPrototype [shopname=" + shopname + ", list=" + list + "]";
	}
}
