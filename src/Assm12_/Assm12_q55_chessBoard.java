package Assm12_;

import java.util.Arrays;

public class Assm12_q55_chessBoard {

	public static void main(String[] args) {
	
//		Given an 8x8 two-dimensional array of strings named chessboard. 
//		Initialize values inside an array accordingly to the chessboard. So first element in the array, 
//		chessboard[0][0] should have value "1a", and the last element in the array, 
//		chessboard[7][7] should have value "8h".

		String str = "abcdefgh";
		
		String[][] chessBoard = new String [8][8];
		
		for(int i=0; i<8; i++) {			
			for(int k=0; k<8; k++) {
				chessBoard[i][k] = Integer.toString(i+1) + str.charAt(k);
			}
		}
		System.out.println(Arrays.deepToString(chessBoard));
		
	}

}
