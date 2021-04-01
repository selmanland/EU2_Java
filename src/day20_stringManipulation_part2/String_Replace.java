package day20_stringManipulation_part2;

public class String_Replace {

	public static void main(String[] args) {

		String str = "Moscow is the capital of Russia";

		str = str.replace("Moscow", "London").replace("Russia", "UK");		
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";		
		String company = "capitalone";
		String newEmail = email.replace("gmail", "capitalone");
		System.out.println(newEmail);
		

	}

}
