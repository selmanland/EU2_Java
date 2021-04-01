package Assm11_;

import java.util.Arrays;

public class Assm11_q48_BinaryNumber {

	public static void main(String[] args) {

		int num = 35;

		int i = 0;

		int[] bin = new int[8];
		bin[0] = 0;

		while (num > 0) {

			bin[i++] = num % 2;

			num = num / 2;
		}
		int[] binary = new int[8];
		int count = 0;
		
		for (int j = 7; j >= 0; j--) {
//			System.out.print(bin[j]);
			binary[count] = bin[j];
			count++;
		}
		System.out.println(Arrays.toString(binary));

	}

}
