package day8_controlFlowStatements_Part2;

public class task35_findGreatestNumberNested {

	
		
		public static void main(String[] args) {
			
			int n1=4000;
			int n2=5000;
			int n3=6000;
			
			//find the greatest by using nested if 
			
			if(n1>n2 && n1>n3) {
				System.out.println("n1 is biggest");
			}else {
				if(n2>n3) {
					System.out.println("n2 is biggest");
				}else {
					System.out.println("n3 is biggest"); //n3>n2
				}
			}

}

}
