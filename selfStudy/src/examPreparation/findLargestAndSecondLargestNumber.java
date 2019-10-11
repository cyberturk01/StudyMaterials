package examPreparation;

public class findLargestAndSecondLargestNumber {

	public static void main(String[] args) {
//		 Java program to find largest and second largest in an array.
		int []myArray=new int[] {13,12,11,42,54,43,23,123,435,45,480,43};
		int largest=0;
		int largestSecond=0;
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i]>largest) {
				largestSecond=largest;
				largest=myArray[i];
			}else if(myArray[i]>largestSecond) {
				largestSecond=myArray[i];
			}
		}
		System.out.println(largestSecond);
		System.out.println(largest);
		
	}

}

