package cybertekExamPreparation;

public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse1("ABCD"));
		System.out.println(reverse2("ABCD"));
	}

	public static String reverse1(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverse += str.toCharArray()[i];
		return reverse;
	}

	public static String reverse2(String str) {
		return new StringBuffer(str).reverse().toString();
	}
}
