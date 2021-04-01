package day5_unary_assignment_relational_Operators;

public class task19_incrementDecrement {

	public static void main(String[] args) {
		int a=50;
		int result = --a + a++ + a-- + a++;
		System.out.println(a);
		
		// a in memory : 50 -> 49 -> 50 -> 49 -> 50
		// result	   : 49  + 49 +  50  + 49  = 197

	}

}
