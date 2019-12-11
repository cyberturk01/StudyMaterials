package replitArrays;

import java.util.Random;

public class SumsInLoop {

	public static void main(String[] args) {
		String[]str= {"FT", "FatihG", "Gökhan", "MustafaB", "MuhteremAhmet",
				"MusaM","AhatG","Emrullah", "SalihDemir", "CagriA", "Elyar", "OmerT"};
		int[]num= {0,1,2,3,4,5,6,7,8,9,10,11,12};
		int n=str.length;
		
//		for (int i = 0; i < num.length-1; i++) {
//			System.out.println(str[i]+" ismi icin numara:"+randomize(num,n)[i]);	
//		}
		
		for (int i : randomize(num, n)) {
			for (String j : str) {
				System.out.println(i+" "+j);
			}
		}
		
//		System.out.print(Arrays.toString(str));
	}

	private static int[] randomize(int[] str, int n) {
		Random rn= new Random();	
		for (int i = n-1; i > 0; i--) {
			int j= rn.nextInt(12)+1;
			int temp=str[i];
			str[i]=str[j];
			str[j]=temp;
		}
//		System.out.println(Arrays.toString(str));
		return str;
	}
	
	

}
