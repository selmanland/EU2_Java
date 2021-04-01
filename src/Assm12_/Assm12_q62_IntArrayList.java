package Assm12_;

import java.util.ArrayList;

public class Assm12_q62_IntArrayList {

	public static void main(String[] args) {
//		Write a method that will take an argument of ArrayList of Integers called ints, 
//		find and return the sum of all the Integers in ints.

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(5);
		nums.add(8);
		nums.add(16);
		nums.add(3);
		nums.add(12);
		
		method(nums);
		System.out.println(method(nums));
		
	}
	public static int method(ArrayList<Integer> ints) {
		int sum = 0;
		
		for(Integer value : ints) {
			sum += value;
		}
		
		
		return sum ;
	}

}
