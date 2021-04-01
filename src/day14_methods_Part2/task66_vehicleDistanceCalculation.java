package day14_methods_Part2;

public class task66_vehicleDistanceCalculation {

	public static void main(String[] args) {

		double road = distance(55, 2);
		
		if(road>100) {
			System.out.println("time to rest \"15 mins\" because you have gone " + road + " miles now");
		}

	}

	public static double distance(double speed, int time) {

		double totalTravel = speed * time;

		return (int) totalTravel;

	}

}
