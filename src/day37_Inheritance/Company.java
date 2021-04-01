package day37_Inheritance;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Tom";
		emp1.jobTitle = "SDET";
		emp1.age = 27;
		emp1.gender = 'M';
		
		emp1.work();
		
		emp1.eat("Salad");
		
//		emp1.attendClass(); error bc this method is in student class 
		
//		emp1 can have everything from Person class plus whatever inside Employee class
//		"is a" relationship is called as "inheritance"
//		when an "is a" relationship exists between objects, it means there is "inheritance"
//		super class -> sub class	||		base class -> derived class		||		parent class -> child class

	}

}
