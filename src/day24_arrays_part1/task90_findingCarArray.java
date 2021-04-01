package day24_arrays_part1;

public class task90_findingCarArray {

	public static void main(String[] args) {

		String car[] = { "Honda", "Toyota", "Mercedes", "BMW", "Opel", "Audi" };

		String user = "Honda";

		boolean flag = false;

		for (int i = 0; i < car.length; i++) {
			if (user.equalsIgnoreCase(car[i])) {
				flag = true;
				break;
			}
		}

		if (flag == true) {
			System.out.println("I found your car \"" + user + "\" in this array");

		} else {
			System.out.println("I could NOT FIND your car \"" + user + "\" in this array");

		}
	}

}
