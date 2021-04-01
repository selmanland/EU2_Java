package Assm10_;

public class Assm10_q24_StringJavaPython {

	public static void main(String[] args) {
//		Given a string, print out true if the number of appearances of "java" anywhere in the string is 
//		equal to the number of appearances of "python" anywhere in the string (case sensitive).

		String str = "What's the difference between java, javascript and python?";
		
		int countJava = 0;
		int countPython = 0;
		
		String str1 = "java";
		String str2 = "python";
		
		for(int i=0; i<str.length()-3; i++) {
			if(str.substring(i, i+4).equals(str1)) {
				countJava++;
			}
		}
		for(int i=0; i<str.length()-5; i++) {
			if(str.substring(i, i+6).equals(str2)) {
				countPython++;
			}
		}
		if(countJava == countPython) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
