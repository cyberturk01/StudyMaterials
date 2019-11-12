package replitArrays;

import java.util.Arrays;

public class ChessBoard {
	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		String letter="abcdefgh";
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				chessBoard[i][j]=(i+1)+""+letter.charAt(j);
			}
		}
		
		System.out.println(Arrays.deepToString(chessBoard));
	}
}
