package day12_controlFlowStatements_Part6;

public class breakContinue {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			if(i==4) {
				//break; if use break stop at 3 
				continue;//if use continue skip 4 and execute 5
			}
			System.out.println(i);
		}

	}

}
