package replitArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZobieAttackInArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		int count=0;
		int step=0;
		int max = inhabitants[0];
		for (int i = 1; i < inhabitants.length; i++) {
			if (inhabitants[i] > max)
				max = inhabitants[i];
		}
		while(max!=0) {
			max/=2;
			count++;
		}
        int []arr=new int[8];
        for (int i = 0; i < count+1; i++) {
            for (int j = 0; j < inhabitants.length; j++) {
                arr[j]=inhabitants[j]/(int)Math.pow(2, i);
            }
            System.out.println("Day "+(step++)+" "+Arrays.toString(arr));
        }
        System.out.println("---- EXTINCT ----");
        input.close();
	}	

}
