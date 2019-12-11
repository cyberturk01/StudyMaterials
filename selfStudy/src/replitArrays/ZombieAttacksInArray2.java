package replitArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZombieAttacksInArray2 {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	        int[] array = new int[8];
	        for(int i=0; i<array.length; i++) {
	          array[i] = input.nextInt();
	        }
	        
	        boolean keepGoing = true;
	        int j = 0;
	        while (keepGoing) {
	            System.out.println("Day " + j + " " + Arrays.toString(array));
	            j++;
	            List<Integer> index = new ArrayList<Integer>();
	            
	            for(int i = 0 ; i < array.length-1 ; i++) {
	                if(array[i] == 0 && array[i+1] > 0 && !index.contains(i+1)) {
	                	index.add(i+1);
	                }	
	            }
	            for(int i = array.length-1 ; i > 0 ; i--) {
	                if(array[i] == 0 && array[i-1] > 0 && !index.contains(i-1)) {
	                	index.add(i-1);
	                }
	            }
	       
	            for(int i = 0 ; i < index.size() ; i++) {
	                array[index.get(i)] /= 2;
	            }
	            if (index.size() == 0) {
	                keepGoing = false;
	            }
	        }
	        System.out.println("---- EXTINCT ----");
	        input.close();
	}
// 0 20 0 20 20 10 0 10
//  Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
//	Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
//	Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
//	Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
//	Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
//	Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
//	---- EXTINCT ----
}
