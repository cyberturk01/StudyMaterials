package replitManipulations;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWordInTheArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(", ");
		Arrays.sort(arr);
		String word = arr[0];
		String word2="";
		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i].length() <= word.length()) {
				if(arr[i].length() > arr[i+1].length()) {
					continue;
				}
				word = arr[i];
				System.out.println(word);
				word2+=word + ", ";
			}
		}
		System.out.println(Arrays.toString(arr));
		String arr2[] = word2.split(", ");
//		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		scan.close();
	}
// olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
// volt, olive, fish, hot pursuit, warning, python, java, coffee, part
}
