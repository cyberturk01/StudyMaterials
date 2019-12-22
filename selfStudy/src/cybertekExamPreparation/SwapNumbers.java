package cybertekExamPreparation;

public class SwapNumbers {
	public static void main(String[] args) {
		swap(5,7);
		swap2(5,7);
	}
	public static void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
	public static void swap2(int a, int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
	
}
