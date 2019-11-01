package replitManipulations;

import java.util.Scanner;

public class LastWordX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next(); // Word
	    String separator = scan.next(); //X
	    int count = scan.nextInt(); //3-4
	    String result="";
	    int count1=0;
	    for(int i=0;i<count;i++){
	    	count1++;
    		result+=word;
    		if(count1>0){
    			if(count1<count) {
	    		result+=separator;
	    		}else {
	    			break;
	    		}
    		}
	    }
	    System.out.println(result);
	    scan.close();
	}

}
