package day28_arrays_Lab4;

public class lab4_q4_methodArrayPrint {

	public static void main(String[] args) {
		// q4 array and print sum of elements in the array
		
		int [] x = {1,2,3};
		int [] y = {-4,2,0};
		
		int a = sum(x);		// this holds the sum of values in the array now
		System.out.println(a);	// we can print the sum 
		
		System.out.println("sum of values in the array is " + sum(x)); //or we can directly call the method inside print
		System.out.println("sum of values in the array is " + sum(y));
	}
	public static int sum(int[] arr) {
		
		int sum = 0;
		
		for(int value : arr) {
			sum = sum + value;
		}
		return sum;
		
	}

}
