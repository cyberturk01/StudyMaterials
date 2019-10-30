package replit;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTwoElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int count=0;
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE
		int[] num2 = new int[2];
		if (num.length < 2) {
			System.out.println(Arrays.toString(num));
		}
		if(num.length>=2){
			for (int i=0;i<num.length;i++) {
				if(num[i]==num[0] || num[i]==num[1]){
				  num2[count++] = num[i];
				}
			}
			System.out.println(Arrays.toString(num2));
		}
		
		scan.close();

	}

}
