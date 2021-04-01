package exercises;

public class CarpetTest2 {

	public static void main(String[] args) {

		Floor fl = new Floor(12, 10);
		Carpet c = new Carpet(8);

		Calculator cal = new Calculator(fl, c);
		
		System.out.println(cal.getTotalCost());

	}

}
