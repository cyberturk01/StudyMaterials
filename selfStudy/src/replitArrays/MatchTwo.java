package replitArrays;

public class MatchTwo {

	public static void main(String[] args) {
		int[][] arr = {
			{2,2,1,3,4,5},
			{5,2,3,3,4,5},
			{3,2,3,1,4,5}
		};

		int matches = 0;
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length-1 ; j++) {
				if(arr[i][j]==arr[i][j+1]) {
					matches++;
				}
			}
		} 

		System.out.print("matches: " + matches);
	}

}
