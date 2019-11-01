package replitIFCases;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int itemPrice, quarters, dimes, nickels;
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Enter price in cents:");
	    itemPrice=scan.nextInt();
	    if(itemPrice<=25 || itemPrice>=100){
	      System.out.println("Invalid price!");
	    }else if(itemPrice%5!=0){
	      System.out.println("Invalid price!");
	    }else{
	    	
    	   quarters=(100-itemPrice)/25;
		   itemPrice%=25;
		   System.out.println(itemPrice);
		   dimes=(25-itemPrice)/10;
		   itemPrice%=10;
		   System.out.println(itemPrice);
		   nickels= (10-itemPrice)/10;
	      
	      System.out.println("Your change is "+quarters+" quarters, "
	                        +dimes+" dimes, and "+nickels+" nickels.");
	      scan.close();
	    }
	}
}
