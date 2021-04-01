package Assm12_;

import java.util.ArrayList;

public class Assm12_q65_removeAll {

	public static void main(String[] args) {
//		Create a method that is called removeAll takes two parameters: an ArrayList of Strings called wordList, 
//		and a String called targetWord and returns nothing

		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("Cyber");
		wordList.add("Cybertek");
		wordList.add("Cybertek School");
		ArrayList<String> targetWord = new ArrayList<String>();
		targetWord.add("Cyber");
		targetWord.add("Cybertek");
		
		System.out.println(removeAll(wordList, targetWord));
		
		
	}
	public static ArrayList<String> removeAll(ArrayList<String> arr1, ArrayList<String> arr2){
		
		for(int i=0; i<arr1.size(); i++) {
			if(arr1.get(i).equals(arr2.get(i))) {
				arr1.remove(i);
			}
		}
		for(int i=0; i<arr1.size(); i++) {
			if(arr1.get(i).equals(arr2.get(i+1))) {
				arr1.remove(i);
			}
		}
		
		return arr1;
		
	}

}
