package Assm11_;

public class Assm11_q36_5To5 {

	public static void main(String[] args) {
//		Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
//		If no consecutive 5s or no 5s are detected in your code then print false

		int[] nums = { 1, 4, 4, 5, 5};
		
		nextTo(nums);

	}

	public static void nextTo(int[] nums) {	
		boolean b = false;

		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==5 && nums[i+1]==5) {
				b=true;
				break;
				
			}else {
				b=false;
			}
		}
		System.out.println(b);

	}
}