package exercises;

public class ex2 {

	public static void main(String[] args) {
		
/*
Write a program that outputs the number of hours, minutes, and seconds that 
corresponds to input total seconds.

	-Declare int variables inputSeconds, hours, minutes, seconds
	-Initialize the inputSeconds 
*/
	
		int inputSeconds, hours, minutes, seconds;
		inputSeconds = 15895;
		
		hours = inputSeconds / 60 / 60;
		minutes = (inputSeconds / 60) % 60;
		seconds = inputSeconds % 60;
		
		System.out.println(inputSeconds + " seconds => " + hours + " hours " + minutes + " minutes and " + seconds + " seconds.");
	
	}
	

}
