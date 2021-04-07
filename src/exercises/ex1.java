package exercises;

import java.text.DecimalFormat;

public class ex1 {

	public static void main(String[] args) {

		DecimalFormat formatter = new DecimalFormat("00");

		// Simulate the clock.
		for (int hours = 1; hours <= 1; hours++) {
			for (int minutes = 0; minutes <= 2; minutes++) {
				for (int seconds = 0; seconds <= 59; seconds++) {
					System.out.println(formatter.format(hours) + ":" + formatter.format(minutes) + ":"
							+ formatter.format(seconds));
				}
			}
		}
	}

}
