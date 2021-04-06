package assignment6_forLoop;

import java.util.Scanner;

public class q10_drawPattern {

	public static void main(String[] args) {
		//q10

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	 
	    int rows = sc.nextInt(); 

		for (int i = 1; i <= rows; i++) {
			System.out.print("#");

			for (int k = 1; k <= 1 * i - 1; k++) {
				System.out.print(" ");
			}
			System.out.print("#");			

			System.out.println();
		}
		
/**
for > if we know the exact number of iteration
while > if we want JVM to run based on condition
do/while > if we want want JVM to do some action first and then check the condition
 */

	}

}
