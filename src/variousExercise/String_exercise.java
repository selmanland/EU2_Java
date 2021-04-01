package variousExercise;

public class String_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b = "rumble";
		
		b+= b.concat("4").substring(3, b.length()-1);
		
		System.out.println(b);
		System.out.println("--------------");
		
		String s = "MINIMUM";
		
		System.out.println(s.substring(4,7));
		System.out.println(s.substring(5));
		System.out.println(s.substring(s.indexOf('I', 3)));		
		System.out.println("--------------");
		System.out.println(s.indexOf('I', 3));		
		System.out.println(s.substring(s.indexOf('N')));
	}

}
