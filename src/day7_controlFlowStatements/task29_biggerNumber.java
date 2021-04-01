package day7_controlFlowStatements;

public class task29_biggerNumber {

	public static void main(String[] args) {
		// Declare and initialize 2 variable numbers.
		// Program should tell which number is bigger
		
		int num1, num2;
		num1=5;
		num2=20;
		
		if(num1>num2) {
			System.out.println("num1 " + "\"" + num1 + "\"" + " is greater than num2 " + "\"" + num2 + "\"");
	}else {
		System.out.println("num2 " + "\""+ num2 + "\"" + " is greater than num1 " + "\"" + num1 + "\"");
	}

}
}