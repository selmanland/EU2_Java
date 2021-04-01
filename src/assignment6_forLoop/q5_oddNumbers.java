package assignment6_forLoop;

public class q5_oddNumbers {

	public static void main(String[] args) {
		// q5 Odd Numbers with comma-separated form

		int num = 16;
		int i = 1;

		if (num % 2 == 0) {

			while (i < num) {
				if (i % 2 != 0) {
					System.out.print(i);
				} else {
					System.out.print(",");
				}
				i++;
			}

		} else {
			while (i <= num) {
				if (i % 2 != 0) {
					System.out.print(i);
				} else {
					System.out.print(",");
				}
				i++;
			}

		}
	}
}