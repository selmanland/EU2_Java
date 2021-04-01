package Lab3_String_Manipulation;

public class q17_palindRomeString {

	public static void main(String[] args) {
		// q17 Write a method that accepts a string and returns true if the string is palindrome.

		String str = "Taco cat";
		String strRev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			strRev = strRev + str.charAt(i);
		}
		
		if(str.replace(" ", "").equalsIgnoreCase(strRev.replace(" ", ""))) {
			System.out.println("strRev is \"" + strRev + "\"");
			System.out.println(true);			
		}else {
			System.out.println("strRev is \"" + strRev + "\"");
			System.out.println(false);
		}
	}

}
