package assignment9_;

public class Assm9_q13_RouteInstructions {

	public static void main(String[] args) {

		// Write a program that will print out route instructions. Your program should
		// take 2 parameters: start point and endpoint. Use left, right, up and down for
		// navigation. Insert ">" between commands. If start point equals to endpoint -
		// display: "start/end(start or end variable!) found".
		// Note: you may move only clockwise.

		// Java program to find if there is path
		// from top left to right bottom
						

		char startPoint = 'C';
		char endPoint = 'B';

		// char nextPoint = ' ';
		// boolean check = false;
		String output = "";

		if (startPoint == endPoint) {
			System.out.println(endPoint + " found ");
		}
		while (endPoint != startPoint) {
			if(startPoint=='A') {
				output += " right > ";
				startPoint = 'B';
			}else if(startPoint=='B') {
				output += " down > ";
				startPoint = 'C';
			}else if(startPoint=='C') {
				output += " left > ";
				startPoint = 'D';
			}else if(startPoint=='D') {
				output += " up > ";
				startPoint = 'A';
			}
		}
		System.out.print(output);
		System.out.println(endPoint + " found");

	}

}
