package codingBat;

public class RoundSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(roundSum(16,17,18));
	}

	public static int roundSum(int a, int b, int c) {
		return ((a+5)/10*10) + ((b+5)/10*10) +((c+5)/10*10);
	}

	

}
