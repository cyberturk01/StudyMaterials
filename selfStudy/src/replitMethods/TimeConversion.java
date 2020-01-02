package replitMethods;

import java.util.*;
public class TimeConversion {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	    
	    scan.close();
	}
	
	public static void timeConversion(String s) {
		String [] time=s.split(":");
		int num=Integer.valueOf(time[0])+12;
		
		String[] num1=time[2].split("P");
		String[] num2=time[2].split("A");
		
		if(num1.length==2)
			System.out.println(num+":"+time[1]+":"+num1[0]);	
		else
			System.out.println(time[0]+":"+time[1]+":"+num2[0]);	
			 
	}
}

