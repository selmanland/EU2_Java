package exercises;

import java.util.ArrayList;

public class arrayList_exerc {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(0, -4);
		nums.add(1, 16);
		nums.add(2, 9);
		nums.add(3, 1);
		nums.add(4, 64);
		nums.add(5, 25);
		nums.add(6, 36);
		nums.add(7, 4);
		nums.add(8, 49);
		
		System.out.println(nums.set(4, 11));
		System.out.println(nums.toString());

	}

	
}
