package cybertekExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequencyOfCharachters {
	public static void main(String[] args) {

	}

	public static String FrequencyOfChars(String str) {
		String nonDup = "";
		for (int i = 0; i < str.length(); i++)
			if (!nonDup.contains("" + str.charAt(i)))
				nonDup += "" + str.charAt(i);
		String expectedResult = "";
		for (int j = 0; j < nonDup.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == nonDup.charAt(j))
					count++;
			}
			expectedResult += nonDup.charAt(j) + "" + count;
		}
		return expectedResult;
	}

	public static String FrequencyOfChars2(String str) {
		String expectedResult = "";
		int j = 0;
		while (j < str.length()) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(j))
					count++;				
			}
			expectedResult += str.charAt(j) + "" + count;
			str = str.replace("" + str.charAt(j), "");
		}
		return expectedResult;
	}

	public static String FrequencyOfChars3(String str) {
		String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		b = b.replace(", ", "").replace("[", "").replace("]", "");
		String result = "";
		for (int j = 0; j < b.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++)
				if (str.substring(i, i + 1).equals("" + str.charAt(j)))
					count++;
			result += b.substring(j, j + 1) + count;
		}
		return result;
	}

	public static String frequency(String str) {
		String nonDup = "", result = "";
		for (int i = 0; i < str.length(); i++)
			if (!nonDup.contains("" + str.charAt(i)))
				nonDup += "" + str.charAt(i);
		for (int i = 0; i < nonDup.length(); i++) {
			int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
			result += "" + nonDup.charAt(i) + num;
		}
		return result;
	}
}
