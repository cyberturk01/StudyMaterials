package examPreparation;

public class DuplicateElementInArray {

	public static void main(String[] args) {
//		 Java program to remove duplicate element in an array.
		int []myArray=new int[] {13,12,11,42,54,42,23,123,435,45,480,45};
		removeDuplicateElement(myArray);
	}
	public static void removeDuplicateElement(int[] arr) {
		int len=arr.length;
		
		System.out.println("First array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[len-1];// bulunan ayni numara en arkaya gonderiliyor
					len--;            // array size kucultuluyor    
				}
			}
		}
		int[]newArray=new int[len];
		System.out.println("New Array without repetation: ");
		for (int i = 0; i < len; i++) {
			newArray[i]=arr[i];
			System.out.print(newArray[i]+" ");
		}

	}

}
