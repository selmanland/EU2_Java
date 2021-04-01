package day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("abc", 35, 'F');

		System.out.println(p1.toString());
		
		// p1.age = -35;	// age is private, no access on any other classes
		
		System.out.println(p1.getAge());
		
		p1.setAge(47); 									// set the value through setter method
		System.out.println(p1.getAge());				// retrieve the value through getter method
		

		// encapsulation why need? we sometimes want to restrict access to some some variables, values 
		// so change public to private. Use set method to set the variable value (setter)
		// and can only access through method which is getter but now we can put any condition 
		// to restrict getting wrong values such as age = -35...
	}

}
