package replitMethods;

import java.util.ArrayList;
import java.util.List;

public class PrintUniqueNumbers {
	public static void main(String[] args) {
		int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
		printUniqueNumbers(nums);
	}
	public static void printUniqueNumbers(int[] arr) {
		List<Integer> list= new ArrayList<Integer>();		
		for (int i = 0; i < arr.length; i++) {
			int count=0;	
			for (int j =0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;					
				}			
			} 
			if(count==1) {
				list.add(arr[i]);	
			}
		}
		for (Integer string : list) {
			System.out.println(string);
		}
	
	}
}
