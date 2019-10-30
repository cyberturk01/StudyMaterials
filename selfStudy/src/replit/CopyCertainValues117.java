package replit;

import java.util.Arrays;

public class CopyCertainValues117 {
	public static void main(String[] args) {
	    System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two", "three", "four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
    }
	  public static String[] getWithE(String[] arr) {
		int count=0;
		int count2=0;
		for (String i :arr) {
			if(i.contains("e")) {
				count++;
			}
		}
		String []fewValues= new String[count];
		for (String i :arr) {
			if(i.contains("e")) {
				fewValues[count2++]=i;
			}
		}
	    return fewValues;
	  }
	  
}
