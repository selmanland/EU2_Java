package day43_polymorphism_Exercise;

public class AnimalTest {

	public static void main(String[] args) {

//		Dog dog = new Dog();
//		dog.eat();
//
//		// Animal anFirst = new Animal();	//Cannot instantiate the type Animal bc abstract
//		
//		Animal anim = (Animal) dog;	// we cast the Dog type to the Animal type.
//									// Bc Animal is the super-type of Dog, this casting is called up-casting
//				
//		anim.eat();
//		
//		// Note that the actual object type does not change because of casting. 
//		// The Dog object is still a Dog object. Only the reference type gets changed...
//		// Output : Dog is eating…
//
//		anim.move();
//		dog.move();
//		
//		
		Mammal mam = new Cat();
		Animal anim2 = new Dog();
		mam.eat();
		mam.move();
		anim2.move();
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		 
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(dog);
		trainer.teach(cat);
		
	}
}