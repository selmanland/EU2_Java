package day14_methods_Part2;

public class task67_lastDigit {

	public static void main(String[] args) {
		
		int num1= lastDigit(197, 157);
		
		
	}
	public static int lastDigit(int num1, int num2) {
		
		if(num1<10) {
			num1=num1;
		}else {
			num1=num1%10;
		}	
		if(num2<10) {
			num2=num2;
		}else {
			num2=num2%10;
		}
		System.out.println(num1 + " " + num2);
		
		if(num1==num2) {
			System.out.println("last digits are the SAME");
		}else {
			System.out.println("last digits are NOT the SAME");
		}
		
		return num1;
		
		
	}

}
