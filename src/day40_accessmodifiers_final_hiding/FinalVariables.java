package day40_accessmodifiers_final_hiding;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME; //where this variable will be initialized?

	public FinalVariables() {

		MODEL_3_MAXSPEED = 200;
		//ADMIN_USERNAME="MIKE";  //WHY ERROR 
	}

	{
		MODEL_X_PASSENGERS = 7;
		//ADMIN_USERNAME = "MIke";
		
	}

	static {

		 ADMIN_USERNAME = "MIke";

	}

	public static void main(String[] args) {

		final int MAX_PERSSENGERS_COUNT = 5;

		final int SSN;
		SSN=66;
		//SSN++;

		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);

		mA();
	}

	public static void mA() {
		
	}

}
