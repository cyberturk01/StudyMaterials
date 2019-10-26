package examPreparation;

public class Fibonacci {
	public static void main(String[] args) {
		
		int count =8;
		int num1=0, num2=1;
		System.out.println("Fibonacci series of "+count+" numbers");
		System.out.print(num1+" "+ num2 +" ");
		for (int i = 0; i < count; i++) {
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(num2+ " ");
//			0 1 1 2 3 5 8 13 21 34
			
		}
	}
}
