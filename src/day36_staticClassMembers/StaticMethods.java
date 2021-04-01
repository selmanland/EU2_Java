package day36_staticClassMembers;

public class StaticMethods {

	static String name = "Apple";
	int age = 10;

	public static void show1() {
		// show2();						// RULE 1: u cannot call instance method/variable from static method directly
		show4();						// RULE 2: u can call static method from static method directly 
		System.out.println(name); 							// no error bc static variable
		// System.out.println(age);							// error bc instance variable

	}

	public void show2() {
		show1(); 						// RULE 3: u can call static from instance method directly
		System.out.println(name);
		System.out.println(age);

	}
	public void show3() {
		show2();
		show1();
		
	}
	public static void show4() {

	}

}
