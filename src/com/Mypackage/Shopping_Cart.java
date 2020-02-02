package com.Mypackage;

import java.util.*;

/**
 * 
 * @author RAJ
 *
 */

public class Shopping_Cart 
{

	private String customerName; //This is used for customerName of the Shopping_Cart.
    private String currentDate;  //This is used for customerDate of the Shopping_Cart.
    /**
     * BookcartItems is the arraylist for add the book items.
     * GiftCardItems is the arraylist for add the giftcard Items.
     */
    private ArrayList<Book> BookcartItems = new ArrayList<>();
    private ArrayList<GiftCard> GiftCardcartItems = new ArrayList<>();
  
    /**
     * Default constructor.
     */
    public Shopping_Cart()
    {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }
  
    /**
     * 
     * @param customerName This contains the customerName for the Shopping_Cart.
     * @param currentDate  This contains the currentDate for the Shopping_Cart.
     */
    public Shopping_Cart(String customerName, String currentDate)
    {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }
  
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
  
    public String getCustomerName()
    {
        return customerName;
    }
  
    public void setDate(String currentDate)
    {
        this.currentDate = currentDate;
    }
  
    public String getDate()
    {
        return currentDate;
    }
  
    /**
     * 
     * @param item This is the object for class Book.
     * This BookaddItem method used for add book items in the cart.
     */
    public void BookaddItem(Book item) //HAVING TROUBLE PASSING OBJECT THROUGH A PARAMETER
    {
    	BookcartItems.add(item);
    	System.out.println("Item added");
    }
    
    /**
     * 
     * @param item This is the object for class GiftCard.
     * This GiftCardaddItem method used for add giftcard items in the cart 
     */
    public void GiftCardaddItem(GiftCard item) //HAVING TROUBLE PASSING OBJECT THROUGH A PARAMETER
    {
    	GiftCardcartItems.add(item);
    	System.out.println("Item added");
    }
    Book temp;
  
   /**
    * This printDescription method is used for show the book and giftcard items from the cart when user add the items in the cart.   
    */
    public void printDescription()
    {
        for (int i = 0; i < BookcartItems.size(); i++)
        {
            BookcartItems.get(i).printItemDescription();
            //GiftCardcartItems.get(i).printItemDescription();
        }
        for (int i = 0; i < GiftCardcartItems.size(); ++i)
        {
            GiftCardcartItems.get(i).printItemDescription();
        }
    }
  
	
}
