package examPreparation;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrime(97));
			
	}
	
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num%i==0 ) {
				return false; // boluneni bulana kadar false
			}	
		}		
		return true;
	}
	
}
