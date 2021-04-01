package day43_polymorphism_Exercise;

public abstract class Animal implements Mammal {
	
	public void eat() {
        System.out.println("Animal Eating...");
    }
 
    public void move() {
        System.out.println("Animal Moving...");
    }
 
    public void sleep() {
        System.out.println("Animal Sleeping...");
    }

}
