package assignment4_ifStatements_SwitchStatements;

public class q1_bodyMassIndex {

	public static void main(String[] args) {
		// BMI (Body Mass Index) calculation
		
		int weightPounds = 155;
		int heightFeet =4;
		int heightInches = 20;
		double weightKilos = weightPounds/2.2;
		double height = ((heightFeet*12) + (heightInches))*0.0254;
		double BMI = weightKilos / (height*height);
		
				
System.out.println("Your weight in pounds is: " + weightPounds);
System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " + heightInches);
System.out.println("Your BMI is " + BMI);

	if(BMI<18.5) {
		System.out.println("Your risk factory is Underweight");
	}else if(BMI>=18.5 && BMI<25) {
		System.out.println("Your risk factory is Normal Weight");
	}else if(BMI>=25 && BMI<30) {
		System.out.println("Your risk factory is Overweight");
	}else if(BMI>=30) {
		System.out.println("Your risk factory is Obese");
	}
	
	}
	}


