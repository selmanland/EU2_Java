package day40_accessmodifiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "M3";
		c.year = 2017;
//		c.door = 4;		// bc private in base no accessible
		c.engine = 5.3;

		System.out.println(c.toString());
	}

}
