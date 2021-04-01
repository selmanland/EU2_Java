package assignment4_ifStatements_SwitchStatements;

public class q10_caloriesFat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalNumberOfCalories = 30;
		double fatGrams = 5;
		double caloriesFromFat;
		@SuppressWarnings("unused")
		double percentageOfCaloriesFromFat;

		caloriesFromFat = fatGrams * 9;
		percentageOfCaloriesFromFat = caloriesFromFat / totalNumberOfCalories;

		if (caloriesFromFat > totalNumberOfCalories) {
			System.out.println("The input is invalid");
		} else {
			if (caloriesFromFat < (0.3 * totalNumberOfCalories)) {
				System.out.println("The food is low in fat ");
			}
		}

	}
}