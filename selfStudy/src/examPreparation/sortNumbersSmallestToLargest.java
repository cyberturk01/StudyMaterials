package examPreparation;

public class sortNumbersSmallestToLargest {

	public static void main(String[] args) {
//		java program to sort numbers from smallest to highest order
		int[]num=new int[] {3,1,4,6,7,5,2,9,8,10,12,24,45,11,11};
//							0,1,2,3,4,5,6,7,8,9
//							1,3,4,2,5,6,7,8,9,10
		int len=num.length;
		int swap=Integer.MIN_VALUE;
		System.out.println(swap);
		boolean flag=true;
//		int count=0;
		while(flag) {
			flag=false;
			for (int i = 0; i < len-1; i++) {
				if(num[i]>num[i+1]) {					
					swap=num[i+1]; //1
					num[i+1]=num[i]; //3
					num[i]=swap; //1
					flag=true;
				}				
			}				
//			System.out.println(count++);
		}
		for (int deger : num) {
			System.out.print(deger+" ");	
		}
		
	}

}
