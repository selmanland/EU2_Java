package day22_stringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1 = "eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println("---------------");
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println("-----------------");
		
		String title = "Dr Halim";
		
		if(title.startsWith("Mr")) {
			System.out.println("married man");
		}else if(title.startsWith("Mrs")) {
			System.out.println("Married woman");
		}else if(title.startsWith("Ms")) {
			System.out.println("Some woman");
		}else if(title.startsWith("Dr")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown status");
		}

	}

}
