package exercises;

public class parse_Exercise_task97 {

	public static void main(String[] args) {

		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		System.out.println(java(str));

	}

	public static String java(String sentence) {
		
		String s = "";
		
		for(int i=0; i<sentence.length(); i++) {
			if(Character.isAlphabetic(sentence.charAt(i)) || sentence.charAt(i) == ' ') {
				s += sentence.charAt(i);
			}
		}
		return s;
	}
}
