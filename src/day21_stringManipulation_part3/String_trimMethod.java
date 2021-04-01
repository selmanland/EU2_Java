package day21_stringManipulation_part3;

public class String_trimMethod {

	public static void main(String[] args) {
		
		// trim method removes white spaces from both ends of a string
		
		String str = "    Programming is fun    ";
		String str2 = "Programming is fun     ";
		String str3 = "        Prog ram     ming   is   fun    ";
		System.out.println(str.trim());
		System.out.println(str2.trim());
		System.out.println(str3.trim());

	}

}
