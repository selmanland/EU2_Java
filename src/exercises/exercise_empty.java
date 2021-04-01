package exercises;

public class exercise_empty {

	public static void main(String[] args) {
		
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
		deCode(str1);

	}
	public static String deCode(String sentence) {
		
		String str = "";
		
		for(int i=0; i<sentence.length(); i++) {
			if(Character.isAlphabetic(sentence.charAt(i)) || sentence.charAt(i) == ' ') {
				str += sentence.charAt(i);
			}
		}
		String[] arr = str.split(" ");
		
		for(String each : arr) {
			System.out.print(getDigit(each) + " ");
		}		
		
		return str;
	}
	public static String getDigit(String each) {
		
		String str = each.toLowerCase();
		
		switch (str) {
		
		case "zero": return "0";
		case "one": return "1";
		case "two": return "2";
		case "three": return "3";
		case "four": return "4";
		case "five": return "5";
		case "six": return "6";
		case "seven": return "7";
		case "eight": return "8";
		case "nine": return "9";
		default: return "";		
		}		
		
	}

}
