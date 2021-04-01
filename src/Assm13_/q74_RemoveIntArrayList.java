package Assm13_;

import java.util.ArrayList;

public class q74_RemoveIntArrayList {

	public static void main(String[] args) {
//		This method gets an arraylist of Integers and a number(Integer).it returns an arraylist. 
//		It removes any instance of the number it gets from the arraylist

		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(3);
		ints.add(4);
		ints.add(3);
		ints.add(3);
		

		int number = 4;

		System.out.println(removeIntNumber(ints, number));

	}

	public static ArrayList<Integer> removeIntNumber(ArrayList<Integer> arr, int num) {

		ArrayList<Integer> newArr = new ArrayList<>();
		
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == num) {
				
			}else {
				newArr.add(arr.get(i));
			}
		}

		return newArr;
	}

}
