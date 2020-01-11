package replitMethods;

public class PalindrromeNumber {
	public static void main(String[] args) {
		isPalindrome(1001);
		isPalindrome(1234);
		isPalindrome(9987899);
	}

	public static void isPalindrome(int num) {
		int original=num;
		int reverse = 0;
		int remainder;
		while (num != 0) {
			remainder = num % 10; //with remainder 10 to find first digit at the end
			reverse = reverse * 10 + remainder;
			num /= 10; //  delete the last digit
		}

		if (reverse == original) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
