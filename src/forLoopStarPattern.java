
public class forLoopStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=4;
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=(-2*i+9); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
