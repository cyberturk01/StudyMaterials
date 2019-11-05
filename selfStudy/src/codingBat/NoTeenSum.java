package codingBat;

public class NoTeenSum {

	public static void main(String[] args) {
		System.out.println(noTeenSum(1, 2, 3));
	}
	public static int noTeenSum(int a, int b, int c) {
		  return fixTeen(a)+fixTeen(b)+fixTeen(c);
		}

	public static int fixTeen(int n) {
		if (n < 13) {
			return n;
		} else if (n == 15 || n == 16) {
			return n;
		} else {
			return 0;
		}
	}

}
