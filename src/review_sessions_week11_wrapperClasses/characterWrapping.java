package review_sessions_week11_wrapperClasses;

public class characterWrapping {

	public static void main(String[] args) {
		
		char ch1 = 'a';

		System.out.println(Character.isLetter(ch1));
		System.out.println(Character.isDigit(ch1));
		System.out.println(Character.isLowerCase(ch1));
		System.out.println(Character.isAlphabetic(ch1));

		char ch2 = '5';

		System.out.println(Character.isDigit(ch2));
		System.out.println(Character.isLetterOrDigit(ch2));

		char ch3 = ' ';

		System.out.println(Character.isWhitespace(ch3));
		System.out.println(Character.isSpaceChar(ch3));


	}

}
