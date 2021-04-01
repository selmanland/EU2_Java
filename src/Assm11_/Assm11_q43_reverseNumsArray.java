package Assm11_;

import java.util.Arrays;

public class Assm11_q43_reverseNumsArray {

	public static void main(String[] args) {
//		Given an array nums with 7 integers already assigned, write code to reverse it. 
//		Do not use any additional arrays or Strings.

		int[] nums = { 4, 44, 55, 33, 22 };
		int count = nums.length-1;
		int dummy;

		if (nums.length % 2 != 0) {
			for (int i = 0; i < count; i++) {
				dummy = nums[i];
				nums[i] = nums[count];
				nums[count] = dummy;
				count--;
			}
		}else {
			for(int i=0; i<count; i++) {
				dummy = nums[i];
				nums[i] = nums[count];
				nums[count] = dummy;
				count--;
			}
		}

		System.out.println(Arrays.toString(nums));
	}
}
