package examPreparation;

import java.util.Scanner;

public class SmallestGreatestNum {
	static boolean flag=true;
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int selection;
		int largest=Integer.MIN_VALUE;
		System.out.println(largest);
		int smallest=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your first number: ");
		num1= sc.nextInt();
		smallest=num1; // first number assigned to smallest number
		while(flag) {			
			System.out.print("Enter your next Number: ");
			num2=sc.nextInt();
			if(num2>largest) {// compare num2 with largest 
				largest=num2; //largest bucket gets the num2 values
			}
			if(num2<smallest) {// compare num2 with smallest which is num1 at the beginning 
				smallest=num2;//smallest bucket gets the num2 values
			}
			System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
			selection=sc.nextInt();
			choose(selection, smallest, largest);// call the choose method
		}
		sc.close();
	}
	public static void choose(int num, int smallest, int largest) {
		switch (num) {
		case 0:
			System.out.println("Smallest Number is:"+ smallest);
			System.out.println("Largest Number is:"+ largest);	
			flag=false;			
			break;
		case 1:
			flag=true;	
			break;
		default:
			flag=false;
			break;
		}
	}
}
