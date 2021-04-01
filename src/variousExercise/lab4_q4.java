package variousExercise;

public class lab4_q4 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {5,1,12,21,4,6};
		
		System.out.println(sumArray(x));
		System.out.println(sumArray(y));

	}
	public static int sumArray(int[] arr) {
		
		int sum = 0;
		
		for(int value : arr) {
			sum = sum + value;
		}
		return sum;
	}

}
