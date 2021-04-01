package Assm11_;

public class Assm11_q38_ArrEvenNums {

	public static void main(String[] args) {
//		Given an array nums, calculate the count of even numbers in nums and print out to console.

		int[] nums = { 2, 2, 0, 3, 5 };

		evenNums(nums);

	}

	public static void evenNums(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
