package codingBat;

public class MakeChocolate {
	/**
	 * We want make a package of goal kilos of chocolate. 
	 * We have small bars (1 kilo each) and big bars (5 kilos each). 
	 * Return the number of small bars to use,
	 * assuming we always use big bars before small bars. 
	 * Return -1 if it can't be done.
	 */
	public static void main(String[] args) {
		System.out.println(makeChocolate(4, 1, 9)); //4
		System.out.println(makeChocolate(4, 1, 10)); //-1
		System.out.println(makeChocolate(4, 1, 7)); //2
	}
	public static int makeChocolate(int small, int big, int goal) {
		int result=(goal/5);
//		System.out.println(result);
		goal = goal- Math.min(big, result) *5;
		if(goal>small) {
			return -1;
		}
		return goal;
	}

}
