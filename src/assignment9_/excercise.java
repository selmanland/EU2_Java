package assignment9_;

public class excercise {

	public static void main(String[] args) {

		String word = "apple";
		System.out.println(reverseVows(word));

	}

	public static String reverseVows(String str) {
		String temp = "";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'o') {
				count++;
				temp = temp + str.charAt(i);

			}else {
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
		
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'o') {
				str.replace(str.charAt(i), temp.charAt(count));
				count--;
				newStr = newStr + str.charAt(i);
				System.out.println(newStr);

			}else {
				newStr = newStr + str.charAt(i);
				System.out.println(newStr);
			}

		}
		return newStr;
	}
}