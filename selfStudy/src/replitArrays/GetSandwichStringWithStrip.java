package replitArrays;

import java.util.Scanner;

public class GetSandwichStringWithStrip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;
		for (int i = 0; i <= str.length() - 5; i++) {
			if (str.substring(i, (i + 5)).equals("bread")) {
				count++;
			}
		}
		if (count <= 1 || (!str.contains("bread"))) {
			System.out.println("nothing");
		} else if (count == 2) {
			String[] a = str.split("bread");
			String a1 = a[1];
			System.out.println(a1);
		} else {
			String[] a = str.split("bread");
			String a2 = a[2];
			System.out.println("bread" + a2);
		}
//		A sandwich is two pieces of bread with something in between. 
//		Print the string that is between the first and last appearance 
//		of "bread" in the given string, or return string "nothing" 
//		if there are not two pieces of bread.
		
		scan.close();
	}

}
