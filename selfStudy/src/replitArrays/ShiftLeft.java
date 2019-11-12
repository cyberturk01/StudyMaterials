package replitArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE
//		input: 6, 2, 5, 3
//		output: [2, 5, 3, 6]
		int temp=nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			nums[i]=nums[i+1];
		}
		nums[nums.length-1]=temp;
		System.out.println(Arrays.toString(nums));
		scan.close();

	}

}
