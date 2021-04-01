package assignment6_forLoop;

public class q4_sumNumberUpperBound {

	public static void main(String[] args) {
		// sum of numbers with upper bound
		
		int upperNum=8;
		int n=0;
		int sum=0;
		
		while(n<=upperNum) {
			sum=sum + n;
			n++;
		}
		System.out.println("sum of numbers up to \"" + upperNum + "\" is \"" + sum + "\".");
	}

}
