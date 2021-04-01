package assignment4_ifStatements_SwitchStatements;

public class q11_speedOfSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double speedOfSound = 0, distance;
		@SuppressWarnings("unused")
		double time = 0;
		String medium = "Water";
		distance = 19900;
		time = distance / speedOfSound;

		switch (medium) {

		case "Air":
			speedOfSound = 1100;
			System.out.println("The amount of time it will take feet per second is : " + (distance / speedOfSound));
			break;

		case "Water":
			speedOfSound = 4900;
			System.out.println("The amount of time it will take feet per second is : " + (distance / speedOfSound));
			break;

		case "Steel":
			speedOfSound = 16400;
			System.out.println("The amount of time it will take feet per second is : " + (distance / speedOfSound));
			break;

		default:
			System.out.println("Invalid Entry");
		}
	}
}
