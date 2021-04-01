package variousExercise;

public class CarpetTest {

	public static void main(String[] args) {
		
		Floor fl = new Floor(12,10);
		Carpet ct = new Carpet(8);
		
		Calculator cl = new Calculator(fl,ct);
		System.out.println(cl.getTotalCost());

	}

}
