package day31_arrayList;

import java.util.ArrayList;

public class arrayList_Intro {

	public static void main(String[] args) {
		
		// creating an ArrayList
		ArrayList<String> names = new ArrayList<>();		
		ArrayList<Integer> nums = new ArrayList<>();
		
		// Assigning values to ArrayList
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		// nums.add(new Integer("100")); Not common but can use also
		
		// Reading from arrayList
		names.get(0);
		System.out.println(names.get(0));	// retrieving based on index no
		System.out.println(names.get(1));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());

		System.out.println(names.toString());
		System.out.println(nums.toString());
	}

}
