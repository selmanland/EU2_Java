package day7_controlFlowStatements;

public class task25 {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1=60;
		n2=80;
		n3=70;
		if (n1>n2 && n1>n3) {
			System.out.println("The greatest number is " + n1);
	}
		if (n2>n1 && n2>n3) {
			System.out.println("The greatest number is " + n2);
		}

		if (n3>n1 && n3>n2) {
			System.out.println("The greatest number is " + n3);
		}
}
}