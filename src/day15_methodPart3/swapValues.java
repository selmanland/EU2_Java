package day15_methodPart3;

public class swapValues {

	public static void main(String[] args) {
		
		//solution 1 using 3rd variable
		
		int n1=10;
		int n2=20;
		int ntemp;
		
		/*ntemp=n2;
		n2=n1;
		n1=ntemp;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);*/
		
		//solution w/o using 3rd variable (ntemp)
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

	}

}
