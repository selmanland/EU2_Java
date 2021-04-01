package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog(); // object
		Dog dog2 = new Dog(); // object
		Dog dog3 = new Dog(); // object

		dog1.age = 10;
		dog1.color = "Red";
		dog1.breed = "Maltese";
		dog1.name = "Rover";

		dog2.age = 3;
		dog2.color = "White";
		dog2.name = "Chwawa";

		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);

		dog1.barking();
		dog1.hungry();
		dog1.sleeping();

		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.name);

		dog2.barking();
		dog2.hungry();
		dog2.sleeping();

		dog3.barking();
		dog3.hungry();
		dog3.sleeping();

	}

}
