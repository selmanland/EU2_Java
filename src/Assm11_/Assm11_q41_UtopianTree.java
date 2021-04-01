package Assm11_;

public class Assm11_q41_UtopianTree {

	public static void main(String[] args) {
//		The Utopian Tree grows exactly 1 cm for the first three years, and after that, it grows by 2 cm every year, 
//		this is a simple implementation of the algorithm. You will need to use loops to create it. 
//		Show 10 years of growth of the Utopian Tree

		int sizeTree = 0;
		int years = 10;

		for (int i = 1; i <= years; i++) {
			if (i <= 3) {
				sizeTree++;
				System.out.println("year " + i + " growth 1 cm");
				System.out.println("tree size : " + sizeTree);
			} else {
				sizeTree += 2;
				System.out.println("year " + i + " growth 2 cm");
				System.out.println("tree size : " + sizeTree);
			}
		}
	}
}
