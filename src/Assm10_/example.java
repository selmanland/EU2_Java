package Assm10_;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {

		String sample = "We study java not python";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first input=");

		String input1 = sc.next();
		System.out.println();

		System.out.println("Enter a second input=");

		String input2 = sc.next();

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i <= sample.length() - input1.length(); i++) {

			if (sample.substring(i, i + input1.length()).equals(input1)) {

				count1++;
				System.out.println("count1 " + count1);

			}

		}

		for (int i = 0; i <= sample.length() - input2.length(); i++) {

			if (sample.substring(i, i + input2.length()).equals(input2)) {

				count2++;
				System.out.println("count2 " + count2);
			}

		}

		if (count1 == count2) {

			System.out.println(true);

		} else {
			System.out.println(false);
		}

	}

}
