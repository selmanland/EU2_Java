package day36_staticClassMembers;

public class StaticInit {
	
	static final int NUM_SECONDS_PER_HOURS;
	
	static {
		System.out.println("Static init");	
		int numSecondPerMinute=60;
		int numMinutePerHour=60;
		NUM_SECONDS_PER_HOURS=numMinutePerHour*numSecondPerMinute;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;
	
	static {
		one=1;						// static block runs only once so int one initialized here
		two=2;						// static block runs only once so final two not complaining
//		three=4;					// complains bc we already initialized three above...
//		two=4;						// complains bc we already initialized two above...
	}
}
