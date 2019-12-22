package cybertekExamPreparation;

import java.util.Arrays;

public class FindMaximum {
	public static void main(String[] args) {
		int num[]={23,34,54,63,12,87,3};
		System.out.println(maxValue1(num));
		System.out.println(maxValue2(num));
	}

	public static int maxValue1(int[] n) {
		int max = Integer.MIN_VALUE;
		for (int each : n)
			if (each > max)
				max = each;
		return max;
	}

	public static int maxValue2(int[] n) {
		Arrays.sort(n);
		return n[n.length - 1];
	}
}
