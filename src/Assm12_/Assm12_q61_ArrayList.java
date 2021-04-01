package Assm12_;


import java.util.ArrayList;


public class Assm12_q61_ArrayList {

	public static void main(String[] args) {
//		Write a method that will take an argument of String ArrayLists called words, 
//		and then set the 0th and 2nd indexes to be "git" and "gud" respectively

		ArrayList<String> words = new ArrayList<String>();
		words.add("Cybertek");
		words.add("School");
		words.add("SDET");
		words.add("Job in London");
		
		method(words);
		
		
	}
	public static void method(ArrayList<String> words) {
		
		words.set(0, "git");
		words.set(2, "gud");
		
		System.out.println(words);
		
	}

}
