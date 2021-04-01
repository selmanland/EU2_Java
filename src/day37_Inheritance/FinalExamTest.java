package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("How many questions in the exam? ");
		int numQuestions = sc.nextInt();
		
		System.out.println("How many questions missed?");
		int numMissed = sc.nextInt();		
		
		FinalExam exam = new FinalExam(numQuestions, numMissed);
		
		System.out.println("the grade for the exam is " + exam.getGrade());

	}

}
