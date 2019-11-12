package replitArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		// WRITE YOUR CODE HERE
		for (int i = 0; i < score.length; i++) {
			System.out.println("Enter score for judge "+(i+1)+":");
			score[i]=input.nextFloat();			
		}
		Arrays.sort(score);
		float total=0;
		for (int i = 0; i < score.length; i++) {
			total+=score[i];
		}
		total-=(score[0]+score[score.length-1]);
		System.out.println("Enter difficulty:");
		float diff=input.nextFloat();
		if(diff>1.2 ||diff <3.8) {
			total*=diff*0.6;
		}
		//1555589 2.1
		// FINAL OUTPUT
//		System.out.println(total);
		System.out.printf("Total: %.2f", total);
		input.close();
		
	}
}
