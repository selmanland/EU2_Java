package day25_arrays_part2;

import java.util.Random;

public class task91_arrayWithRandom {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100);

			System.out.print(nums[i] + ", ");
		}

	}
}