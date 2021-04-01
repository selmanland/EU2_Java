package day13_methods_Part1;

public class task65_averageGrade {

	public static void main(String[] args) {
		
		displayGrade(90, 80, 90);

	}
	public static void displayGrade(int grade1, int grade2, int grade3) {
		int averageGrade=(grade1 + grade2 + grade3)/3;
		
		if(grade1<0 || grade1>100) {
			System.out.println("invalid entry");
		}else if (grade2<0 || grade2>100) {
			System.out.println("invalid entry");
		}else if (grade3<0 || grade3>100) {
			System.out.println("invalid entry");
		}else if(averageGrade>=90 && averageGrade<=100) {
			System.out.println("Based on grades (" + grade1 + ", " + grade2 + ", " + grade3 + ") => Your grade is \"A\"");
		}else if(averageGrade>=80 && averageGrade<=89) {
			System.out.println("Based on grades (" + grade1 + ", " + grade2 + ", " + grade3 + ") => Your grade is \"B\"");
		}else if(averageGrade>=70 && averageGrade<=79) {
			System.out.println("Based on grades (" + grade1 + ", " + grade2 + ", " + grade3 + ") => Your grade is \"C\"");
		}else if(averageGrade>=60 && averageGrade<=69) {
			System.out.println("Based on grades (" + grade1 + ", " + grade2 + ", " + grade3 + ") => Your grade is \"D\"");
		}else if(averageGrade>=0 && averageGrade<=59) {
			System.out.println("Based on grades (" + grade1 + ", " + grade2 + ", " + grade3 + ") => Your grade is \"F\"");
		}else {
			System.out.println("invalid entry");
		}
	}

}
