package replit;

import java.util.Scanner;

public class SplittingWebLink {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//<!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
	    String html = scan.nextLine();
	    if(html.indexOf("<html>")>-1){
	      String [] a1=html.split("id=\"");
	      String s1=a1[1];
	      System.out.println(s1);
	      String [] a2=s1.split("\"");
	      String s2=a2[0];
	      System.out.println(s2);
	    }else{
	      System.out.println("Invalid input!");
	    }
	    scan.close();
	}

}
