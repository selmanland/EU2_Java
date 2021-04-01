package day40_accessmodifiers_final_hiding2;

import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car {
	
	public Car2() {
		super();
//		model = "M3";	// default so no access
		year = 2017;	// public
//		door = 4;		// private so no access
		engine = 5.3;	// protected bc another package but subclass so accessible
		
	}
	
}
