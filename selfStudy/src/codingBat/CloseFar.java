package codingBat;

public class CloseFar {

	public static void main(String[] args) {
		System.out.println(closeFar(1, 2, 10));
	}
	public static boolean closeFar(int a, int b, int c) {
		  return (Math.abs(a-b) <2 && Math.abs(c-a)>1 && Math.abs(c-b)>1) ||
		  		(Math.abs(a-c)<2 && Math.abs(b-a)>1 && Math.abs(b-c)>1);
		}

}
