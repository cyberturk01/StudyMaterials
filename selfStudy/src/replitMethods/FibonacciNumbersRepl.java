package replitMethods;

public class FibonacciNumbersRepl {
	public static void main(String[] args) {
		fib(2);
		fib(9);
	}

	public static void fib(int num) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		if(num==num2) {
			System.out.println(num1);
		}else {
			for (int i = 0; i < num; i++) {
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
			System.out.println(num1);
		}
	}
}
