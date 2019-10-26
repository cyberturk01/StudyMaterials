package examPreparation;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println( palindrome("level"));
		System.out.println( palindrome("wow"));
		System.out.println( palindrome("racecar"));
		System.out.println( palindrome("racecat"));
		System.out.println( palindrome("Taco cat"));
		System.out.println( palindrome("abccba"));
	}
	public static boolean palindrome(String str) {
			String str2="";
			for (int i = str.length()-1; i>=0; i--) {
				str2+=str.charAt(i);				
			}
			if(str.replace(" ","").equalsIgnoreCase(str2.replace(" ", ""))) {
				return true;
			}
			return false;
	}
	public static void print() {
		System.out.println("Hello");
	}
}
