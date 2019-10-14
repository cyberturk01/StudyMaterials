package replit;

public class JavaTest {

	public static void main(String[] args) {
		new JavaTest().print(); // no problem
		
		int a[] = { 1,2,053,4};
		int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
		System.out.print(a[3]==b[0][2] );// true
		System.out.print(" " + (a[2]==b[2][1])); 
		//true a[2]=>053 octal value =>43 == 43
		
		int c[] = {}; 
		System.out.print(c instanceof Object);// true
	}
	
	public void print(){ 
		int value = 8;
		System.out.print(value);
	} 


}
