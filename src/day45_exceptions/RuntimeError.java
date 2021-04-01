package day45_exceptions;

public class RuntimeError {

	public static void main(String[] args) {
		
		go();

	}

	public static void go() {
		System.out.println("going");
//		go();						//stack overflow error (Runtime Error)
	}

}
