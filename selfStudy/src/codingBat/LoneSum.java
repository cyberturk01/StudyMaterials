package codingBat;

public class LoneSum {

	public static void main(String[] args) {
		System.out.println(loneSum2(3,2,3));
	}
	public static int loneSum2(int a, int b, int c) {
		if((a==b) && (b==c)) {
			return 0;
		}
		if(a==b) {
			return c;
		}
		if(a==c) {
			return b;
		}
		if(b==c) {
			return a;
		}
		return a+b+c;
	}
	public static int loneSum(int a, int b, int c) {
	    int sum=0;
	    if(a==b && b==c && a==c){
	      sum=0;
	    }else if((a!=b) && (b!=c) && (c!=a)){
	      sum=a+b+c;
	    }else if(a==b){
	      sum=c;
	    }else if(b==c){
	      sum=a;
	    }else{
	      sum=b;
	    }
	    return sum;
	}

}
