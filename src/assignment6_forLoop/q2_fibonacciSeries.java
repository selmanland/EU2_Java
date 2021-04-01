package assignment6_forLoop;

public class q2_fibonacciSeries {

	public static void main(String[] args) {
		// q2 fibonacci series

		int temp = 0;
		int num1 = 0, num2 = 1;
		int howManyNumberRow=10;
		
		System.out.print(num1 + ", " + num2);

		for (int i = 1; i <= howManyNumberRow-2; i++) {

			temp = num1 + num2;
			System.out.print(" " + temp);
			num1 = num2;
			num2 = temp;

		}

	}
}
