package variousExercise;

public class L4q12 {

	public static void main(String[] args) {
		
		int[] x = {4,1,2,3};
		int[] y = {5,1,3};
		
		System.out.println(howManyOne(x, y));
		

	}
	public static int howManyOne(int[] arr1, int[] arr2) {
		
		int counter = 0;
		
		if(arr1[0]==1) {
			counter++;
		}
		if(arr2[0]==1) {
			counter++;
		}
		return counter;
	}

}
