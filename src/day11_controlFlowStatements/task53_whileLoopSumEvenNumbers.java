package day11_controlFlowStatements;

public class task53_whileLoopSumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int sumEven=0;
		
		while(i<=100) {
			
			if(i%2==0) {				
				sumEven=i+sumEven;
			}			
			i++;				
		}		
		System.out.println(sumEven);		
		}
		
}
