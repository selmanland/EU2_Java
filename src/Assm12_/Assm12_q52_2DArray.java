package Assm12_;

public class Assm12_q52_2DArray {

	public static void main(String[] args) {
//		You get a 2d array and you need to find how many two matches there are and 
//		return the number(int) of matches you found.

		int[][] nums = { { 2, 2, 1, 3, 4, 5 }, { 5, 2, 3, 3, 4, 5 }, { 3, 2, 3, 1, 4, 5 } };

		int row = 3;
		int column = 6;
		int counter = 0;
//		int temp = 0;
		
		for (int i = 0; i < row; i++) {
			for(int k=0; k<column-1; k++) {
				if(nums[i][k] == nums[i][k+1]) {
					counter++;
				}
			}
		}
		System.out.println(counter);

	}

}
