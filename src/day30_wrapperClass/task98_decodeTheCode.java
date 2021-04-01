package day30_wrapperClass;

public class task98_decodeTheCode {

	public static void main(String[] args) {
		// Change the implementation of decodeTheCode(String) method such that on
		// executing class,
		// following output is shown:

		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(decodeTheCode(str1));
        
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        System.out.println(decodeTheCode(str2));      
        
	}

	public static String decodeTheCode(String s) {
		
		String str = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
				
				str = str + s.charAt(i);
			}
		}
		
		String[] arr = str.split(" ");
		
		String str2= "";
		for(String value : arr) { // 
			
			str2 = str2 + getDigit(value) + " ";			
		}		
		return str2;
	
	}
	public static String getDigit(String st) { //ONE
		
		switch(st.toLowerCase()) {
		
		case "zero":
			return "0";
		case "one":
			return "1";
		case "two":
			return "2";
		case "three":
			return "3";
		case "four":
			return "4";
		case "five":
			return "5";
		case "six":
			return "6";
		case "seven":
			return "7";
		case "eight":
			return "8";
		case "nine":
			return "9";
		default:
			return "";
					
		}
	}
}