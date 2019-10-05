package smallPrograms;

import java.util.Scanner;

public class GuessingNumber {

	 public static void main(String[]args) {
        int number= (int)(Math.random()*11);
        long startingTime= System.currentTimeMillis();
        Scanner sc= new Scanner(System.in);
        
        int tried=3;
        int guessedNumber=-1;
        System.out.println("Welcome to Guessing game:");
        while(guessedNumber!=number) {
            if(tried>0) {                
                System.out.println("Please enter a number");
                guessedNumber=sc.nextInt();
                tried--;            
                if(guessedNumber==number) {
                    System.out.println("******Congratulations, You won*********");        
                    break;
                }else if(guessedNumber<number) {
                    System.out.println("The Lucky number is higher" +" "+"You have "+(tried+1)+" more chances left");
                }else if(guessedNumber>number){
                    System.out.println("The Lucky number is lower"+" "+"You have "+(tried+1)+" more chances left");
                }
            }else {
                System.out.println("You have lost..");    
                break;
            }
        }
        long finishingTime= System.currentTimeMillis();
        int timePassed=(int)((finishingTime-startingTime)/1000);
        System.out.println("Toplam "+ timePassed +" saniyede bitirdiniz");
        sc.close();     
    }   

}
