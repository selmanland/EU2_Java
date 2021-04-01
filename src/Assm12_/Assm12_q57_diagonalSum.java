package Assm12_;

public class Assm12_q57_diagonalSum {

	public static void main(String[] args) {
//		Given a square matrix, calculate the absolute difference between the sums of its diagonals.

		int[][] matrix = {{1,2,3}, {4,5,6}, {9,8,9}};
		
		int leftSum = matrix[0][0] + matrix[1][1] + matrix[2][2];		
//		System.out.println(leftSum);
		
		int rightSum = matrix[0][2] + matrix[1][1] + matrix[2][0];
//		System.out.println(rightSum);
		
		if(leftSum>rightSum) {
			System.out.println(leftSum-rightSum);
		}else if(leftSum<rightSum){
			System.out.println(rightSum-leftSum);
		}else {
			System.out.println("equal");
		}
		
		
	}

}
