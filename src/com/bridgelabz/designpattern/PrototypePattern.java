package com.bridgelabz.designpattern;

import java.util.ArrayList;
import java.util.List;

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
class BookShopForPrototype implements Cloneable
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

class BookForPrototype 
{
	private int bookid;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	private String bookname;
	@Override
	public String toString() {
		return "BookForPrototype [bookid=" + bookid + ", bookname=" + bookname + "]";
	}
}
