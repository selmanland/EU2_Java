package day37_Inheritance;

public class FinalExam extends GradeActivity {

	@SuppressWarnings("unused")
	private int numQuestions;
	private double pointsEach;
	
	@SuppressWarnings("unused")
	private int numMissed;

	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		// our goal is to receive the letter based on my numericscore
		// how I will set my numericScore to score?
		
		setScore(numericScore);		// assign score to set the value then we can get it by getter method
		
	}

}
