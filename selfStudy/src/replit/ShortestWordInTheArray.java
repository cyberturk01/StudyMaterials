package replit;

import java.util.Scanner;

public class ShortestWordInTheArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { "java", "cable", "red", "vivid", "remedy", "grace" };
		String shortWord = str[0];

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < shortWord.length()) {
				shortWord = str[i];
			}
		}

		System.out.println(shortWord);
		scan.close();
	}
}
