package day23_stringManipulation;

import java.util.Random;

public class task84_tenCoinToss {

	public static void main(String[] args) {
		// ten times coin toss

		Random sc = new Random();		

		for (int i = 1; i <= 10; i++) {

			if (sc.nextBoolean() == true) {
				System.out.println("Heads");
			} else {
				System.out.println("Tails");
			}

		}
	}
}
