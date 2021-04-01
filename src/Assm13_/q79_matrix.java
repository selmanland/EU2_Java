package Assm13_;

import java.util.Arrays;

public class q79_matrix {

	public static void main(String[] args) {


		int[][] numbers = {{1,1,1} , {1,1,2}};
		int n = 5;
		
		System.out.println(Arrays.deepToString(matrix(numbers, n)));
		

	}
	
	public static int[][] matrix(int[][] nums, int times){
		
		for(int i=0; i<nums.length; i++) {
			for(int k=0; k<3; k++) {
				nums[i][k] = nums[i][k]*times;
			}
		}
		
		return nums;	
	}

}
