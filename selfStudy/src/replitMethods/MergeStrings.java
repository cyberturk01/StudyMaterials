package replitMethods;

public class MergeStrings {
	public static void main(String[] args) {
		System.out.println(mergeStrings("java", "selenium"));
		System.out.println(mergeStrings("wooden", "spoon"));
	}
	public static String mergeStrings(String one, String two) {
		String[] s1 = one.split("");
		String[] s2 = two.split("");
		String result = "";
		String remainingResult = "";
		if (s2.length == s1.length) {
			for (int i = 0; i < s1.length; i++) {
				result += s1[i] + s2[i];
			}
		}
		if (s2.length > s1.length) {
			for (int i = 0; i < s1.length; i++) {
				result += s1[i] + s2[i];
			}
			for (int i = s1.length; i < s2.length; i++) {
				remainingResult += s2[i];
			}
		}
		if (s1.length > s2.length) {
			for (int i = 0; i < s2.length; i++) {
				result += s1[i] + s2[i];
			}
			for (int i = s2.length; i < s1.length; i++) {
				remainingResult += s1[i];
			}
		}

		return result + "" + remainingResult;
	}
}
