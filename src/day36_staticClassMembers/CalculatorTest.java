package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {

		double result = Calculator.plus(55, 7); 		// static way
		System.out.println("result:" + result);

		Calculator c = new Calculator();
		System.out.println("result: " + c.plus(55, 7));

		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		

		CalculatorTest.m1();							//1st way to call method m1

		CalculatorTest C1 = new CalculatorTest();
		C1.m1();										//2nd way to call method m1

		m1();											//3rd way to call method m1

	}

	public static void m1() {
		System.out.println("hello");
	}
}
