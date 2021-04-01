package Assm13_;

public class q80_cricketScores {

	public static void main(String[] args) {

		Short[] scores = { 51, 85, 32, 0, 98, 157, 82, 101, 64, 249 };

		cricketScores(scores);
	}

	public static void cricketScores(Short[] score) {

		int countHalf = 0;
		int countCentury = 0;
		int countDouble = 0;

		for (Short value : score) {
			if (value >= 50 && value < 100) {
				countHalf++;
			} else if (value >= 100 && value < 200) {
				countCentury++;
			} else if (value >= 200) {
				countDouble++;
			}
		}
		System.out.println("Number of half-centuries : " + countHalf);
		System.out.println("Number of centuries : " + countCentury);
		System.out.println("Number of double-centuries : " + countDouble);

	}

}
