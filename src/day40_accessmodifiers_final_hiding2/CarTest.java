package day40_accessmodifiers_final_hiding2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
//		c.model = "M3";		// default
		c.year = 2017;		// public
//		c.door = 4;			// private
//		c.engine = 5.3;		// protected	no inheritance no is-a relationship so not accessible

		
	}

}
