package codingBat;

public class MakeBricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeBricks(5, 10, 40));
		System.out.println(makeBricks2(3, 1, 41));
	}

	private static boolean makeBricks(int small, int big, int goal) {
		// TODO Auto-generated method stub
		int big2= goal/5;
		goal-=Math.min(big, big2)*5;
		if(goal>small) {
			return false;
		}
		return true;
	}
	private static boolean makeBricks2(int small, int big, int goal) {
		  int result= goal%10;
		  if(goal>small+(big*5)){
		    return false;
		  }
		  if(result<5 && small < result){
		    return false;
		  }else if(result>5 && result > small+5){
		    return false;
		  }
		  return true;
	}
	

}
