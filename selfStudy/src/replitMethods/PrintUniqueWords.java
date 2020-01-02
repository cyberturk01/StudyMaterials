package replitMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintUniqueWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		String[] words = new String[size];
//		for (int i = 0; i < size; i++) {
//			words[i] = scan.next();
//		}
		String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
		printUniqueWords(words);
		scan.close();
	}
	public static void printUniqueWords(String[] words) {
		int len=words.length;
		
		List<String> list= new ArrayList<String>();		
		for (int i = 0; i < len; i++) {
			int count=0;
			for (int j =0; j < len; j++) {
				if(words[i].equals(words[j])) {
					count++;					
				}			
			} 
			if(count==1) {
				list.add(words[i]);	
			}
		}
		for (String string : list) {
			System.out.println(string);
		}
	
		
		
	
	}
}
