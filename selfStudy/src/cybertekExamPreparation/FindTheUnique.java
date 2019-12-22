package cybertekExamPreparation;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {
	public static void main(String[] args) {
		System.out.println(unique("AAABBBCCCDEF"));
		System.out.println(unique2("AAABBBCCCDEF"));
	}

	public static String unique(String str) {
		String[] arr = str.split("");
		String unique1 = "";
		for (int j = 0; j < arr.length; j++) {
			int num = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(arr[j]))
					num++;
			}
			if (num == 1)
				unique1 += arr[j];
		}
		return unique1;
	}

	public static String unique2(String str) {
		String result = "";
		for (String each : str.split(""))
			result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";
		return result;
	}
}
