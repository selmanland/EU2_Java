package variousExercise;

public class lab4_q3 {

	public static void main(String[] args) {
		
		int [] x = {1,2,3};
		int [] y = {3};
		
		System.out.println(checkFirstLast(x, y));

	}
	public static boolean checkFirstLast(int[] arr1, int[] arr2) {
		
		boolean b = false;
		
		if(arr1.length>1 && arr2.length>1) {
			if(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]) {
				b = true;
			}
		}
			if(arr1.length<=1) {
				System.out.println("array1 is not a valid array");
			}else if(arr2.length<=1) {
				System.out.println("array2 is not a valid array");
			}
		
		return b;
	}

}
