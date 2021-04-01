package Assm10_;

public class assm10_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java";
		String s2 = "selenium";
		String dummy = "";

		if (s1.length() < s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				dummy = dummy + s1.charAt(i) + s2.charAt(i);
			}
			dummy = dummy + s2.substring(s1.length());
			
		} else if (s1.length() > s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				dummy = dummy + s1.charAt(i) + s2.charAt(i);
			}
			dummy = dummy + s1.substring(s2.length());
			
		} else {
			for(int i=0; i<s1.length(); i++) {
				dummy = dummy + s1.charAt(i) + s2.charAt(i);
			}
		}
		
		System.out.println(dummy);

	}

}
