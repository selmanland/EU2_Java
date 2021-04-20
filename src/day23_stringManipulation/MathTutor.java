package day23_stringManipulation;

import java.util.*;


public class MathTutor {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		number1 = rn.nextInt(100);
		number2 = rn.nextInt(100);
		
		System.out.println("What is the answer to the following problem?");
		System.out.println(number1 + "+" + number2 + " = ??");
		
		userAnswer = sc.nextInt();
		
		sum = number1 + number2;
		
		if(userAnswer == sum) {
			System.out.println("GOOD JOB");
		}else {
			System.out.println("Sorry, wrong answer.");
			System.out.println("Correct answer is : " + sum);
		}

		sc.close();
	}

}
