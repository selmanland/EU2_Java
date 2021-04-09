package assignment3_arithmeticOperators;

public class assignment3_Q5_withMethod {

	public static void main(String[] args) {

/*
Write a program that outputs the number of hours, minutes, and seconds that 
corresponds to input total seconds.

	-Declare int variables inputSeconds, hours, minutes, seconds
	-Initialize the inputSeconds 
*/

		calculateTime(13695);
				

	}
	public static void calculateTime(int timeInSeconds) {
		
		int inputSeconds, hours, minutes, seconds, remain;
		
		inputSeconds = timeInSeconds;
		hours = inputSeconds / (60*60);
		remain = inputSeconds % (hours*60*60);
		minutes = remain / 60;
		remain = remain - (minutes*60);
		seconds = remain;
				
		System.out.println("inputSecond is " + inputSeconds + " seconds equals to:");
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds...");
	}

}
