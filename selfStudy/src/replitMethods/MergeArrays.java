package replitMethods;

public class MergeArrays {
	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3 };
		int[] num2 = { 4, 5, 6 };
		for (int i : mergR(num1, num2)) {
			System.out.print(i);
		}
		System.out.println(reverse("foo"));
		System.out.println(reverse("student"));

		
	}

	public static int[] mergR(int[] a, int[] b) {
		int[] total = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			total[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			total[i + a.length] = b[i];
		}
		return total;
	}// end mergR

	public static String reverse(String input) {
		String[] res = input.split("");
		String end = "";
		for (int i = res.length - 1; i >= 0; i--) {
			end += res[i];
		}
		return end;
	}


	
	
}
