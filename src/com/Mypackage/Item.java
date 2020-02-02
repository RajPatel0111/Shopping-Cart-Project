package com.Mypackage;

/**
 * This is abstract class.
 * @author RAJ
 *
 */
public abstract class Item
{

	  public int id; // This is used for id of the item.  
	  public int price; // This is used for price of the item.
	 /**
	  * 
	  * @param id This is used for id of the item.
	  * @param price This is used for price of the item.
	  */
	 Item(int id, int price)
	 {   
		 this.id=id;
		 this.price=price;
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
	 
	
}
