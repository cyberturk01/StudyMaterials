package replMethodOverloading;

public class FindMaxNumber {
	public static void main(String[] args) {
		int[]num= {4,6,7,23,2};
		double[]num2= {4.2,6.34,1.765,23.986,2.123};
		System.out.println(findMax(num));
		System.out.println(findMax(num2));
	}
	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max=arr[i];	
			}
		}
		return max;
	}

	public static double findMax(double[] arr) {
		double max = Double.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max=arr[i];	
			}
		}
		return max;	
	}
}
