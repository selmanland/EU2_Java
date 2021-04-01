package day44_oop_practice.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL =  false;	// public static final 
	
	//abstract method
	void call(String contact);	// public abstract method
	
	//static method
	static void decline() {		// static method
		System.out.println("decline call");
	}	
		
	//default method
	public default void accept() {	// public abstract method
		System.out.println("accepts call");
	
	}				

}
