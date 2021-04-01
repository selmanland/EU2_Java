package day36_staticClassMembers;

public class Student {

	
	String name;
	int age;
	int idNumber;							// belongs to object
	static String school = "Cybertek";		// belongs to class...if changes are made to static variable,
											// all other instances will be changed as well...
	
	
	public Student(String name, int age, int idNumber) {
		
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
}
