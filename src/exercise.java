
public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=(-1*i+5); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int line=5;
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=-1*i+6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
