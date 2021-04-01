package variousExercise;

public class L4q10 {

	public static void main(String[] args) {

		int[] x = { 2, 2 };
		int[] y = { 3, 3 };
		int[] z = { 2, 3 };

		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));

	}

	public static boolean contains(int[] arr) {

		boolean flag = false;

		int count2 = 0;
		int count3 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				count2++;
			} else if (arr[i] == 3) {
				count3++;
			}

			if (count2 == 2 || count3 == 2) {
				flag = true;
			} else {
				flag = false;
			}

		}
		return flag;
	}

}
