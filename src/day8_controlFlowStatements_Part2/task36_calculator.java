package day8_controlFlowStatements_Part2;

public class task36_calculator {

	public static void main(String[] args) {
		
		int num1=8;
		int num2=2;
		String operator="+";
		int result=0;
		
		switch (operator) {
		
		case "+":
			result = num1 + num2;
			break;
			
		case "-":
			result = num1 - num2;
			break;		
			
		case "*":
			result = num1 * num2;
			break;		
			
		case "/":
			result = num1 / num2;
			break;		
			
		default:
			System.out.println("Invalid Operator");
		}
System.out.println("Result is : " + result);
	}

}
