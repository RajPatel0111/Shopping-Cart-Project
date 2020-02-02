package com.Mypackage;

import java.util.*;

/**
 * This class contains main method.
 * @author RAJ
 *
 */

public class Shopping_Cart_App
{
	
	public static void main(String[] args)
	{
		int choice1; // This is used for switch case to choose the option.
		
	    Book b[]=new Book[5]; // This is the array of size 5 of the class Book.
		b[0]=new Book(101,100,"Raj","ASE");
		b[1]=new Book(102,500,"Sheshan","ET");
		b[2]=new Book(103,800,"Viany","ACC");
		b[3]=new Book(104,200,"Sunny","SP");
		b[4]=new Book(105,300,"Harsh","TOS");
		
		GiftCard d[]=new GiftCard[5]; // This is the array of size 5 of the class GiftCard.
		d[0]=new GiftCard(201,600,"extra 600 off","Green");
		d[1]=new GiftCard(202,400,"extra 400 off","Pink");
		d[2]=new GiftCard(203,700,"extra 700 off","Black");
		d[3]=new GiftCard(204,300,"extra 300 off","Red");
		d[4]=new GiftCard(205,200,"extra 200 off","Yellow");
		Book temp; // This is reference of the class Book.
		for(int i=0;i<(b.length)-1;i++)
		{
			for(int j=i+1;j<(b.length);j++)
			{				
				if(b[i].getprice()>b[j].getprice()){
		    		temp=b[j];
		    		b[j]=b[i];
		    		b[i]=temp;
		    	}
			}
		}
		System.out.println("Book Display with Price Assending Order");
		System.out.println("----------------------------------------");
		for(int i=0;i<(b.length);i++)
		{	           
			b[i].display();
		}
		GiftCard temp1;
		for(int i=0;i<(d.length)-1;i++)
		{
			for(int j=i+1;j<(d.length);j++)
			{	
				if(d[i].getprice()>d[j].getprice()){
		    		temp1=d[j];
		    		d[j]=d[i];
		    		d[i]=temp1;
		    	}
			}
		}
		System.out.println("GiftCard by Price Assending Order");
		System.out.println("----------------------------------------");
		for(int i=0;i<(d.length);i++)
		{	           
			d[i].display();
		}
		
		
		Shopping_Cart cart = new Shopping_Cart();
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
  
        System.out.println("Enter Customer's Name:");
        cart.setCustomerName(input.nextLine());
        System.out.println("Enter Today's Date:");
        cart.setDate(input.nextLine());
        System.out.println("");
        System.out.println("Customer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());
  
       ArrayList<Integer> checkid = new ArrayList<Integer>();
		while (true) {
			System.out.println("Menu:");
			System.out.println("0 please Exit "); 
			System.out.println("1 add item in the cart ");
			System.out.println("2 to show the cart "); 
			
			
			 choice1 = input.nextInt();
	
			switch(choice1)
			{
 
			case 0:
				System.out.println("Thank you for shopping");
				System.exit(0);

			case 1:
				System.out.println("Enter item ID: ");
				int id1=input.nextInt();
				if(!checkid.contains(id1))
				{
				   for(int i=0;i<b.length;i++)
			     	{
					   if(b[i].getid()==id1)
					 {
	                   cart.BookaddItem(b[i]);
	                   checkid.add(id1);
	                   break;
					 }
				    } 
				   for(int i=0;i<d.length;i++)
				   {
					   if(d[i].getid()==id1)
					{
					   cart.GiftCardaddItem(d[i]);
					   checkid.add(id1);
					   break;
					}
				   }
				}
				else
				{
					System.out.println("Due to limited stock You can't purchase the same Item again Sorry for that!!!!");
				}
				break;
				
			case 2:
			    cart.printDescription();
                            break;
       
			}
		}
	}

}
