package replitArrays;

import java.util.Arrays;
import java.util.Scanner;


public class LargestNumber2 {
	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++){
		      for(int j=0 ;j<=cols-1;j++){
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rows
		    
		    int biggest=arr[0][0];
		    for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < cols; j++) {
					if(arr[i][j]>biggest) {
						biggest=arr[i][j];
					}
				}
			}
		   // 2,2,3,4,5,1
		    
		    int[][]arr2=new int[rows][cols];
		    for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					arr2[i][j]=biggest;
				}
			}
		    //FINAL PRINT
		    System.out.println();
		    System.out.println(Arrays.deepToString(arr2));
		    inp.close();
	}
}
