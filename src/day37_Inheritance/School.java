package day37_Inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 35;
		person.gender = 'M';
		
		student.name = "Smith";	// come from person class which is inherited
		student.age = 30;
		student.gender = 'M';
		
		student.studentID = 1000;

		person.eat("Steak");
		student.eat("Pizza");
		
//		person.code("Java");  Error bc no code method inherited from Person class. it is in student class...
//		if anything changes in one class, it is not efficient way to change that one thing from all classes one by one...
//		"is a" relationship is called as "inheritance"
	}

}
