package day15_methodPart3;

public class fibonacci {

	public static void main(String[] args) {
		// fibonacci
		int rows=10;
		int pre1=0;
		int pre2=1;
				
		for(int i=1; i<=rows; i++) {
			
			System.out.print(pre2+ " ");
			int sum=pre1+pre2;
			pre1=pre2;
			pre2=sum;
						
		}

	}

}
