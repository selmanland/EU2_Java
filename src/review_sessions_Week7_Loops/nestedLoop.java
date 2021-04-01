package review_sessions_Week7_Loops;

public class nestedLoop {

	public static void main(String[] args) {
		
		for(int outer=1; outer<=5; outer++) {
			System.out.println("Outer: " + outer + " ");
			
			for(int inner=0; inner<=10; inner++) {
				System.out.print(inner + " ");
			}
			System.out.println();
		}

	}

}
