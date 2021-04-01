package day38_Inheritance_Part2;

public class Student extends Person {

	@Override
	public void message() {
		System.out.println("This is student class");
	}

	public void display() {
		message();
		super.message();
	}
	
}
