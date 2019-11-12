package replitArrays;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int[][] matrix = {
	    		{1,2,3},
	    		{4,5,6},
	    		{9,8,9}
	    };
	    int result = 0;
	    int leftToRight=0;
	    int rightToLeft=0;
	    leftToRight+=matrix[0][0]+matrix[1][1]+matrix[2][2];
	    rightToLeft+=matrix[0][2]+matrix[1][1]+matrix[2][0];
	    
	    result=leftToRight-rightToLeft;
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
	    scan.close();
	}
}

