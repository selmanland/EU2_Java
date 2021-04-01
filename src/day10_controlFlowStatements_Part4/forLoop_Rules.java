package day10_controlFlowStatements_Part4;

public class forLoop_Rules {

	public static void main(String[] args) {
		
		// 1st rule: Creating an infinite loop
		// components of the for loop are each optional
		
//		for(  ;  ; ) {
//			System.out.println("Hello");
//		}
//		int i=1;
		
//		for(  ; i<=5; i++) {
//			System.out.println(i);
//		}
//		for(  ;  ; i++) {
//			System.out.println(i);
//		}
		
		// 2nd rule: Adding Multiple Terms to the for statement

		int x=0;
		
		for (long y=0, z=4; x<5 && y<10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.println(x);
		System.out.println(x+1);
		
		
		// 3rd rule: Redeclaring a variable in the init block
		
	/*	int x=0;
		
		for(long y=0, x=4; x<5 && y<10; x++, y++) {//not compile because duplicate x variable
			System.out.println("Hello");
		}*/
		
		int a=0;
		long b=0;
		
		for (b=1, a=3; a<5 && b<10; a++, b++) { //Reassigning new values to a and b variables
			System.out.println("Hello");
		}
		
		// 4th rule: Using incompatible data types in the init block
		//          the variables in the init block must all be of the same data type
		
		//for (long s=1, int d=3; d<5 && s<10; d++, s++) { // different data types NOT compile
		//	System.out.println("Hello");
//	}
		// 5th rule: Using loop variables outside the loop
		
		for(long r=0, v=4; v<5 && r<10; v++, r++) {
			System.out.println("Hello");  // NOT compile
		}
		
		}

}
