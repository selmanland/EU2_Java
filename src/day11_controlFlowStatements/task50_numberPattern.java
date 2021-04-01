package day11_controlFlowStatements;

public class task50_numberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int row=5;
		int column=1;
		
		for(int x=1; x<=row; x++) {
						
			for(int y=1; y<=column; y++) {
				System.out.print(y+" ");
			}
			System.out.println();
			column+=1;
		
	}*/
		int rows=5;
		
		for(int x=1; x<=rows; x++) {
						
			for(int y=1; y<=x; y++) {
				System.out.print(y + " ");
			} 
			System.out.println();
				}
}
}