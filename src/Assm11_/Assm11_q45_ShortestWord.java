package Assm11_;

public class Assm11_q45_ShortestWord {

	public static void main(String[] args) {
		// Write a program that will print the shortest word in the given array str.

		String[] str = { "java", "cable", "red", "vivid", "remedy", "grace" };

		String shortest = str[0];

		for (String each : str) {

			if (each.length() < shortest.length()) {
				shortest = each;
			}
		}
		System.out.println(shortest);

	}

}
