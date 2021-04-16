package Lab2;

import java.util.Scanner;

public class q3_sumNumbers {

	public static void main(String[] args) {
/*
Write a program that asks the user for a positive nonzero integer value. 
The program should use a loop to get the sum of all the integers from 1 up to the number entered
 */

		sumNumbers();

	}

	public static void sumNumbers() {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a positive integer number please : ");
		int num = userInput.nextInt();
		
		int sum = 0; //create an empty bucket to sum numbers
		
		if(num > 0) {
			
			for (int i = 1; i <= num; i++) {
				sum = i + sum;

			}
			System.out.println("Sum up to " + num + " is :" + sum);
            

        }else if (num <= 0) {
        	//after a non-positive number
            System.out.println("You should enter only none-zero positive numbers!");
            
        }

}
}