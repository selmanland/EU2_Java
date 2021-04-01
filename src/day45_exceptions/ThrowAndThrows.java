package day45_exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello World");
		
//		throw new RuntimeException("this is some exception");
		
		throw new Exception("Another exception");	//checked exception
		
		
	}
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		
		Thread.sleep(seconds);
	}

	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}
}
