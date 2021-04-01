package day36_staticClassMembers;

import static java.lang.Math.*; 				// import all static properties belong to Math class

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(16));			// can directly call bc above imported all and bc static
		
		System.out.println(PI);					// can directly call bc static

	}

}
