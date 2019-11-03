package replitArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
//	    for (int i = 0; i < binary.length; i++) {
//			binary[i]=0;
//	    }	
	    int pow=8;
	    int pow2=7;
    	for (int i = 0; i < binary.length; i++) {
			binary[i]= decimal%(int)Math.pow(2, pow--)/(int)Math.pow(2, pow2--);
		}
	    System.out.println(Arrays.toString(binary));
	    input.close();
	}
//	if(((decimal/128)%128)%2==1){  //128 //128
//		binary[0]=1;
//	}
//	if(((decimal/64)%64)%2==1) { //192 //64
//		binary[1]=1;
//	}
//	if(((decimal/32)%32)%2==1) { //224 //32
//		binary[2]=1;
//	}
//	if(((decimal/16)%16)%2==1) { //240 //16
//		binary[3]=1;
//	}
//	if(((decimal/8)%8)%2==1) { //248  //8
//		binary[4]=1;
//	}
//	if(((decimal/4)%4)%2==1) { //252 //4
//		binary[5]=1;
//	}
//	if(((decimal/2)%2)%2==1) {//254  /2
//		binary[6]=1;
//	}
//	if(((decimal%2))%2!=0) { //255  /1
//		binary[7]=1;
//	}
	
	

}
