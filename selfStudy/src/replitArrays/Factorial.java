package replitArrays;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//	    int n = scan.nextInt();
//	    System.out.println(factorial(n));
	    int n1=scan.nextInt();
	    System.out.println(factorial2(n1));
	    scan.close();
	}
	public static long factorial(int n){
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	public static long factorial2(int n) {
		int result=1;
		for (int i = 1; i <=n; i++) {
			result=result*i;
		}
		return result;
	}
	
}
