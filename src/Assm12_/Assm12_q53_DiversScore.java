package Assm12_;

import java.util.Scanner;

public class Assm12_q53_DiversScore {

	public static void main(String[] args) {
		// Diver's score from 0-10

		float[] score = new float[7];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			System.out.println("Enter the score of judge " + (i + 1) + " (0-10) : ");
			score[i] = sc.nextFloat();
		}

		float difficulty;
		System.out.println("Please enter the difficulty level from 1.2 to 3.8 : ");
		difficulty = sc.nextFloat();

		float minScore = score[0];
		float maxScore = score[0];
		float total = 0;

		for (int i = 0; i < 7; i++) {
			if (score[i] < minScore) {
				minScore = score[i];
			}
			if (score[i] > maxScore) {
				maxScore = score[i];
			}
			total += score[i];
		}

		total = total - minScore - maxScore;

		total *= difficulty;
		total *= 0.6;

		System.out.printf("Total:%.2f",total);

	}

}
