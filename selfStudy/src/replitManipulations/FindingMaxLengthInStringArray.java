package replitManipulations;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxLengthInStringArray {

	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
		String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
		
//		for(int i = 0; i < 5;  i++) {
//		  words[i] = input.nextLine();
//		}
		Arrays.sort(words);
		String longest=words[0];
		for (int i = 0; i < words.length ; i++) {
			if(words[i].length()>longest.length()) {
				longest=words[i];
			}
		}
		System.out.println(longest);		
		input.close();
		
	}

}
