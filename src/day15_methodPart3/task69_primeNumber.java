package day15_methodPart3;

public class task69_primeNumber {

	public static void main(String[] args) {
		// prime number

		int number = 13;

		if (isPrime(number)) {
			System.out.println(number + " is a PRIME NUMBER");
		} else {
			System.out.println(number + " is NOT a prime number");
		}
	}

	public static boolean isPrime(int number) {
		boolean flag = true;

		if (number == 0 || number == 1) {

			flag = false;

		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}

		}
		return flag;
	}
}
