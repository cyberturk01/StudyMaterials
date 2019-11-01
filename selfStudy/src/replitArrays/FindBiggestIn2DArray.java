package replitArrays;

import java.util.Scanner;

public class FindBiggestIn2DArray {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	    int biggest=Integer.MIN_VALUE;
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        if(arr[i][j]>biggest) {
	        	biggest=arr[i][j];
	        }
	      }//end for cols
	    }//end for rows
	    System.out.println(biggest);
	    inp.close();
	}

}
