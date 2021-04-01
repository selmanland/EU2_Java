package day14_methods_Part2;

public class task69_primeNumber {

	public static void main(String[] args) {

		int num = 13;
		
		boolean isPrime = true;

		for (int i = 2; i < num; i++) { //Start from 2 not 1 bc prime number divisible only by 1 and itself

			if (num % i == 0) {

				isPrime = false;
				break;

			}
		}
		if (isPrime) {
			System.out.println(num + " is a PRIME NUMBER");
		} else {
			System.out.println(num + " is NOT Prime");
		}

	}

}
