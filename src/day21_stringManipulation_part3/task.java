package day21_stringManipulation_part3;

public class task {

	public static void main(String[] args) {
		
		String str = " 342 ";		
		System.out.println("|" + str.trim() + "|");
		System.out.println(str.replaceAll(" ", "|"));

	}

}
