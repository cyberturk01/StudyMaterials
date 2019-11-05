package codingBat;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJack(19, 21));
		System.out.println(blackJack(21, 19));
		System.out.println(blackJack(19, 22));
	}
	private static int blackJack(int a, int b) {
		int valA=a, valB=b;
		  if(valA>21){
		    valA=0;
		  }
		  if(valB>21){
		    valB=0;
		  }
		  return (valA>valB)? valA: valB;
		  
		  
//		  return Math.max(valA, valB);
		  
//		if(a>21 && b>21) {
//			return 0;
//		}
//		if(a>b && a<=21) {
//			return a;
//		}if(b>a && b<=21) {
//			return b;
//		}
//		if(a<b && b>21) {
//			return a;
//		}
//		if(b<a && a>21) {
//			return b;
//		}
//		
//		return 0;
	}

}
