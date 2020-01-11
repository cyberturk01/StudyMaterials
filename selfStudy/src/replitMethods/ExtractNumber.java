package replitMethods;

public class ExtractNumber {
	public static void main(String[] args) {
		System.out.print(extractNum("aa2aa3"));
		System.out.print(extractNum("23"));
	}

	public static String extractNum(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				str += s.charAt(i);
			}
		}
		return str;
	}
}
