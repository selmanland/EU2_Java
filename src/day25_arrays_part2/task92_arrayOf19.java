package day25_arrays_part2;

import java.util.Arrays;

public class task92_arrayOf19 {

	public static void main(String[] args) {

		int constant = 19;

		int ary[] = new int[10];

		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1;

		}

		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]*constant);
		}
		System.out.println(Arrays.toString(ary));

	}

}
