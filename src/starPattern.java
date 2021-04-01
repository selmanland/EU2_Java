
public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		
		for (int i=1; i<=rows; i++) {
			for(int space=1; space<=-1*i+5; space++) {
				System.out.print(" ");
			}
			for(int star=1; star<=i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
