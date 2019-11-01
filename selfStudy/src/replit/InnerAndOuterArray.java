package replit;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuterArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		System.out.println(linearIn(outer, inner));
		scan.close();
	}

	public static boolean linearIn(int[] outer, int[] inner) {
		boolean notFound;
		for (int i = 0, j = 0; i < inner.length; i++) {
			notFound = true;
			for (; j < outer.length && notFound; j++) {
				if (inner[i] == outer[j])
					notFound = false;
			}
			if (notFound)
				return false;
		}
		return true;
	}

}
