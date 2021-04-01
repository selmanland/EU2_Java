package day35_encapsulation;

public class Person {

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

									// instance variables
	private String name;
	private int age; 				// how i can restrict this access?
	private char gender;

	public Person(String name, int age, char gender) {	// constructor
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setAge(int age) {		//we set the age here so use void no need to return anything
		this.age = age; 				//can put any condition here right now
		
	}

	public int getAge() {				//we get the age 
		return age;
	}
}
// Encapsulation
// Hide the data
//		- private
// - public setter method
// - public getter method
// access modifiers >>> public, private, protected, default

// encapsulation why need? we sometimes want to restrict access to some some variables, values 
// so change public to private. Use set method to set the variable value (setter)
// and can only access through method which is getter but now we can put any condition 
// to restrict getting wrong values such as age = -35...