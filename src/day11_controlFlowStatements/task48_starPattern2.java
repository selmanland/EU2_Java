package day11_controlFlowStatements;

public class task48_starPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=10;
		int column=1;
		
		for(int x=1; x<=row; x++) {
						
			for(int y=1; y<=column; y++) {
				System.out.print("*");
			}
			System.out.println();
			column+=1;
		}
		
		
	}

}
