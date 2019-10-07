package examPreparation;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println( hasBad("level"));
		System.out.println( hasBad("wow"));
		System.out.println( hasBad("racecar"));
		System.out.println( hasBad("racecat"));
		System.out.println( hasBad("Taco cat"));
		
	}
	public static boolean hasBad(String a) {
			
			String b="";
			for (int i = a.length()-1; i>=0; i--) {
				b+=a.charAt(i);
			}
			if(a.replace(" ","").equalsIgnoreCase(b.replace(" ", ""))) {
				return true;
			}else {
				return false;
			}
			
	}
}
