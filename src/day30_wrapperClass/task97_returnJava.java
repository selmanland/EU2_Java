package day30_wrapperClass;

public class task97_returnJava {

	public static void main(String[] args) {
		// Write a method that returns : Welcome to core Java

		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		System.out.println(isAlphabetic(str));

	}

	public static String isAlphabetic(String word) {

		String str = "";

		for (int i = 0; i < word.length(); i++) {
			if (Character.isAlphabetic(word.charAt(i)) || word.charAt(i) == ' ') {
				str = str + word.charAt(i);
			}
		}

		return str;
	}

}
