package exercises;

import java.util.ArrayList;

public class arr_exercise {

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
		
		System.out.println(nums.toString());

		mystery1(nums);

	}

	public static void mystery1(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) < list.get(i - 1)) {
				int element = list.get(i);
				list.remove(i);
				list.add(0, element);
			}

		}
		System.out.println(list);

	}

}
