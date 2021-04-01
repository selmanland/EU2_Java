package Assm12_;

import java.util.ArrayList;

public class Assm12_q66_appendPosSum {

	public static void main(String[] args) {
//		Create a method that is called appendPosSum takes one parameter: 
//		an ArrayList of Integers and returns an ArrayList of Integers

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(-12);
		nums.add(22);
		nums.add(32);
		nums.add(-42);
		nums.add(52);

		System.out.println(appendPosSum(nums));

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr) {
		int sum = 0;

		ArrayList<Integer> arrNew = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				arrNew.add(arr.get(i));
				sum += arr.get(i);
			}
		}
		arrNew.add(sum);

		return arrNew;
	}

}
