package Assm12_;

import java.util.ArrayList;

public class Assm12_q63_ArrayListDoubles {

	public static void main(String[] args) {
//		Write a method that will take an argument of ArrayList of Doubles called doubles, 
//		and remove the first two elements in ArrayList and return the final list

		ArrayList<Double> arr = new ArrayList<>();
		arr.add(12.3);
		arr.add(10.8);
		arr.add(5.5);
		arr.add(8.8);
		
		System.out.println(doubles(arr));

	}

	public static ArrayList<Double> doubles(ArrayList<Double> list) {
		for (int i = 0; i < 2; i++) {
			list.remove(0);

		}

		return list;
	}

}
