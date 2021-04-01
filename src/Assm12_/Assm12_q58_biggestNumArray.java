package Assm12_;

import java.util.Arrays;

public class Assm12_q58_biggestNumArray {

	public static void main(String[] args) {
//		Given a 2d array of ints, find the biggest number(integer) and replace 
//		all array values on the biggest number in the array then print an array

		int[][] nums = { { 1, 2, 3 }, { 5, 33, 9 } };

		int bigNum = nums[0][0];

		for (int i = 0; i < nums.length; i++) {
			for (int k = 0; k < nums[0].length; k++) {
				if (nums[i][k] > bigNum) {
					bigNum = nums[i][k];
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int k = 0; k < nums[0].length; k++) {

				nums[i][k] = bigNum;
			}
		}
		System.out.println(Arrays.deepToString(nums));
	}
}
