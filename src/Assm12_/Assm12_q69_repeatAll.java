package Assm12_;

import java.util.ArrayList;

public class Assm12_q69_repeatAll {

	public static void main(String[] args) {
//		Create a method that: is called repeatAL takes in a single parameter - 
//		an ArrayList of Booleans and returns nothing
//		This method should modify its ArrayList parameter by repeating its ArrayList values.

		ArrayList<Boolean> fact = new ArrayList<Boolean>();
		fact.add(true);
		fact.add(false);
		fact.add(false);

		repeatAll(fact);

	}

	public static void repeatAll(ArrayList<Boolean> b) {

		for (int i = 0; i < b.size(); i++) {
			b.get(i);

		}
		System.out.println(b);
	}

}
