package day42_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; 	// public static final even did not put
	
	public abstract void charge();
	
	void charge2(); 					// public abstract even did not write it
										// public is default for interfaces
	
	public default void methodA() {		// default here is method type with body
		// code
	}

}
