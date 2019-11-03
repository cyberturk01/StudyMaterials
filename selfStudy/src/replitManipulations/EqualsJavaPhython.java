package replitManipulations;

import java.util.Scanner;

public class EqualsJavaPhython {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int countj = 0;
		int countp = 0;
		for (int i = 0; i <= str.length() - 4; i++) {
			if (str.substring(i, (i + 4)).equals("java")) {
				countj++;
			}
		}
		for (int i = 0; i <= str.length() - 6; i++) {
			if (str.substring(i, (i + 6)).equals("python")) {
				countp++;
			}
		}
		if (countp == countj) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
//		We study java not python
		scan.close();
	}

}
