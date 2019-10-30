package replit;

public class UtopianTree116 {

	public static void main(String[] args) {
		int growth=0;
		for (int i = 1; i <= 10; i++) {
			if(i<=3) {
				System.out.println("year "+i+" - growth "+1+" cm");
				System.out.println("tree size: "+(growth+=1)+"cm");
			}else {
				System.out.println("year "+i+" - growth "+2+" cm");
				System.out.println("tree size: "+(growth+=2)+" cm");
			}
		}
	}

}
