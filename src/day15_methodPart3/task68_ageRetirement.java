package day15_methodPart3;

public class task68_ageRetirement {

	public static void main(String[] args) {

		yearsUntilRetirement("Halim", 1973);

	}

	private static void yearsUntilRetirement(String name, int year) {
		// retirement age = 65 - age

		int retirementAge = 65 - calculateAge(year);
		System.out.println(name + " retires in " + retirementAge + " years");

	}

	public static int calculateAge(int yearBirth) {

		return 2020 - yearBirth;
	}

}
