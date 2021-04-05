package assignment7_nestedForLoop;

public class q6_numberTrianglePattern {

	public static void main(String[] args) {
/**
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
 */
		
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			int temp = i;

			for (int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp = temp + rows - j;
			}
			System.out.println();
		}

	}

}
