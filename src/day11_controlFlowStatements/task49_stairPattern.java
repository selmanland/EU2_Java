package day11_controlFlowStatements;

public class task49_stairPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=7;
				
		for(int x=1; x<=rows; x++) {
						
			for(int y=1; y<=x; y++) {
				System.out.print(" ");
			} 
			System.out.println("#");
				}
	}

}
