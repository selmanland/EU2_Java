package Assm12_;

import java.util.ArrayList;

public class Assm12_q67_timesTwo {

	public static void main(String[] args) {
//		Create a method that is called timesTwo takes in a single parameter - 
//		an ArrayList of Integers called nums returns nothing
//
//		This method should take the ArrayList parameter and multiply every value by two.

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(9);
		nums.add(12);
		nums.add(18);
		
		timesTwo(nums);
		
		
	}
	public static void timesTwo(ArrayList<Integer> arr) {
		
		
		for(int i=0; i<arr.size(); i++) {
			arr.set(i, arr.get(i)*2);			
		}
		System.out.println(arr);
	}

}
