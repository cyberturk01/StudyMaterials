package examPreparation;

public class IsPrime1To1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			if(isPrime(i)) {
				System.out.println( i +" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
