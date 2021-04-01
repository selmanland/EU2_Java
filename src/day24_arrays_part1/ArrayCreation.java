package day24_arrays_part1;

public class ArrayCreation {

	public static void main(String[] args) {

		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 50;

		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		System.out.println("===========");

		int avgScore2 = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5;
		System.out.println("Average score for array is " + avgScore2);
		System.out.println("==================");

		int[] money = { 10, 20, 5, 50, 100, 200, 20, 10, 20, 10, 5, 20, 50, 20, 10 };
		int sum = 0;
		for (int i = 0; i < money.length; i++) {
			sum = sum + money[i];

		}
		System.out.println("Total Money in my pocket is $" + sum);
		System.out.println("Average Money in my pocket is $" + sum/money.length);
	}

}
