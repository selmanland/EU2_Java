package Assm10_;

public class Assm10_q25_mergeStrings {

	public static void main(String[] args) {
//		When gears merge and work together, one tooth from each one goes in order.
//		Write a method mergeStrings that will return the strings merged, 
//		one letter at a time, starting with one. Please note one and two can be of different lengths

		String s1 = "java";
		String s2 = "selenium";

		String dummy = "";

		if (s1.length() < s2.length()) {
			for (int i = 0; i < s2.length(); i++) {

				while (i <= s1.length()) {
					dummy += s1.charAt(i) + s2.charAt(i);
					System.out.println(dummy);
				}
			}
			dummy += s2.substring(s1.length());

		} else if (s2.length() < s1.length()) {
			for (int i = 0; i < s1.length(); i++) {
				while (i <= s2.length()) {
					dummy += s1.charAt(i) + s2.charAt(i);
				}
				dummy += s1.substring(s2.length());
			}
		} else {
			for (int i = 0; i < s1.length(); i++) {
				dummy += s1.charAt(i) + s2.charAt(i);
			}
		}
		System.out.println(dummy);

	}
}