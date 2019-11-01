package replitManipulations;

import java.util.Scanner;

public class PrefixAgainInTheString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    boolean flag=false;
	    String str2=str.substring(0,n);
	    for(int i=0;i<str.length()-(n-1);i++){
	    	if(str.indexOf(str2,n)>-1){ // starting from n 
	    		flag=true;
	    	}else{
	    		flag=false;
	    	}
	    }
	    System.out.println(flag);
	    scan.close();
	}

}
