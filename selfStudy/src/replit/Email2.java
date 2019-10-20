package replit;

import java.util.Scanner;

public class Email2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String[]word;
	    String[]word2;
	    String[]word3;
	    word=email.split("@"); // gokhan_yigit@gmail.com
	    String fullname=word[0];
	    String mail=word[1];		    
	    word2=fullname.split("_");
	    word3=mail.split("\\.");
	    
	    System.out.println("First name: "+word2[0].substring(0,1).toUpperCase()+word2[0].substring(1));
	    System.out.println("Last name: "+word2[1].substring(0,1).toUpperCase()+word2[1].substring(1));
	    System.out.println("Domain: "+word3[0]);
	    System.out.println("Top-Level Domain: "+word3[1]);
	    scan.close();
	}
}
