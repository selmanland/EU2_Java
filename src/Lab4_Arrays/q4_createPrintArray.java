package Lab4_Arrays;

public class q4_createPrintArray {

	// q4 Write a method that accepts an array and prints the sum of all elements in the array

		public static void main(String[] args) {
			
		/**
		 * Here think like this: What are the steps that I should follow to write my
		 * code for solution? 1- I will create my int array, 2- I will create a method.
		 * In the method, I will pass my array as an argument and return type may be
		 * void since the question says print the sum only, 3- In the method, I need to
		 * go over the each array element one by one because I will add each element one
		 * by one, 4- Since the question says each element in the array, I do not need
		 * index of array elements So, I can use both for loop and/or for-each loop, 5-
		 * In the loop, I will need an empty bucket/variable (int sum) to add all array
		 * elements and store them in, 6- I will print the sum value at the end.
		 * 
		 */
			
			int[] x = {1,2,3};		
			int[] y = {-4,2,0};		
			
			sum(x);		
			sum(y);		

		}	
		public static void sum(int[] array) {
			
			int sum = 0;
			
			for(int each :array ) {			
				sum += each;			
			}
			System.out.println(sum);
			
		}

	}
