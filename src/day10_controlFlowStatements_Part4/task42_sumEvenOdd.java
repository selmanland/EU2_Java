package day10_controlFlowStatements_Part4;

public class task42_sumEvenOdd {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=0; i<100; i++) {
			if(i%2==0) {
				sumEven=sumEven + i;
				
			}else {
				sumOdd=sumOdd + i;
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
