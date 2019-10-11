package examPreparation;

public class sortNumbersSmallestToLargest {

	public static void main(String[] args) {
//		java program to sort numbers from smallest to highest order
		int[]num=new int[] {3,1,4,6,7,5,2,9,8,10};
		int len=num.length;
		int swap=0;
		boolean flag=false;
		while(flag==false) {
			flag=true;
			for (int i = 0; i < len-1; i++) {
				if(num[i]>num[i+1]) {
					swap=num[i+1];
					num[i+1]=num[i];
					num[i]=swap;
					flag=false;
				}
			}
			
		}
		for (int i : num) {
			System.out.print(i+" ");	
		}
		
	}

}
