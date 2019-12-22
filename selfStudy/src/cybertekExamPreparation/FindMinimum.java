package cybertekExamPreparation;

import java.util.Arrays;

public class FindMinimum {
	public static void main(String[] args) {
		int num[]={23,34,54,63,12,87,3};
		System.out.println(minValue1(num));
		System.out.println(minValue2(num));
	}

	public static int minValue1(int[] n) {
		int min = Integer.MAX_VALUE;
		for (int each : n)
			if (each < min)
				min = each;
		return min;
	}

	public static int minValue2(int[] n) {
		Arrays.sort(n);
		return n[0];
	}
}
