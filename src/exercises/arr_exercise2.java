package exercises;

public class arr_exercise2 {

	public static void main(String[] args) {

		int[] x = {12,23,54,22,15,88,99};
		int[] y = { 1, 3, 5 };

		System.out.println(difference(x));
		System.out.println(difference(y));

	}

	public static int difference(int[] arr) {

		int smallest = arr[0];
		int largest = 0;

		for (int each : arr) {
			if (each > largest) {
				largest = each;
			}
		}
		for (int each : arr) {
			if (each < smallest) {
				smallest = each;
			}
		}
		int differ = largest - smallest;

		return differ;
	}

}
