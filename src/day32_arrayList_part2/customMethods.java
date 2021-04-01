package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);

		printList(numsList); // calling a method accepting as parameter which is ArrayList

		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);

		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));

		ArrayList<Integer> list = getList(25);
		System.out.println(list.toString());

		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		System.out.println(strNums);			// this list all is String
		
		ArrayList<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);			// this list all Integer not String anymore

	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> strN) {
		
		ArrayList<Integer> numArr = new ArrayList<>();
		for(String str : strN) {
			numArr.add(Integer.parseInt(str));
		}
		
		return numArr;
	}

	public static ArrayList<Integer> getRandomList(int size) {

		Random r = new Random();

		ArrayList<Integer> newRandom = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			newRandom.add(r.nextInt(100));
		}

		return newRandom;
	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> newList = new ArrayList<>();

		for (int i = 1; i <= size; i++) {

			newList.add(i);
		}

		return newList;
	}

	public static double sumList(ArrayList<Double> dList) {

		double sum = 0;

		for (Double d : dList)
			sum = sum + d;

		return sum;
	}

	public static void printList(ArrayList<Integer> nums) {

		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();

	}
}