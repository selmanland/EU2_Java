package day24_arrays_part1;

public class task89_displayArray {

	public static void main(String[] args) {
		
		String[] shoppingList = {"cheese", "pumpkin", "bread", "eggs", "milk", "almonds", "juice", "butter"};
		
		for(int i=0; i<shoppingList.length; i++) {
			System.out.println("\"" + shoppingList[i] + "\"");
		}

	}

}
