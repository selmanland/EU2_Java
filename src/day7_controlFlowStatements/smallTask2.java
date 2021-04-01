package day7_controlFlowStatements;

public class smallTask2 {

	public static void main(String[] args) {
		// Write an if-else statement that assigns 20 to variable y if the variable x is greater than 100.
		// Otherwise, it should assign 0 to the variable y
		
		int x, y;
		x=120;
		
		if (x>100) {
			y=20;
		}else {
			y=0;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("**************************");
		
		// Write an if-else statement that assigns 1 to x when y is equal to 100.
		// Otherwise, it should assign 0 to x.
		int x2, y2;
		y2=100;
		
		if(y2==100) {
			x2=1;
	}else {
		x2=0;
	}

		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
		System.out.println("**************************");


	// Write an if-else statement that assign 0 to variable b and assigns 1 to variable c 
	// if the variable a is less than 10. Otherwise, it should assign -99 to variable b and assign 0 to variable c

	int a, b, c;
	a=10;
	
	if(a<10) {
	b=0;
	c=1;
		
}else {
	b=-99;
	c=0;
}
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	}
}