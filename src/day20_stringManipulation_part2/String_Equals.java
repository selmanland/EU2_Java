package day20_stringManipulation_part2;

public class String_Equals {

	public static void main(String[] args) {

		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";

		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);

		System.out.println(b1);
		System.out.println(b2);
		
		String s4 = new String("Welcome to Java");
		System.out.println(s1==s4);			// false bc different objects *** B E  C A R E F U L ***
		System.out.println(s1.equals(s4));

	}

}
