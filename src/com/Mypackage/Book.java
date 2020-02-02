package com.Mypackage;

/**
 * This class inherits from the Item class to use it's members. 
 * @author RAJ
 *
 */

public class Book extends Item
{
	
	String author_name; // This is used for author_name of the Book.
	String title;      // This is used for title of the book.
	/**
	 * 
	 * @param id This contains item id.
	 * @param price This contains item price.
	 * @param author_name This contains author_name of the item book.
	 * @param title This contains title of the item book
	 */
	 Book(int id,int price, String author_name, String title) 
	{
		super(id,price); // These super constructor gets the id and price from the item class to use in the Book class.
		this.author_name=author_name;
		this.title=title;
		
	}
	 /**
	  * this display method displays id, price , author_name and title.
	  */
	public void display()
	{
		System.out.println("id - " + id);
		System.out.println("price - " + price);
	    System.out.println("author_name - " + author_name);
		System.out.println("title - " + title);	
		System.out.println(" ");
	}
	
	/**
	 * this printItemDescription method gets values from all variables(id, price, author_name and title) and print the
	 * required values from it.  
	 */
	 public void printItemDescription()
	    {	
		 	System.out.println("Added Book Item");
		 	System.out.println("----------------------------------------");
	        System.out.println(getid()+": "+getauthor_name()+": "+gettitle()+ ": " + getprice());
	    }
	 
	
	public int getid() 
	 {
	     return this.id;
	 }

	 public void setid(int id)
	 {
	     this.id = id;
	 }
	 public int getprice() 
	 {
	     return this.price;
	 }

	 public void setprice(int price)
	 {
	     this.price = price;
	 }
	 public void setauthor_name(String author_name)
	 {
		 this.author_name=author_name;
	 }
	 public String getauthor_name() 
	 {
         return this.author_name;
	 }
	 
	 public void settile(String title)
	 {
		 this.title=title;
	 }
	 public String gettitle()
	 {
		return this.title;
	 }
	 

}
