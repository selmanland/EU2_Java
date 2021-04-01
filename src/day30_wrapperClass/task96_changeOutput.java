package day30_wrapperClass;

import java.util.Arrays;

public class task96_changeOutput {

	public static void main(String[] args) {
		// Write a program to output: 72 degree is equal to 22.22 celcius
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] arr = str1.split(" and ");		// split and get it start from 72 
		System.out.println(arr[1]);
		
		arr = arr[1].split(" degree");			// split again to get the number portion
		System.out.println(Arrays.toString(arr));
		
		String degreeF = arr[0];					// get the number
		System.out.println(degreeF);
		
		double tempF = Double.valueOf(degreeF); // can use Double.parseDouble(degreeF) also here
		System.out.println(tempF);
		
		double tempC = (tempF-32)*5/9;
		System.out.println(tempF + " degree is equal to " + Math.round(tempC) + " celcius");

	}

}
