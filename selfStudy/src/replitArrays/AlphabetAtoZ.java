package replitArrays;

import java.util.Scanner;

public class AlphabetAtoZ {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0); //a
	    char end = scan.next().charAt(0); //z
	    String result="";
	    String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    for(int i=0;i<=str.length();i++) {
    		result=str.substring(str.indexOf(start),str.indexOf(end)+1);
	    }
	    System.out.println(result);
		scan.close();
	}
}
