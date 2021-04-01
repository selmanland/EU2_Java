package day34_constructors_passingObjectsToMethods;

import java.util.Random;

public class Dice {

	int sides;
	int value;

	public Dice(int numSides) {
		sides = numSides;
		roll();
	}

	public void roll() {
		Random rand = new Random();
		value = rand.nextInt(6) + 1;
	}

	public int getSides() {
		return sides;
	}

	public int getValue() {
		return value;
	}
}
