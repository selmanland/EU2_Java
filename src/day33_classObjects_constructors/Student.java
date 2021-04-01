package day33_classObjects_constructors;

public class Student {

	String name; // creating instance variables here
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek";

//constructor

	public Student(String name, int age, char gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}

	public void attendLecture() {
		System.out.println(name + " is attending lecture");
	}

	public void submitAssignment() {
		System.out.println(name + " is attending assignment");
	}

	public void attendLab() {
		System.out.println(name + " is attending lab");
	}

}
