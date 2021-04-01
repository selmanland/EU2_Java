package Assm13_;

import java.util.ArrayList;

public class q76_ArrayListTwice {

	public static void main(String[] args) {
//		Create a method that is called "twoTimes" takes in a single parameter - an ArrayList of Integers 
//		and returns a new ArrayList of Integers
//
//		This method should create a new ArrayList of Integers that contains every value 
//		of the ArrayList parameter repeated twice.

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(7);

		System.out.println(twoTimes(nums));

	}

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> array) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < array.size(); i++) {
			numbers.add(array.get(i));
			numbers.add(array.get(i));
		}

		return numbers;
	}

}
