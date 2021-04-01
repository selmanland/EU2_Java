
public class starDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=5;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=-1*i+5; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int l=1; l<=(rows-1); l++) {
			for (int space=1; space<=l; space++) {
				System.out.print(" ");
			}
			for (int m=1; m<=-2*l+9; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
