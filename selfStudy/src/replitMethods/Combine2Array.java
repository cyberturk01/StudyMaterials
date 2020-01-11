package replitMethods;

public class Combine2Array {
	public static void main(String[] args) {
		String[] st1 = { "f", "o", "o" };
		String[] st2 = { " b", "a", "r" };
		System.out.println(combineRs(st1, st2));
	}
	public static String combineRs(String[] r1, String[] r2) {
		String res = "";
		for (int i = 0; i < r1.length; i++) {
			res += r1[i];
		}
		for (int i = 0; i < r2.length; i++) {
			res += r2[i];
		}
		return res;
	}
}
