package exercises;

public class PolyTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Animal anim = (Animal) dog;
		anim.eat();					// Output: "Dog is eating..." bc upcasted to Animal

//		Upcasting...
//		Here, we cast the Dog type to the Animal type. (Animal) dog
//		Because Animal is the supertype of Dog, this casting is called upcasting.
//		Only the reference type gets changed...
		
		
		Animal anim2 = new Cat();
		Cat cat = (Cat) anim2;
		cat.eat();						// Output: Eating...(Not "Cat is eating" bc reference Animal)
		
//		Here, we cast the Animal type to the Cat type.
//		As Cat is subclass of Animal, this casting is called downcasting.
		
	}
	
	

}
