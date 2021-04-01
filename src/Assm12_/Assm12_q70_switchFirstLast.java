package Assm12_;

import java.util.Arrays;

public class Assm12_q70_switchFirstLast {

	public static void main(String[] args) {
//		Switch the last element in an array with the first and return the array.

		int[] arr = {1,2,3,4};
		
		System.out.println(Arrays.toString(do_switch(arr)));
		
		
	}
	public static int[] do_switch(int[] nums) {
	
	int temp = nums[0];
	nums[0] = nums[3];
	nums[3] = temp;
	
	return nums;
	}

}
