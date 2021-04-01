package Assm12_;

import java.util.ArrayList;

public class Assm12_q64_combineAllArrayList {

	public static void main(String[] args) {
//		Create a method that is called combineAL takes two parameters: 
//		an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2 
//		and returns an ArrayList

		ArrayList<String> wordList1 = new ArrayList<>();
		wordList1.add("Cyber");
		wordList1.add("Cybertek");
		wordList1.add("Cybertek School");
		ArrayList<String> wordList2 = new ArrayList<>();
		wordList2.add("London");
		wordList2.add("CyberCompany");
		wordList2.add("New World");
		
		System.out.println(newArr(wordList1, wordList2));


	}
	public static ArrayList<String> newArr(ArrayList<String> arr1, ArrayList<String> arr2) {
		
		ArrayList<String> listNew = new ArrayList<>();
		
		for(int i=0; i<arr1.size(); i++) {
			listNew.add(arr1.get(i));
		}
		for(int i=0; i<arr2.size(); i++) {
			listNew.add(arr2.get(i));
		}		
		
		return listNew;
	}

}
