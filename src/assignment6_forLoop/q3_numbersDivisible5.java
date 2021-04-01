package assignment6_forLoop;

public class q3_numbersDivisible5 {

	public static void main(String[] args) {
		// q3 Numbers Divisible by 5...

		System.out.println("numbers up to 100 divisible by 5:");

		for (int n = 1; n <= 100; n++)
			if (n % 5 == 0) {
				System.out.print(n + " ");
			}

	}

}
