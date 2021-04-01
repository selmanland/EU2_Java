package Assm13_;

import java.util.ArrayList;

public class q75_SearchMethodArrayList {

	public static void main(String[] args) {
//		Search method accepts ArrayList of Strings and  a String to find and returns a String.
//		It will look for an element within ArrayList that contains the value of the find. 
//		If it finds it, the method needs to return the whole Element value. 
//		If an instance of find doesn't exist return: "search failed

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("one apple");
		arrayList.add("two orange");
		arrayList.add("four banana");

		String word = "three";

		System.out.println(search(arrayList, word));

	}

	private static String search(ArrayList<String> arr, String str) {
		String dummy = "";
		boolean b = false;

		for (String each : arr) {
			for (int i = 0; i < each.length() - str.length() + 1; i++) {
				if (each.substring(i, i + str.length()).equalsIgnoreCase(str)) {
					dummy += each;
					b = true;
					break;
				}
			}
		}
		if (b == true) {
			return dummy;
		} else {
			return "Search Failed";
		}

	}
}
