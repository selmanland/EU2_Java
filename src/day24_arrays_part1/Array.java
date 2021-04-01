package day24_arrays_part1;

public class Array {

	public static void main(String[] args) {
		
		int[] myList = {10,20,30,40,50,60,70,80};		
		System.out.println(myList[0]);
		System.out.println(myList[2]);
		System.out.println(myList[6]);
		
		String [] myArray = {"Apple", "Orange", "Lemon", "Banana", "Coconut"};		
		System.out.println(myArray[0]);
		System.out.println(myArray[3]);		
		System.out.println("=====================");
		
		System.out.println(myArray.length);
		System.out.println(myList.length);
		System.out.println("=====================");
		
		for(int i=0; i<myList.length; i++) {
			System.out.print(myList[i] + " ");
		}		
		

	}

}
