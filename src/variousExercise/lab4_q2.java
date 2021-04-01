package variousExercise;

public class lab4_q2 {

	public static void main(String[] args) {

		int [] x = {1,2,3};
		int [] y = {1,2,3,1};
		int [] k = {1};
		
		System.out.println(returnEqual(x));
		System.out.println(returnEqual(y));
		System.out.println(returnEqual(k));
		
		
	}
	public static boolean returnEqual(int [] arr) {
		
		boolean flag = false;
		
		if(arr.length<=1) {
			System.out.println("Not a valid array");
		}else if(arr.length>1 && arr[0]==arr[arr.length-1]) {
			flag= true;
		}else {
			flag = false;
		}
		return flag;
		
	}

}
