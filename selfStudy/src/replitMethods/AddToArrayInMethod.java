package replitMethods;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArrayInMethod {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int size = inp.nextInt(),n = inp.nextInt();
    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++){
        arr[i]=inp.nextInt();
    }
     add_to_r(arr, n); 
     
     inp.close();
  }
  public static void add_to_r(int[] r,int n){	
		int[]new_r=new int[r.length+1];
		new_r=Arrays.copyOf(r, r.length+1);
		new_r[r.length]=n;
		
		for (int i : new_r) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(new_r)+ " "+new_r.length);
	}
}
