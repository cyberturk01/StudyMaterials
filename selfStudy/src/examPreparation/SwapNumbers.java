package examPreparation;

public class SwapNumbers {
	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		int temp;
		System.out.println(n1+" was num1 " +n2+" was num2");
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+" num1 " +n2+" num2");
		
		
		int num1=10, num2=20;
		System.out.println(num1+" was num1 " +num2+" was num2");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println(num1+" num1 " +num2+" num2");

	}
}
