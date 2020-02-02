package com.Mypackage;

/**
 * This class inherits from the Item class to use it's members.
 * @author RAJ
 *
 */

public class GiftCard extends Item
{

	String description; // This is used for description of the GiftCard.
	String colour;     // This is used for colour of the Giftcard.
	
	/**
	 * 
	 * @param id This contains item id.
	 * @param price This contains item price.
	 * @param description This contains description of the item GiftCard.
	 * @param colour This contains colour of the item GiftCard.
	 */
    GiftCard(int id,int price,String description, String colour) 
    {
      super(id,price); // These super constructor gets the id and price from the item class to use in the GiftCard class.
	 this.description=description;
	 this.colour=colour;
	
	}
    
    /**
	  * This display method displays id, price , desription and colour.
	  */
    public void display()
    {
    System.out.println("id - " + id);
    System.out.println("price - " + price);
    System.out.println("description - " + description );
    System.out.println("colour - " + colour );
    System.out.println(" ");
    }
    
    /**
	 * This printItemDescription method gets values from all variables(id, price, description and colour) and print the required values from it.  
	 */
    public void printItemDescription()
    {
    	System.out.println("Added GiftCard Item");
    	System.out.println("----------------------------------------");
        System.out.println(getid()+": "+getcolour()+": "+getdescription() + ": " + getprice());
    }
    public String getdescription()
	 {
	     return this.description;
	 }

	 public void setdescription(String description)
	 {
	     this.description = description;
	 }
	 
	 public String getcolour() 
	 {
	     return this.colour;
	 }

	 public void setcolour(String colour)
	 {
	     this.colour= colour;
	 }
	
}
