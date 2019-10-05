package replit;

import java.util.Scanner;

public class CoinMoneyChanger {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=0;
		boolean flag=true;
		System.out.println("Enter a whole amount 1-99");
		
		do {
			int amount=sc.nextInt();
			if(amount>0 && amount<=99) {
				System.out.println(wholeNumber(amount));
				System.out.println(changeAmount(amount));
				flag=false;
				//break;
			}else {
				i++;
				if(i==3) {
					System.out.println("Sorry you cant try again");
					flag=false;
					//break;
				}else {					
					System.out.print("Try again");	
				}				
			}
		} while (flag);
		
			sc.close();	
	}
		
	
		
		
		
	
	public static String wholeNumber(int amount) {
		int quarter=amount/25;	
		amount%=25;		
		int dimes=amount/10;
		amount%=10;
		int nickles= amount/5;
		amount%=5;
		int pennies= amount;
		
		
		return ("You have "+quarter+" quarter "+ dimes+" dimes "
							+nickles+" nickles "+ pennies+ " pennies ");
		
		
	}
	public static String changeAmount(int itemPrice) {
		  if(itemPrice<=25 || itemPrice>=100){
		      return ("Invalid price!");
		    }else if(itemPrice%5!=0){
		      return ("Invalid price!");
		    }else{
		      
			   int remaining=100-itemPrice;
			   int quarters=(remaining)/25;		   
			   int dimes=(remaining%25)/10;		  
			   int nickels= ((remaining%25)%10)/10;
		      return ("Your change is "+quarters+" quarters, "
		                        +dimes+" dimes, and "+nickels+" nickels.");
		    }
	}

}
