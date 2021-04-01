package day34_constructors_passingObjectsToMethods;

public class CarpetTest {

	public static void main(String[] args) {

		Floor fl = new Floor(10, 12);
		Carpet c1 = new Carpet(8);
		
		Calculator cal = new Calculator(fl, c1);
		
		System.out.println(cal.getTotalCost());

	}

}
