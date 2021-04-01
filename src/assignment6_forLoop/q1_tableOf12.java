package assignment6_forLoop;

public class q1_tableOf12 {

	public static void main(String[] args) {
		// q1 table of 12...

		int x = 12;
		if (x <= 0) {
			System.out.println("please enter a valid positive number");
		} else {

			for (int i = 1; i <= 10; i++) {
				System.out.println(x + " X " + i + " = " + (x * i));
			}
		}

	}

}
