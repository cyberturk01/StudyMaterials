package replitArrays;

public class SimplePrintMethod {
	 public static void printHollowRect(){
		   
			   for (int j = 0; j < 5; j++) {
				   System.out.print("*");	
			   }
			   System.out.println();
			   for (int j = 0; j < 3; j++) {
				   System.out.println("*   *");
			   }
			   for (int j = 0; j < 5; j++) {
				   System.out.print("*");	
			   }
		   
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }
}
