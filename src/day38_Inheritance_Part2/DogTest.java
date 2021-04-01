package day38_Inheritance_Part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");
		
		dog.eat();
		
//		here we say using dog object in Dog class check eat() method with no parameters, 
//		if there is no eat() method there check if there is a parent class and check if it is in there.
//		if finds there runs it...
		
		dog.chew();
		
		System.out.println("dog name is \"" + dog.getName() + "\"");
		
		dog.move(10);
		
	}

}
