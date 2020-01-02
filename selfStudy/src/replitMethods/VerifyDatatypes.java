package replitMethods;

import java.util.Scanner;

public class VerifyDatatypes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numStr = scan.next();
		printDataTypes(numStr);
		scan.close();
	}

	public static void printDataTypes(String numStr) {
		long num = 0;
		try {
			num = Long.valueOf(numStr);
			System.out.println(num + " can be fitted in:");
			if (num >= -128 && num <= 127) {
				System.out.println("* byte");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			}else if(num>=-32768 && num<=32767) {
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			}else if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE) {
				System.out.println("* int");
				System.out.println("* long");
			}else if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE) {
				System.out.println("* long");
			}

		} catch (Exception e) {
			System.out.println(numStr + " can't be fitted anywhere.");
		}
	}
}
