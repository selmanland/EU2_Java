package day31_arrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();		
		System.out.println(nums.size());	// capacity is 10 but size is ZERO bc not assigned anything yet
		
		System.out.println(nums.isEmpty());	// shows if its EMPTY or not
		System.out.println(nums.size()==0);
		System.out.println("--------------------");
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		
		nums.remove(5);						// removes the specified index number from the list
		System.out.println(nums.toString());
		
		// Integer n1 = new Integer(5);	// to remove 5 value from ArrayList first convert 5 to object
		Integer n2 = Integer.valueOf(5);
		
		System.out.println(nums.remove(n2));
		System.out.println(nums.toString());
		
		nums.remove(Integer.valueOf(44));		// first 44 to object
		System.out.println(nums.toString());	// then removed 44 object from ArrayList
		

	}

}
